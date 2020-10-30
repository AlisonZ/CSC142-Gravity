/*
Program: Satellite Velocity

Author: Alison Zerbe

Course: CSC 142

Description:    A program that instructs a user to input a radius of a satellite
                and calculates the velocity of that satellite

Verification:   Tested using different radii to ensure that a smaller radius (closer to earth)
                has a greater velocity.
                Radius of 1 has a velocity of 1.997162987840502E7
                Radius of 100 has a velocity of 1997162.9878405018
 */

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
