package soccer;

public class League {

    public static void main(String[] args) {

        // Team 1
        Player player1 = new Player();
        player1.playerName = "George Eliot";
        Player player2 = new Player();
        player2.playerName = "Graham Greene";
        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";
        Player[] thePlayers = {player1, player2, player3};

        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;

        // Team 2
        Team team2 = new Team();
        team2.teamName = "The Reds";
        team2.playerArray = new Player[4];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        team2.playerArray[3] = new Player();
        team2.playerArray[3].playerName = "Marty Sabanini";

        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.playerArray[2];
        goal1.theTeam = currGame.homeTeam;
        goal1.theTime = 55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        System.out.println("Goal scored after " +
                currGame.goals[0].theTime + " mins by " +
                currGame.goals[0].thePlayer.playerName + " of " +
                currGame.goals[0].theTeam.teamName);

        // Find a player in team2 with the last name beginning with "Sab"
        for (Player thePlayer : team2.playerArray) {
            if (thePlayer.playerName.matches(".*Sab.*")) {
                System.out.println("Found: " + thePlayer.playerName);
                thePlayer.playerName.split(" ");
                System.out.println("Last name is " + thePlayer.playerName.split(" ")[1]);
            }
        }
    }
}