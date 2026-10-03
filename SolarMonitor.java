
import java.util.Scanner;

public class SolarMonitor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the energy generated : ");
        double energy = scanner.nextDouble();
        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

           }
}
