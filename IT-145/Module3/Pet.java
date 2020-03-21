package com.Java;

public class Pet {
	//Pet class variables
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpace;
	private int catSpace;
	private int daysStay;
	private double amountDue;
	
	//Constructor method
	public Pet() {
		petType = "undefined";
		petName = "undefined";
		petAge = 0;
		dogSpace = 0;
		catSpace = 0;
		daysStay = 0;
		amountDue = 0.0;
	}
	
	//Pet class accessor and definition methods
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
	
	public void setCatSpace(int inputCatSpace) {
		dogSpace = inputCatSpace;
	}
	
	public int getCatSpace() {
		return catSpace;
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
	
}
