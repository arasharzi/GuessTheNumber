import java.util.Scanner;
import java.util.Random;

public class Main
{
    private static String name;
    private static final Scanner in = new Scanner(System.in);


    public static void main(String[] args)
    {
        System.out.println("Hello! What is your name? \n");
        try
        {
            name = in.nextLine();
        }
        catch (Exception e)
        {
            System.out.println("\nInvalid input. \n");
            System.exit(-1);
        }
        game();

        String temp;
        while (true)
        {
            System.out.println("Would you like to play again? (y or n) \n");
            try
            {
                temp = in.nextLine().toLowerCase().trim();
            }
            catch (Exception e)
            {
                System.out.println("\nInvalid input try again. \n");
                continue;
            }

            if (temp.equals("y"))
            {
                game();
            }
            else if (temp.equals("n"))
            {
                break;
            }
        }
        in.close();
    }

    public static void game()
    {
        System.out.println("\nWell, " + name + ", I am thinking of a number between 1 and 20. \n"
                + "Take a guess. \n");

        int answer = new Random().nextInt(20) + 1;
        int attempts = 1;
        int input;
        String sinput;

        while (attempts < 7)
        {
            try
            {
                sinput = in.nextLine().trim();
                if (sinput.length() > 2)
                {
                    System.out.println("\nInvalid input try again. \n");
                    continue;
                }
                else
                {
                    input = Integer.parseInt(sinput);
                }
            }
            catch (Exception e)
            {
                System.out.println("\nInvalid input try again. \n");
                continue;
            }

            if (testNumber(input, answer))
            {
                System.out.println("\nGood job, " + name + "! You guessed my number in " + attempts + " guesses! \n");
                break;
            }
            attempts++;
        }
    }
    public static boolean testNumber(int guess, int answer)
    {
        if (guess > answer)
        {
            System.out.println("\nYour guess is too high. \n"
                    + "Take a guess. \n");
            return false;
        }
        else if (guess < answer)
        {
            System.out.println("\nYour guess is too low. \n"
                    + "Take a guess. \n");
            return false;
        }
        return true;
    }
}
