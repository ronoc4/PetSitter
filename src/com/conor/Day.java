package com.conor;

/**
 * Created by conor on 3/9/16.
 * 
 */
public enum Day {

    // Enum to add store days of week inspiration from here: http://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/

        MONDAY("Monday"),
        TUESDAY("Tuesday"),
        WEDNESDAY("Wednesday"),
        THURSDAY("Thursday"),
        FRIDAY("Friday"),
        SATURDAY("Saturday"),
        SUNDAY("Sunday");


    private final String days;

    private Day (String days) {
        this.days = days;
    }

    public String returnDay() {
        return  days;
    }
}
