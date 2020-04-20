import java.util.ArrayList;
import java.util.Scanner;

//import static java.lang.Integer.parseInt;

public class Driver {

    // instance variables (add more as needed)
    private static ArrayList<Ship> shipList = new ArrayList<Ship>();
    private static ArrayList<Cruise> cruiseList = new ArrayList<Cruise>();
    private static ArrayList<Passenger> passengerList = new ArrayList<Passenger>();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        initializeShipList();       // initial ships
        initializeCruiseList();     // initial cruises
        initializePassengerList();  // initial passengers

        // add loop and code here that accepts and validates user input
        // and takes the appropriate action. include appropriate
        // user feedback and redisplay the menu as needed
        boolean rerun = true;
        char userChoice;

        do {
        	displayMenu();
        	userChoice = scanner.next().charAt(0);
        	rerun = selectOption(userChoice);
        } while (rerun == true);


    }

    //Function to select menu option based on user input
    public static boolean selectOption(char userChoice) {
    	switch(userChoice) {
    	case '1':
    		addShip();
    		break;
    	case '2':
    		editShip();
    		break;
    	case '3':
    		addCruise();
    		break;
    	case '4':
    		editCruise();
    		break;
    	case '5':
    		addPassenger();
    		break;
    	case '6':
    		editPassenger();
    		break;
    	case 'X':
    	case 'x':
    		return false;
    	case 'a':
    	case 'A':
    		printShipList("name");
    		break;
    	case 'b':
    	case 'B':
    		printShipList("active");
    		break;
    	case 'c':
    	case 'C':
    		printShipList("full");
    		break;
    	case 'd':
    	case 'D':
    		printCruiseList("list");
    		break;
    	case 'e':
    	case 'E':
    		printCruiseList("details");
    		break;
    	case 'f':
    	case 'F':
    		printPassengerList();
    		break;
      default:
        System.out.println("Please enter a valid option...");
    	}

    	return true;
    }
    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList() {
    	add("Candy Cane", 20, 40, 10, 60, true);
        add("Peppermint Stick", 10, 20, 5, 40, true);
        add("Bon Bon", 12, 18, 2, 24, false);
        add("Candy Corn", 12, 18, 2, 24, false);
    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList() {
        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
    }

    // hardcoded cruise data for testing
    // Initialize passenger list
    public static void initializePassengerList() {
        Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
        passengerList.add(newPassenger1);

        Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "STE");
        passengerList.add(newPassenger2);

        Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "BAL");
        passengerList.add(newPassenger3);
    }

    // custom method to add ships to the shipList ArrayList
    public static void add(String tName, int tBalcony, int tOceanView,
                           int tSuite, int tInterior, boolean tInService) {
        Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }


    public static void printShipList(String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships

        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        } else if (listType == "active") {
            System.out.println("\n\nSHIP LIST - Active");

            for (Ship eachShip: shipList) {
            	if (eachShip.getInService()) {
            		System.out.println(eachShip.getShipName());
            	}
            }

        } else if (listType == "full") {
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList)
                eachShip.printShipData();

        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printCruiseList(String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i=0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("                                      |----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            for (Cruise eachCruise: cruiseList)
                eachCruise.printCruiseDetails();
        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
    }

    // display text-based menu
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tSystem Menu\n");
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    // Add a New Ship
    public static void addShip() {
    	String name = new String();
    	int balconyRooms = 0;
    	int oceanViewRooms = 0;
    	int suiteRooms = 0;
    	int interiorRooms = 0;
    	boolean inService = false;
    	char serviceInput = ' ';
    	boolean repeatQuestion = false;
    	scanner.nextLine();

    	//the following try/catch lines will catch errors and return
        //to the main menu instead of exiting program
    	System.out.println("Enter ship name:");
    	try {
    		name = scanner.nextLine();
    	}
    	catch (Exception e) {
    		System.out.println("There was an error, please verify your information and try again...");
    		return;
    	}

    	System.out.println("Enter number of Balcony cabins:");
    	try {
    		balconyRooms = scanner.nextInt();
    	}
    	catch (Exception e) {
    		System.out.println("There was an error, please verify your information and try again...");
    		return;
    	}

    	System.out.println("Enter number of Ocean View cabins:");
    	try {
        	oceanViewRooms = scanner.nextInt();
    	}
    	catch (Exception e) {
    		System.out.println("There was an error, please verify your information and try again...");
    		return;
    	}


    	System.out.println("Enter number of Suite cabins:");
    	try {
        	suiteRooms = scanner.nextInt();
    	}
    	catch (Exception e) {
    		System.out.println("There was an error, please verify your information and try again...");
    		return;
    	}

    	System.out.println("Enter number of Interior cabins:");
    	try {
        	interiorRooms = scanner.nextInt();
    	}
    	catch (Exception e) {
    		System.out.println("There was an error, please verify your information and try again...");
    		return;
    	}

        do {
        	System.out.println("Is ship in service? [Y]es or [N]o:");
            try {
                serviceInput = scanner.next().charAt(0);
        	}
        	catch (Exception e) {
        		System.out.println("There was an error, please verify your information and try again...");
        	}

        	switch (serviceInput){
        		case 'Y':
        		case 'y':
        			inService = true;
        			repeatQuestion = false;
        			System.out.println("You made it to Y");
        			break;
        		case 'N':
        		case 'n':
        			inService = false;
        			repeatQuestion = false;
        			System.out.println("You made it to N");
        			break;
        		default:
        			System.out.println("Please enter either 'Y' for yes or 'N' for no...");
        			repeatQuestion = true;
        	}
        } while (repeatQuestion == true);

        try {
        	add(name, balconyRooms, oceanViewRooms, suiteRooms, interiorRooms, inService);
        	System.out.println("Ship added successfully!");
        }
        catch (Exception e) {
        	System.out.println("There was an error, please verify your information and try again...");
        }

    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise
    public static void addCruise() {
    	//funciton variables
    	String cruiseName;
        String cruiseShipName = new String();
        String departurePort;
        String destination;
        String returnPort;
        int i = 1;
        int j = 1;
        int shipChoice = 0;
        scanner.nextLine();

        //the following try/catch lines will catch errors and return
        //to the main menu instead of exiting program
        System.out.println("Enter cruise name: ");
        try {
        	cruiseName = scanner.nextLine();
        } catch (Exception e) {
        	System.out.println("There was an error, please verify your information and try again...");
        	return;
        }

        //print available ships to select
        System.out.println("Select an available ship from the list...");
        i = 1;
        for (Ship eachShip: shipList) {
            System.out.println(i + " - " + eachShip.getShipName());
            i++;
        }

        //input ship number selection
        try {
        	shipChoice = scanner.nextInt();
        } catch (Exception e) {
        	System.out.println("There was an error with your choice, please try again...");
        }

        //loop through ship list until selected ship is found,
        //assign ship to cruise and mark as in service
        j = 1;
        for (Ship eachShip: shipList) {
            if (j == shipChoice) {
                cruiseShipName = eachShip.getShipName();
                eachShip.setInService(true);
            }
            j++;
        }

        scanner.nextLine();

        System.out.println("Enter cruise departure port: ");
        try {
        	departurePort = scanner.nextLine();
        } catch (Exception e) {
        	System.out.println("There was an error, please verify your information and try again...");
        	return;
        }

        System.out.println("Enter cruise destination: ");
        try {
        	destination = scanner.nextLine();
        } catch (Exception e) {
        	System.out.println("There was an error, please verify your information and try again...");
        	return;
        }

        System.out.println("Enter cruise return port: ");
        try {
        	returnPort = scanner.nextLine();
        } catch (Exception e) {
        	System.out.println("There was an error, please verify your information and try again...");
        	return;
        }

        try {
        	Cruise newCruise = new Cruise(cruiseName, cruiseShipName, departurePort, destination, returnPort);
        	cruiseList.add(newCruise);
        	System.out.println("Cruise successfully added to cruise list!");
        } catch (Exception e) {
        	System.out.println("There was an error, please verify your information and try again...");
        }
    }

    // Edit an existing cruise
    public static void editCruise() {

        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");

    }

    // Add a New Passenger
    public static void addPassenger() {
    	int i = 0;
    	int j = 0;
    	int cruiseChoice = 0;
    	String newCruiseName = new String();

    	scanner.nextLine();

        System.out.println("Enter the new passenger's name: ");
        String newPassengerName = scanner.nextLine();

        // ensure new passenger name does not already exist
        for (Passenger eachPassenger: passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        //print available cruises to select
        System.out.println("Select an available cruise from the list...");
        i = 1;
        for (Cruise eachCruise: cruiseList) {
            System.out.println(i + " - " + eachCruise.getCruiseName());
            i++;
        }

        //input cruise number selection
        try {
        	cruiseChoice = scanner.nextInt();
        } catch (Exception e) {
        	System.out.println("There was an error with your choice, please try again...");
        }

        //loop through cruise list until selected cruise is found,
        //assign cruise to passenger
        j = 1;
        for (Cruise eachCruise: cruiseList) {
            if (j == cruiseChoice) {
                newCruiseName = eachCruise.getCruiseName();
            }
            j++;
        }

        scanner.nextLine();

        // get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT: ");
        String room = scanner.nextLine();
        // validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) ||
                (room.equalsIgnoreCase("STE")) || (room.equalsIgnoreCase("INT"))) {
            // validation passed - add passenger
            Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase());
            passengerList.add(newPassenger);
        } else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }

    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");

    }

    // Method to check if input is a number
    public static boolean isANumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }


}
