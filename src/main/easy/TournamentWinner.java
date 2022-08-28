package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TournamentWinner {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);

        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

        String team = tournamentWinner(competitions, results);

        printResult(team);
    }

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String finalWinningTeam = "";
        int highestScore = 0;

        for (int i=0; i< competitions.size(); i++) {
            int competitionResult = results.get(i);
            String winningTeam = competitions.get(i).get(competitionResult == 0 ? 1 : 0);
            int oldScore = map.containsKey(winningTeam) ? map.get(winningTeam) : 0;
            int newScore = oldScore + 3;

            if (newScore > highestScore) {
                highestScore = newScore;
                finalWinningTeam = winningTeam;
            }

            map.put(winningTeam, newScore);
        }

        return finalWinningTeam;
    }

    private static void printResult(String team) {
        System.out.println(team);
    }

}
