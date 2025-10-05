import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class IPCalculator extends JFrame {
    private JTextField ipAddressField, subnetMaskField, networkIDField;
    private JTextField binaryIPField, binaryMaskField, binaryNetworkIDField;
    private JTextField ipClassField, addressTypeField, goodForHostField;
    private JTextField subnetworksField, hostsField, rangeField;
    private DefaultListModel<String> networkListModel;
    private JList<String> networkList;

    public IPCalculator() {
        setTitle("IP Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLayout(new GridLayout(2, 2, 10, 10));

        // Panel for IP Information
        JPanel ipInfoPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        ipInfoPanel.setBorder(BorderFactory.createTitledBorder("IP Information"));
        ipInfoPanel.add(new JLabel("IP Address:"));
        ipAddressField = new JTextField("10.70.6.1");
        ipInfoPanel.add(ipAddressField);

        ipInfoPanel.add(new JLabel("Subnet Mask:"));
        subnetMaskField = new JTextField("255.255.255.0");
        ipInfoPanel.add(subnetMaskField);

        ipInfoPanel.add(new JLabel("Network ID:"));
        networkIDField = new JTextField();
        networkIDField.setEditable(false);
        ipInfoPanel.add(networkIDField);

        JButton defaultMaskButton = new JButton("Default Mask");
        JButton computeButton = new JButton("Compute Now");
        ipInfoPanel.add(defaultMaskButton);
        ipInfoPanel.add(computeButton);

        // Panel for Binary Information
        JPanel binaryPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        binaryPanel.setBorder(BorderFactory.createTitledBorder("Binary Information"));
        binaryPanel.add(new JLabel("IP Address:"));
        binaryIPField = new JTextField();
        binaryIPField.setEditable(false);
        binaryPanel.add(binaryIPField);

        binaryPanel.add(new JLabel("Mask:"));
        binaryMaskField = new JTextField();
        binaryMaskField.setEditable(false);
        binaryPanel.add(binaryMaskField);

        binaryPanel.add(new JLabel("Network ID:"));
        binaryNetworkIDField = new JTextField();
        binaryNetworkIDField.setEditable(false);
        binaryPanel.add(binaryNetworkIDField);

        // Panel for Network Information
        JPanel networkInfoPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        networkInfoPanel.setBorder(BorderFactory.createTitledBorder("Network Information"));
        networkInfoPanel.add(new JLabel("IP Address Class:"));
        ipClassField = new JTextField();
        ipClassField.setEditable(false);
        networkInfoPanel.add(ipClassField);

        networkInfoPanel.add(new JLabel("Address Type:"));
        addressTypeField = new JTextField();
        addressTypeField.setEditable(false);
        networkInfoPanel.add(addressTypeField);

        networkInfoPanel.add(new JLabel("Good IP For Host:"));
        goodForHostField = new JTextField();
        goodForHostField.setEditable(false);
        networkInfoPanel.add(goodForHostField);

        networkInfoPanel.add(new JLabel("Reason:"));
        JTextField reasonField = new JTextField();
        reasonField.setEditable(false);
        networkInfoPanel.add(reasonField);

        // Panel for Subnetting Information
        JPanel subnettingPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        subnettingPanel.setBorder(BorderFactory.createTitledBorder("Subnetting Information"));
        subnettingPanel.add(new JLabel("# of Subnetworks:"));
        subnetworksField = new JTextField();
        subnetworksField.setEditable(false);
        subnettingPanel.add(subnetworksField);

        subnettingPanel.add(new JLabel("# of Hosts:"));
        hostsField = new JTextField();
        hostsField.setEditable(false);
        subnettingPanel.add(hostsField);

        subnettingPanel.add(new JLabel("Range:"));
        rangeField = new JTextField();
        rangeField.setEditable(false);
        subnettingPanel.add(rangeField);

        subnettingPanel.add(new JLabel("Network ID's:"));
        networkListModel = new DefaultListModel<>();
        networkList = new JList<>(networkListModel);
        subnettingPanel.add(new JScrollPane(networkList));

        // Add panels to the frame
        add(ipInfoPanel);
        add(binaryPanel);
        add(networkInfoPanel);
        add(subnettingPanel);

        // Button Actions
        defaultMaskButton.addActionListener(e -> subnetMaskField.setText("255.255.255.0"));
        computeButton.addActionListener(new ComputeAction());
    }

    // Action Listener to handle Compute button
    private class ComputeAction implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String ipAddress = ipAddressField.getText();
                String subnetMask = subnetMaskField.getText();
                InetAddress address = InetAddress.getByName(ipAddress);

                // Calculate network ID
                String binaryIP = toBinaryString(ipAddress);
                String binaryMask = toBinaryString(subnetMask);
                String binaryNetworkID = calculateNetworkID(binaryIP, binaryMask);

                networkIDField.setText(binaryToDecimal(binaryNetworkID) + "/" + calculateCIDR(subnetMask));
                binaryIPField.setText(binaryIP);
                binaryMaskField.setText(binaryMask);
                binaryNetworkIDField.setText(binaryNetworkID);

                // Determine IP class
                ipClassField.setText(determineIPClass(ipAddress));

                // Update subnet information
                updateSubnetInfo(binaryNetworkID, subnetMask);

                goodForHostField.setText(isGoodHostIP(binaryIP, binaryMask) ? "Yes" : "No");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(IPCalculator.this, "Invalid input: " + ex.getMessage());
            }
        }

        private void updateSubnetInfo(String binaryNetworkID, String subnetMask) {
            // Placeholder logic for subnetting; add actual implementation here
            subnetworksField.setText("0");
            hostsField.setText("254");
            rangeField.setText("1");

            networkListModel.clear();
            networkListModel.addElement(binaryToDecimal(binaryNetworkID));
        }
    }

    // Helper methods for IP calculations
    private String toBinaryString(String ipAddress) {
        String[] octets = ipAddress.split("\\.");
        StringBuilder binary = new StringBuilder();
        for (String octet : octets) {
            binary.append(String.format("%8s", Integer.toBinaryString(Integer.parseInt(octet))).replace(' ', '0')).append(".");
        }
        return binary.substring(0, binary.length() - 1);
    }

    private String calculateNetworkID(String binaryIP, String binaryMask) {
        StringBuilder networkID = new StringBuilder();
        for (int i = 0; i < binaryIP.length(); i++) {
            networkID.append(binaryIP.charAt(i) == '1' && binaryMask.charAt(i) == '1' ? '1' : '0');
        }
        return networkID.toString();
    }

    private int calculateCIDR(String subnetMask) {
        String binaryMask = toBinaryString(subnetMask).replace(".", "");
        return binaryMask.replace("0", "").length();
    }

    private String determineIPClass(String ipAddress) {
        int firstOctet = Integer.parseInt(ipAddress.split("\\.")[0]);
        if (firstOctet < 128) return "A";
        if (firstOctet < 192) return "B";
        if (firstOctet < 224) return "C";
        return "D/E";
    }

    private boolean isGoodHostIP(String binaryIP, String binaryMask) {
        // Placeholder for host IP check logic
        return true;
    }

    private String binaryToDecimal(String binary) {
        String[] octets = binary.split("\\.");
        StringBuilder decimal = new StringBuilder();
        for (String octet : octets) {
            decimal.append(Integer.parseInt(octet, 2)).append(".");
        }
        return decimal.substring(0, decimal.length() - 1);
    }
}

class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            IPCalculator app = new IPCalculator();
            app.setVisible(true);
        });
    }
}