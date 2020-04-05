public class Corgi extends Dog {

    // additional instance variables
	private int age;
	private int weight;


    // constructor
    public Corgi(String type, String breed, String name, int pounds, int years) {

        // invoke Dog class (super class) constructor
        super(type, breed, name);
        weight = pounds;
        age = years;
    }

    // mutator methods
    public void setAge(int inputAge) {
    	age = inputAge;
    }
    
    public int getAge() {
    	return age;
    }
    
    public void setWeight(int inputWeight) {
    	weight = inputWeight;
    }
    
    public int getWeight() {
    	return weight;
    }


    // override toString() method to include additional dog information
    @Override
    public String toString() {
    	String temp;
        temp = super.toString();
        temp += "\nThe Corgi is " + age;
        temp += " years old and weighs ";
        temp += weight + " pounds.";
        return temp;
    }

}
