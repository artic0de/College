import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        boolean inputError = false;
        String inputHeight = "";
        String inputWidth = "";

        final double squareFeetPerGallons = 350.0;

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
        	inputError = true;
        	System.out.println("Enter wall height (feet): ");
        	inputHeight = scnr.nextLine();
        	try {
        		wallHeight = Double.parseDouble(inputHeight);
        		if (wallHeight != 0) {
        			inputError = false;
        		} else {
        			inputError = true;
        			System.out.println("Number cannot be zero...");
        		}
        	} catch (Exception e) {
        		System.out.println("Please enter valid input...");
        	}
        } while (inputError);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
        	inputError = true;
        	System.out.println("Enter wall width (feet): ");
        	inputWidth = scnr.nextLine();
        	try {
        		wallWidth = Double.parseDouble(inputWidth);
        		if (wallWidth != 0) {
        			inputError = false;
        		} else {
        			inputError = true;
        			System.out.println("Number cannot be zero...");
        		}
        	} catch (Exception e) {
        		System.out.println("Please enter valid input...");
        	}
        } while (inputError);


        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calulate and output the amount of paint cans needed...
        System.out.println("Paint cans needed: " + Math.ceil(gallonsPaintNeeded / 1));

    }
}
