import java.util.*;
public class Day1pr4
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        	int costPrice = input.nextInt();
        	int sellingPrice = input.nextInt();
        	int profit = sellingPrice - costPrice;
        	double profitPercent = (profit * 100.0) / costPrice;
        	System.out.print(costPrice);
        	System.out.println(sellingPrice);
        	System.out.print(profit);
        	System.out.println(profitPercent);
		
	}
}