import java.util.Scanner;

public class SatelliteVelocity {


    public static void main(String[] args) {
        final double MASS_OF_EARTH = 5.98 * Math.pow(10,24);
        final double UNIVERSAL_GRAVITY = 6.67 * Math.pow(10,-11);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the satellite:");
        float radius = scanner.nextFloat();
        System.out.println("You entered " + radius);

        double velocity = Math.sqrt((MASS_OF_EARTH*UNIVERSAL_GRAVITY)/radius);

        System.out.println("Calculated velocity is " + velocity);

    }
}
