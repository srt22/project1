package com.ifelsestatement;

public class LeapYear {
    // method to check leap year
    public static void isLeapYear(int year) {

    // flag to take a non - leap year by default
    boolean is_leap_year = false;

    // if year is divisible by 4
    if (year % 4 == 0) {
        is_leap_year = true;
        // to identify whether it
        // is a century year or
        // not
        if (year % 100 == 0){
            // checking if year is divisible by 400
            // therefore century leap year
            if (year % 400 == 0)
                is_leap_year = true;
            else
                is_leap_year = false;
        }
    }
    // we land here when corresponding if fails
        // If year is not divisible by 4
        else
            // flag dealing - Non leap-year
        is_leap_year = false;
        if (!is_leap_year)
            System.out.println(year + " : Non Leap Year");
        else
            System.out.println(year + " : Leap-Year");
    }

    // main Driver Code
    public static void main(String[] args) {
        //calling our function by
        //passing century year not divisible by 400
        isLeapYear(2002);
        isLeapYear(2004);
        isLeapYear(2024);
        isLeapYear(4);

        // calling our function by
        // passing Non-century year
        isLeapYear(2001);
        isLeapYear(2003);
        isLeapYear(200);
    }
}
