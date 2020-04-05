import java.text.SimpleDateFormat;

public class RescueAnimal {

    // Instance variables
    private String name;
    private String type;
    private String gender;
    private int age;
    private float weight;
    private SimpleDateFormat acquisitionDate;
    private SimpleDateFormat statusDate;
    private String acquisitionSource;
    private Boolean reserved;
    private String trainingLocation;
    private SimpleDateFormat trainingStart;
    private SimpleDateFormat trainingEnd;
    private String trainingStatus;
    private String inServiceCountry;
    private String inServiceCity;
    private String inServiceAgency;
    private String inServicePOC;
    private String inServiceEmail;
    private String inServicePhone;
    private String inServicePostalAddress;

    // Constructor
    public RescueAnimal() {
    }

    //Accessor Methods
    public String getName() {
    	return name;
    }
    public String getType() {
    	return type;
    }
    public String getGender() {
    	return gender;
    }
    public int getAge() {
    	return age;
    }
    public float getWeight() {
    	return weight;
    }
    public SimpleDateFormat getAcquisitionDate() {
    	return acquisitionDate;
    }
    public SimpleDateFormat getStatusDate() {
    	return statusDate;
    }
    public String getAcquisitionSource() {
    	return acquisitionSource;
    }
    public boolean getReserved() {
    	return reserved;
    }
    public String getTrainingLocation() {
    	return trainingLocation;
    }
    public SimpleDateFormat getTrainingStart() {
    	return trainingStart;
    }
    public SimpleDateFormat getTrainingEnd() {
    	return trainingEnd;
    }
    public String getTrainingStatus() {
    	return trainingStatus;
    }
    public String getInServiceCountry() {
    	return inServiceCountry;
    }
    public String getInServiceCity() {
    	return inServiceCity;
    }
    public String getInServiceAgency() {
    	return inServiceAgency;
    }
    public String getInServicePOC() {
    	return inServicePOC;
    }
    public String getInServiceEmail() {
    	return inServiceEmail;
    }
    public String getInServicePhone() {
    	return inServicePhone;
    }
    public String getInServicePostalAddress() {
    	return inServicePostalAddress;
    }

    //Mutator Methods
    public void setName(String input) {
    	name = input;
    }
    public void setType(String input) {
    	type = input;
    }
    public void setGender(String input) {
    	gender = input;
    }
    public void setAge(int input) {
    	age = input;
    }
    public void setWeight(float input) {
    	weight = input;
    }
    public void setAcquisitionDate(SimpleDateFormat input) {
    	acquisitionDate = input;
    }
    public void setStatusDate(SimpleDateFormat input) {
    	statusDate = input;
    }
    public void setAcquisitionSource(String input) {
    	acquisitionSource = input;
    }
    public void setReserved(boolean input) {
    	reserved = input;
    }
    public void setTrainingLocation(String input) {
    	trainingLocation = input;
    }
    public void setTrainingStart(SimpleDateFormat input) {
    	trainingStart = input;
    }
    public void setTrainingEnd(SimpleDateFormat input) {
    	trainingEnd = input;
    }
    public void setTrainingStatus(String input) {
    	trainingStatus = input;
    }
    public void setInServiceCountry (String input) {
    	inServiceCountry = input;
    }
    public void setInServiceCity (String input) {
    	inServiceCity = input;
    }
    public void setInServiceAgency (String input) {
    	inServiceAgency = input;
    }
    public void setInServicePOC (String input) {
    	inServicePOC = input;
    }
    public void setInServiceEmail (String input) {
    	inServiceEmail = input;
    }
    public void setInServicePhone (String input) {
    	inServicePhone = input;
    }
    public void setInServicePostalAddress (String input) {
    	inServicePostalAddress = input;
    }
}
