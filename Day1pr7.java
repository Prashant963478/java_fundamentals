import java.util.*;
public class Day1pr7
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        double radius = input.nextDouble();
        double volumeKm = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println(volumeKm);
        System.out.println(volumeMiles);
	}
}