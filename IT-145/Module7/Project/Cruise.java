public class Cruise {

    // Instance Variables
    private String cruiseName;
    private String cruiseShipName;
    private String departurePort;
    private String destination;
    private String returnPort;

    // Constructor - default
    Cruise() {
    }

    // Constructor - full
    Cruise(String tCruiseName, String tShipName, String tDeparture, String tDestination, String tReturn) {
        cruiseName = tCruiseName;
        cruiseShipName = tShipName;
        departurePort = tDeparture;
        destination = tDestination;
        returnPort = tReturn;
    }

    // Accessors
    public String getCruiseName() {
        return cruiseName;
    }

    public String getCruiseShipName() {
        return cruiseShipName;
    }

    public String getDeparturePort() {
        return departurePort;
    }

    public String getDestination() {
        return destination;
    }

    public String getReturnPort() {
        return returnPort;
    }

    // Mutators
    public void setCruiseName(String tVar) {
        cruiseName = tVar;
    }

    public void setCruiseShipName(String tVar) {
        cruiseShipName = tVar;
    }

    public void setDeparturePort(String tVar) {
        departurePort = tVar;
    }

    public void setDestination(String tVar) {
        destination = tVar;
    }

    public void setReturnPort(String tVar) {
        returnPort = tVar;
    }

    // print cruise details
    public void printCruiseDetails() {
    	int spaceCount;
        String cruiseNameSpaces = new String();
        String shipNameSpaces = new String();
        String departurePortSpaces = new String();
        String destinationPortSpaces = new String();
        
        spaceCount = 20 - cruiseName.length();
        for (int i = 1; i <= spaceCount; i++) {
            cruiseNameSpaces = cruiseNameSpaces + " ";
        }
        spaceCount = 20 - cruiseShipName.length();
        for (int i = 1; i <= spaceCount; i++) {
            shipNameSpaces = shipNameSpaces + " ";
        }
        spaceCount = 20 - departurePort.length();
        for (int i = 1; i <= spaceCount; i++) {
            departurePortSpaces = departurePortSpaces + " ";
        }
        spaceCount = 20 - destination.length();
        for (int i = 1; i <= spaceCount; i++) {
            destinationPortSpaces = destinationPortSpaces + " ";
        }
        
        

        System.out.println(cruiseName + cruiseNameSpaces + cruiseShipName + shipNameSpaces +
                departurePort + departurePortSpaces + destination + destinationPortSpaces +
                returnPort);
    }

    // method added to print ship's name vice memory address
    @Override
    public String toString() {
        return cruiseName;
    }
}