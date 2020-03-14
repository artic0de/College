package com.Java;

public class Dog {
	//The following variables are from the Pet class
	//They will be removed once the pet class is inherited
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpace;
	private int daysStay;
	private double amountDue;
	
	//The following variables are Dog class-specific
	private int dogSpaceNbr;
	private double dogWeight;
	private boolean grooming;
	
	//Constructor method
	public Dog() {
		petType = "dog";
	}
	
	//The following methods are from the Pet class
	//They will be removed once the pet class is inherited
	public void setPetType(String inputPetType){
		petType = inputPetType;
	}
	
	public String getPetType() {
		return petType;
	}
	
	public void setPetName(String inputPetName) {
		petName = inputPetName;
	}
	
	public String getPetName() {
		return petName;
	}
	
	public void setPetAge(int inputPetAge) {
		petAge = inputPetAge;
	}
	
	public int getPetAge() {
		return petAge;
	}
	
	public void setDogSpace(int inputDogSpace) {
		dogSpace = inputDogSpace;
	}
	
	public int getDogSpace() {
		return dogSpace;
	}
	
	public void setDaysStay(int inputDaysStay) {
		daysStay = inputDaysStay;
	}
	
	public int getDaysStay() {
		return daysStay;
	}
	
	public void setAmountDue(double inputAmountDue) {
		amountDue = inputAmountDue;
	}
	
	public double getAmountDue() {
		return amountDue;
	}
	
	//The following methods are Dog class-specific
	public void setDogSpaceNbr(int inputDogSpaceNbr) {
		dogSpaceNbr = inputDogSpaceNbr;
	}
	
	public int getDogSpaceNbr() {
		return dogSpaceNbr;
	}
	
	public void setDogWeight(double inputDogWeight) {
		dogWeight = inputDogWeight;
	}
	
	public double getDogWeight() {
		return dogWeight;
	}
	
	public void setGrooming(boolean inputGrooming) {
		grooming = inputGrooming;
	}
	
	public boolean getGrooming() {
		return grooming;
	}
}
