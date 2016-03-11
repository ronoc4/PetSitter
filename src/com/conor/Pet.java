package com.conor;

/**
 * Created by conor on 3/8/16.
 *
 */
public class Pet {
    //Add some pet variables
    private String name;
    private String type;
    private String address;
    private int numberTimes;
    private String dayOfWeek;

    //Constructor for object
    public Pet(String petName, String animalType, String addressPet, int timeVisit, String day) {
        this.name = petName;
        this.type = animalType;
        this.address = addressPet;
        this.numberTimes = timeVisit;
        this.dayOfWeek = day;
    }



    public void printPetInfo() {
        System.out.println(this.dayOfWeek + ": Visit " + this.name + " the " + this.type + " " + this.numberTimes + " times. "
        + this.address);
    }
}
