import java.util.*;
import java.io.*;

public class CountMentionsApp {

    public static int[] countMentions(int numberOfUsers, List<List<String>> events) {
        // result array
        int[] messages = new int[numberOfUsers];

        // sort events by timestamp (events: [type, timestamp, payload])
        Collections.sort(events, (a, b) -> Integer.compare(
                Integer.parseInt(a.get(1)),
                Integer.parseInt(b.get(1))
        ));

        // online status and offline-until timestamps
        ArrayList<Boolean> online = new ArrayList<>(numberOfUsers);
        ArrayList<Integer> offlineUntil = new ArrayList<>(numberOfUsers);
        for (int j = 0; j < numberOfUsers; j++) {
            online.add(true);          // initially online
            offlineUntil.add(0);       // 0 means not offline currently
            messages[j] = 0;
        }

        for (List<String> curr : events) {
            String type = curr.get(0);
            int timestamp = Integer.parseInt(curr.get(1));
            String payload = curr.size() > 2 ? curr.get(2) : "";

            if ("MESSAGE".equals(type)) {
                // payload expected: "id1,id2,..." (comma separated)
                if (!payload.isEmpty()) {
                    String[] parts = payload.split(",");
                    for (String p : parts) {
                        p = p.trim();
                        if (p.isEmpty()) continue;
                        int id;
                        try {
                            id = Integer.parseInt(p);
                        } catch (NumberFormatException ex) {
                            continue; // skip invalid ids
                        }
                        if (id < 0 || id >= numberOfUsers) continue;

                        if (online.get(id)) {
                            messages[id] = messages[id] + 1;
                        } else {
                            // if the message timestamp is after or equal to offline-until,
                            // treat user as back online and count the mention
                            if (timestamp >= offlineUntil.get(id)) {
                                messages[id] = messages[id] + 1;
                                online.set(id, true);
                                offlineUntil.set(id, 0);
                            }
                        }
                    }
                }
            } else if ("OFFLINE".equals(type)) {
                // payload expected: single id
                if (!payload.isEmpty()) {
                    int id;
                    try {
                        id = Integer.parseInt(payload.trim());
                    } catch (NumberFormatException ex) {
                        continue; // skip invalid
                    }
                    if (id < 0 || id >= numberOfUsers) continue;

                    // user goes offline; set offline-until to timestamp + 60 and set online=false
                    online.set(id, false);
                    offlineUntil.set(id, timestamp + 60);
                }
            }
            // ignore other event types if any
        }

        return messages;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Read number of users and number of events
        if (!sc.hasNextInt()) {
            System.err.println("Expected numberOfUsers");
            return;
        }
        int numberOfUsers = sc.nextInt();

        if (!sc.hasNextInt()) {
            System.err.println("Expected numberOfEvents");
            return;
        }
        int numberOfEvents = sc.nextInt();
        sc.nextLine(); // consume endline

        List<List<String>> events = new ArrayList<>(numberOfEvents);

        for (int i = 0; i < numberOfEvents; i++) {
            if (!sc.hasNextLine()) break;
            String line = sc.nextLine().trim();
            if (line.isEmpty()) { i--; continue; }

            // Split into three parts: type, timestamp, payload (payload may contain commas)
            String[] tokens = line.split("\\s+", 3);
            List<String> ev = new ArrayList<>();
            if (tokens.length >= 1) ev.add(tokens[0].trim());
            if (tokens.length >= 2) ev.add(tokens[1].trim());
            if (tokens.length == 3) ev.add(tokens[2].trim());
            events.add(ev);
        }

        int[] result = countMentions(numberOfUsers, events);

        // Print results space-separated
        StringJoiner sj = new StringJoiner(" ");
        for (int v : result) sj.add(String.valueOf(v));
        System.out.println(sj.toString());

        sc.close();
    }
}
