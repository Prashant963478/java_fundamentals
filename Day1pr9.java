import java.util.*;
public class Day1pr9
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        	double userFee = input.nextDouble();
        	double userDiscountPercent = input.nextDouble();
        	double userDiscount = (userFee * userDiscountPercent) / 100.0;
        	double finalUserFee = userFee - userDiscount;
        	System.out.print(userDiscount);
        	System.out.println(finalUserFee);
       
	}
}