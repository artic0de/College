public class Dog {

    // instance variables
	private String name;
	private String breed;
	private String type;
	private String topTrick;


    // constructor
	public Dog() {
		name = "undefined";
		breed = "undefined";
		type = "undefined";
		topTrick = "undefined";
	}
	
	public Dog(String inputType, String inputBreed, String inputName) {
		type = inputType;
		name = inputName;
		breed = inputBreed;
	}


    // methods
	public void setName(String inputName) {
		name = inputName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBreed(String inputBreed) {
		breed = inputBreed;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setType(String inputType) {
		type = inputType;
	}
	
	public String getType() {
		return type;
	}
	
	public void setTopTrick(String inputTopTrick) {
		topTrick = inputTopTrick;
	}
	
	public String getTopTrick() {
		return topTrick;
	}

    // method used to print Dog information
    public String toString() {
        String temp;
        temp = "\nDOG DATA\n" + name;
        temp += " is a " + breed;
        temp += ", a " + type;
        temp += " dog. \nThe top trick is : ";
        temp += topTrick + ".";
        return temp;
    }

}
