// Sample data for multiple players (for demonstration purposes)
var playersData = [
    {
        playerName: "Virat Kohli",
        team: "India",
        country: "India",
        role: "Batsman",
        stats: {
            matches: 254,
            runs: 12169,
            wickets: 4,
            bestBowling: "1/7",
            average: 59.07
        }
    },
    {
        playerName: "Steve Smith",
        team: "Australia",
        country: "Australia",
        role: "Batsman",
        stats: {
            matches: 147,
            runs: 7540,
            wickets: 17,
            bestBowling: "2/14",
            average: 41.41
        }
    },
    // Add more player data here...
];

// Function to update live stats
function updateLiveStats() {
    // Iterate through each player
    playersData.forEach(function(playerData) {
        // Simulate live updates by generating random values
        playerData.stats.matches += Math.floor(Math.random() * 3); // Increment matches played
        playerData.stats.runs += Math.floor(Math.random() * 50); // Increment runs scored
        playerData.stats.wickets += Math.floor(Math.random() * 2); // Increment wickets taken
        // Update best bowling with a new random value (for simplicity)
        var overs = Math.floor(Math.random() * 10) + 1;
        var wickets = Math.floor(Math.random() * 3);
        playerData.stats.bestBowling = overs + "/" + wickets;
        // Recalculate average (for demonstration, you might need a real formula)
        playerData.stats.average = (playerData.stats.runs / playerData.stats.matches).toFixed(2);
    });

    // Update stats in the HTML document
    var playersContainer = document.getElementById("players");
    playersContainer.innerHTML = ""; // Clear previous content

    playersData.forEach(function(playerData) {
        var playerDiv = document.createElement("div");
        playerDiv.classList.add("player");

        var playerProfile = "<h2>" + playerData.playerName + "</h2>";
        playerProfile += "<p><strong>Team:</strong> " + playerData.team + "</p>";
        playerProfile += "<p><strong>Country:</strong> " + playerData.country + "</p>";
        playerProfile += "<p><strong>Role:</strong> " + playerData.role + "</p>";
        playerDiv.innerHTML = playerProfile;

        var playerStats = "<div class='player-stats'>";
        playerStats += "<h3>Stats</h3>";
        playerStats += "<table>";
        playerStats += "<tr><th>Matches</th><th>Runs</th><th>Wickets</th><th>Best Bowling</th><th>Average</th></tr>";
        playerStats += "<tr><td>" + playerData.stats.matches + "</td><td>" + playerData.stats.runs + "</td><td>" + playerData.stats.wickets + "</td><td>" + playerData.stats.bestBowling + "</td><td>" + playerData.stats.average + "</td></tr>";
        playerStats += "</table>";
        playerStats += "</div>";
        playerDiv.innerHTML += playerStats;

        playersContainer.appendChild(playerDiv);
    });
}

// Update live stats every 5 seconds
setInterval(updateLiveStats, 5000);

// Initial display of stats
updateLiveStats();
