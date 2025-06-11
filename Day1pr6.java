import java.util.*;
public class Day1pr6
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;
        System.out.println(discount);
        System.out.println(finalFee);
	}
}