package com.conor;

public class PetManager {

    public static void main(String[] args) {

        Pet pet1 = new Pet("Fitz", "Dog", "5350 Oliver Ave S", "Wednesday");
        pet1.TimeVisit(6);

        pet1.printPetInfo();

        Pet pet2 = new Pet("Cheech", "Dog", "3626 Minneahaha Ave S", "Thursday");
        pet2.TimeVisit(3);

        pet2.printPetInfo();

        Pet pet3 = new Pet("Roy", "Cat", "2611 Buchanan St Ne", "Monday");

        pet3.TimeVisit(7);
        pet3.printPetInfo();


        System.out.println();


    }


}
