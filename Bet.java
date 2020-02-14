import java.util.Scanner;
public class Bet {

	public int bet;
	public static int num_players;
	Bet()
	{
		System.out.println("Choose a bet: (0),(25),(50) or (75).");
		Scanner input = new Scanner(System.in);
		String x = input.next();
		while(!x.equals("0") & !x.equals("25") & !x.equals("50") & !x.equals("75"))
		{
			System.out.println("Please select either: (0),(25),(50) or (75).");
			x = input.next();
		}	
		bet = Integer.parseInt(x);
	}
	public static void set_num_players(int num)
	{
		num_players = num;
	}
	public int getBet()
	{
		return bet;
	}
	
}
