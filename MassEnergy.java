/*
* This program calculates Einstein's mass-energy equivalence
 *   formula, and catches user errors.
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-09-16
*/

import java.util.Scanner;

/**
 * This encapsulates Einstein's mass-energy formula in a program.
*/
final class MassEnergy {
    /**
     * This constant is assigned with the speed of light value.
    */
    public static final double SPEEDOFLIGHT = 2.998 * Math.pow(10, 8);

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private MassEnergy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(String[] args) {
        try {
            // input
            final Scanner myObj = new Scanner(System.in);
            System.out.println("Enter object's mass (kg): ");
            final float matterMass = myObj.nextFloat();
            if (matterMass < 0) {
                throw new IllegalArgumentException("That is an
                                    "invalid number.");
            }
            // process & output
            final double energy = matterMass
                 * Math.pow(SPEEDOFLIGHT, 2);
            System.out.println(matterMass
                + " kilograms of matter
                     "would produce " + energy + " J of energy.");
        } catch (java.util.InputMismatchException ex) {
            System.out.println("That is an invalid response.");
        } catch (IllegalArgumentException ex) {
            System.out.println("That is an invalid input.");
        } finally {
            System.out.println("\nDone.");
        }
    }
}

