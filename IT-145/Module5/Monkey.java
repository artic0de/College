public class Monkey extends RescueAnimal {

    // Instance variables
    private String species;
    private float tailLength;
    private float height;
    private float bodyLength;
    private float torsoMeasurement;
    private float skullMeasurement;
    private float neckMeasurement;

    // Constructor
    public Monkey() {
    }

    // Accessor Methods
    public String getSpecies() {
        return species;
    }
    public float getTailLength() {
    	return tailLength;
    }
    public float getHeight() {
    	return height;
    }
    public float getBodyLength() {
    	return bodylength;
    }
    public float getTorsoMeasurement() {
    	return torsoMeasurement;
    }
    public float getSkullMeasurement() {
    	return skullMeasurement;
    }
    public float getNeckMeasurement() {
    	return neckMeasurement;
    }

    // Mutator Methods
    public void setSpecies(String input) {
        species = input;
    }
    public void setTailLength(float input) {
    	tailLength = input;
    }
    public void setHeight(float input) {
    	height = input;
    }
    public void setBodyLength(float input) {
    	bodyLength = input;
    }
    public void setTorsoMeasurement(float input) {
    	torsoMeasurement = input;
    }
    public void setSkullMeasurement(float input) {
    	skullMeasurement = input;
    }
    public void setNeckMeasurement(float input) {
    	neckMeasurement = input;
    }

}