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
    public Pet(String petName, String animalType, String addressPet,  String day) {
        this.name = petName;
        this.type = animalType;
        this.address = addressPet;
        this.dayOfWeek = day;
    }

    public void TimeVisit (int numberTimes) {
        if (numberTimes >= 6) {
            System.out.println(numberTimes + " is have too many visits");
        } else {
            this.numberTimes = numberTimes;
            System.out.println("Total number of visits: " + numberTimes);
        }
    }

    public void printPetInfo() {
        System.out.println(this.dayOfWeek + ": Visit " + this.name + " the " + this.type + " " + this.address);
    }
}
