import java.util.Random;

public class MonopolyGame {
    private Player[] players;
    private Dice[] dices;
    private static int roundCnt = 0;

    public void playGame() {
        Random r = new Random();
        int nbPlayersMin = 2;
        int nbPlayersMax = 8;
        int nbPlayers = r.nextInt(nbPlayersMax - nbPlayersMin) + nbPlayersMin;
        players = generatePlayers(nbPlayers);

        int nbDices = 2;
        int nbSides = 6;
        dices = generateDices(nbDices, nbSides);

        int nbRounds = 20;
        for(int i = 0; i < nbRounds; i++) {
            roundCnt++;
            playRound();
        }
    }

    private void playRound() {
        System.out.println("Tour n°" + roundCnt);
        int score;
        for (Player player : players) {
            System.out.println("Lancement des dés...");
            score = 0;
            for (Dice dice : dices) {
                score += player.rollDice(dice);
            }
            System.out.println(player.getName() + " a obtenu un score de " + score);
        }
    }

    private Player[] generatePlayers(int nbPlayers) {
        Player[] players = new Player[nbPlayers];
        for(int i = 0; i < nbPlayers; i++) {
            players[i] = new Player("Joueur" + (i + 1));
        }
        return players;
    }

    private Dice[] generateDices(int nbDices, int nbSides) {
        Dice[] dices = new Dice[nbDices];
        for(int i = 0; i < nbDices; i++) {
            dices[i] = new Dice(nbSides);
        }
        return dices;
    }

}
