package ss8_clean_codeand_and_refactoring.bai_tap;

import java.util.Scanner;

public class TennisGame {

    public static final int zero = 0;
    public static final int one = 1;
    public static final int two = 2;
    public static final int three = 3;

    public static String getScore(String player1Name, String player2Name, int firstScore, int secondScore) {
        String score = "";
        int tempScore=0;

        boolean equal = firstScore == secondScore;
        if (equal)
        {
            switch (firstScore)
            {
                case zero:
                    score = "Love-All";
                    break;
                case one:
                    score = "Fifteen-All";
                    break;
                case two:
                    score = "Thirty-All";
                    break;
                case three:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
        
        else {
            boolean scorePlay1 = firstScore >= 4;
            boolean scorePlay2 = secondScore >= 4;
            if (scorePlay1 || scorePlay2)
            {
                int minusResult = firstScore-secondScore;
                if (minusResult==1) score ="Advantage player1";
                else if (minusResult ==-1) score ="Advantage player2";
                else if (minusResult>=2) score = "Win for player1";
                else score ="Win for player2";
            }

            else
            {
                for (int i=1; i<3; i++)
                {
                    if (i==1) tempScore = firstScore;
                    else { score+="-"; tempScore = secondScore;}
                    switch(tempScore)
                    {
                        case zero:
                            score+="Love";
                            break;
                        case one:
                            score+="Fifteen";
                            break;
                        case two:
                            score+="Thirty";
                            break;
                        case three:
                            score+="Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter playerName 1: ");
        String playerName1=scanner.nextLine();
        System.out.print("Enter playerName 1: ");
        String playerName2=scanner.nextLine();
        System.out.print("Enter score playerName 1 : ");
        int scorePlayer1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter score playerName 2 : ");
        int scorePlayer2 = Integer.parseInt(scanner.nextLine());
        System.out.println(TennisGame.getScore( playerName1, playerName2, scorePlayer1, scorePlayer2));
    }
}
