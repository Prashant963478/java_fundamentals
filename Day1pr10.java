import java.util.*;
public class Day1pr10
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        	double cm = input.nextDouble();
        	double totalInches = cm / 2.54;
        	int feet = (int)(totalInches / 12);
        	double inches = totalInches % 12;
        	System.out.print(cm);
        	System.out.print(feet);
        	System.out.println(inches);
       
	}
}