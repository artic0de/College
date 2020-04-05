import java.util.ArrayList;
import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {

        // Instance variables
    	Scanner scanner = new Scanner(System.in);
    	ArrayList<RescueAnimal> animals = new ArrayList<RescueAnimal>();

        // Create New Dog
    	Dog barkyBoy = new Dog();
  
        // Create New Monkey
    	Monkey throwsPoop = new Monkey();

        // Method to process request for a rescue animal
    	public void processRequest(String inputCountry) {
    		for (RescueAnimal animal : animals) {
    			if (animal.getTrainingLocation().equals(inputCountry)) {
    				animal.setReserved(true);
    			}
    		}
    	}
    	
        // Method(s) to update information on existing animals
    	public void updateInfo(String name) {
    		//Set up and print selection menu
    		int option = -1;
    		while (option < 0 && option > 22) {
    			System.out.println("Please select an item to update from the menu:");
        		System.out.println("1 - Name");
        		System.out.println("2 - Age");
        		System.out.println("3 - Weight");
        		System.out.println("4 - Status Date");
        		System.out.println("5 - Reserved Status");
        		System.out.println("6 - Training Location");
        		System.out.println("7 - Training Start Date");
        		System.out.println("8 - Training End Date");
        		System.out.println("9 - Training Status");
        		System.out.println("10 - In-Service Country");
        		System.out.println("11 - In-Service City");
        		System.out.println("12 - In-Service Agency");
        		System.out.println("13 - In-Service POC");
        		System.out.println("14 - In-Service Email");
        		System.out.println("15 - In-Service Phone Number");
        		System.out.println("16 - In Service Postal Address");
        		System.out.println("17 - MONKEY ONLY: Tail Length");
        		System.out.println("18 - MONKEY ONLY: Height");
        		System.out.println("19 - MONKEY ONLY: Body Length");
        		System.out.println("20 - MONKEY ONLY: Torso Measurement");
        		System.out.println("21 - MONKEY ONLY: Skull Measurement");
        		System.out.println("22 - MONKEY ONLY: Neck Measurement");
        		System.out.println("0 - Exit")
        		option = scanner.nextChar();
        		System.out.println();
    		}
    		
    		//Deal with option selected from menu
    		switch(option) {
    		case 0:
    			return;
    			
    		case 1:
    			System.out.print("Enter new name: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setName(newValue);
    				}
    			}
    			break;
    			
    		case 2:
    			System.out.print("Enter new age: ");
    			int newValue = scanner.nextInt();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setAge(newValue);
    				}
    			}
    			break;
    			
    		case 3:
    			System.out.print("Enter new weight: ");
    			float newValue = scanner.nextFloat();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setWeight(newValue);
    				}
    			}
    			break;
    			
    		case 4:
    			System.out.print("Enter new status date: ");
    			SimpleDateFormat newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setStatusDate(newValue);
    				}
    			}
    			break;
    			
    		case 5:
    			System.out.print("Enter new reserved status (true = is reserved, false = is not reserved): ");
    			boolean newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setReserved(newValue);
    				}
    			}
    			break;
    			
    		case 6:
    			System.out.print("Enter new training location: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setTrainingLocation(newValue);
    				}
    			}
    			break;
    			
    		case 7:
    			System.out.print("Enter new training start date: ");
    			SimpleDateFormat newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setTrainingStart(newValue);
    				}
    			}
    			break;
    			
    		case 8:
    			System.out.print("Enter new training end date: ");
    			SimpleDateFormat newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setTrainingEnd(newValue);
    				}
    			}
    			break;
    			
    		case 9:
    			System.out.print("Enter new training status: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setTrainingStatus(newValue);
    				}
    			}
    			break;
    			
    		case 10:
    			System.out.print("Enter new in-service country: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setInServiceCountry(newValue);
    				}
    			}
    			break;
    			
    		case 11:
    			System.out.print("Enter new in-service city: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setInServiceCity(newValue);
    				}
    			}
    			break;
    			
    		case 12:
    			System.out.print("Enter new in-service agency: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setInServiceAgency(newValue);
    				}
    			}
    			break;
    			
    		case 13:
    			System.out.print("Enter new in-service POC: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setInServicePOC(newValue);
    				}
    			}
    			break;
    			
    		case 14:
    			System.out.print("Enter new in-service email: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setInServiceEmail(newValue);
    				}
    			}
    			break;
    			
    		case 15:
    			System.out.print("Enter new in-service phone number: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setInServicePhone(newValue);
    				}
    			}
    			break;
    			
    		case 16:
    			System.out.print("Enter new in-service postal address: ");
    			String newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name)) {
    					animal.setInServicePostalAddress(newValue);
    				}
    			}
    			break;
    			
    		case 17:
    			System.out.print("Enter new tail length: ");
    			float newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name) && animal instanceof Monkey) {
    					animal.setTailLength(newValue);
    				}
    			}
    			break;
    		
    		case 18:
    			System.out.print("Enter new height:  ");
    			float newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name) && animal instanceof Monkey) {
    					animal.setHeight(newValue);
    				}
    			}
    			break;
    			
    		case 19:
    			System.out.print("Enter new body length: ");
    			float newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name) && animal instanceof Monkey) {
    					animal.setBodyLength(newValue);
    				}
    			}
    			break;
    			
    		case 20:
    			System.out.print("Enter new torso measurement: ");
    			float newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name) && animal instanceof Monkey) {
    					animal.setTorsoMeasurement(newValue);
    				}
    			}
    			break;
    			
    		case 21:
    			System.out.print("Enter new skull measurement: ");
    			float newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name) && animal instanceof Monkey) {
    					animal.setSkullMeasurement(newValue);
    				}
    			}
    			break;
    			
    		case 22:
    			System.out.print("Enter new neck measurement: ");
    			float newValue = scanner.next();
    			System.out.println();
    			
    			for (RescueAnimal animal : animals) {
    				if (animal.getName().equals(name) && animal instanceof Monkey) {
    					animal.setNeckMeasurement(newValue);
    				}
    			}
    			break;
    		}
    		
    	}


        // Method to display matrix of aninmals based on location and status/training phase
    	public void outputAnimals(String trainingLocation, String trainingStatus) {
    		for (RescueAnimal animal : animals) {
    			System.out.println("Name: " + animal.getName());
    			//if the animal is in service, this will print the city/country
    			if (animal.getTrainingStatus.equals("service")) {
    				System.out.println("Location: " + animal.getInServiceCity + ", " + animal.getInServiceCountry);
    			}
    			//if the animal is at the farm, it will print the location of the training facility farm
    			else if (animal.getTrainingStatus.equals("farm")) {
    				System.out.println("Location: " + animal.getTrainingLocation());
    			}
    			//if the above two fail, meaning the animal is in training, it will print the facility
    			//as well as the phase of training the animal is in
    			else {
    				System.out.println("Location: " + animal.getTrainingLocation());
        			System.out.println("Phase: " + animal.getTrainingPhase());
    			}
    			System.out.println();
    		}
    	}

        // Method to add animals
    	public void addAnimal(RescueAnimal animal) {
    		animals.add(animal);
    	}

        // Method to out process animals for the farm or in-service placement
    	public void outProcess(String name, String status) {
    		for (RescueAnimal animal : animals) {
    			if (animal.getName().equals(name)) {
    				animal.setTrainingStatus(status);
    			}
    		}
    	}

        // Method to display in-service animals
    	public void outputInServiceAnimals() {
    		for (RescueAnimal animal : animals) {
    			if (animal.getTrainingStatus().equals("service")) {
    				System.out.println(animal.getName() + " is in-service.");
    			}
    		}
    	}

        // Process reports from in-service agencies reporting death/retirement
    	public void removeAnimal(String name) {
    		for (RescueAnimal animal : animals) {
    			if (animal.getName().equals(name)) {
    				animals.remove(animal);
    			}
    		}
    	}

    }
}
