import java.util.*;
public class Day1pr5
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        	int pens = input.nextInt();
        	int students = input.nextInt();
        	int pensPerStudent = pens / students;
        	int remainingPens = pens % students;
        	System.out.println(pensPerStudent);
        	System.out.println(remainingPens);
		
	}
}