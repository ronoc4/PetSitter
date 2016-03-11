package com.conor;

public class PetManager {

    public static void main(String[] args) {

        Pet pet1 = new Pet("Fitz", "Dog", "5350 Oliver Ave S", 2, "Wednesday");

        pet1.printPetInfo();

        Pet pet2 = new Pet("Cheech", "Dog", "3626 Minneahaha Ave S", 4, "Thursday");

        pet2.printPetInfo();


    }
}
