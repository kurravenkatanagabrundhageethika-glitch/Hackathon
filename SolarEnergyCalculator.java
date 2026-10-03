import java.util.Scanner;

public class SolarEnergyCalculator {
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy)
 {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter energy generated in the morning (kWh): ");
        double morningEnergy = scanner.nextDouble();
        System.out.print("Enter energy generated in the evening (kWh): ");
        double eveningEnergy = scanner.nextDouble();
        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);
        System.out.println("Total energy generated: " + totalEnergy + " kWh");

        }
}
