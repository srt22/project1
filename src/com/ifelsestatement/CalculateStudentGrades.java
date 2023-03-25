package com.ifelsestatement;



public class CalculateStudentGrades {
    public static void main(String[] args) {

        int average = 85;
        char grade;

        if (average>=80){
            grade = 'A';
        }
        else if (average>=60 && average<80){
            grade = 'B';
        }
        else if (average>=40 && average<60){
            grade = 'C';
        }
        else
        {
            grade = 'D';
        }

        switch(grade){
            case 'A' :
                System.out.println(grade + "Excellent with "+ average);
                break;
            case 'B' :
                System.out.println(grade + "Very Good" + average);
                break;
            case 'C' :
                System.out.println(grade + "Well done " + average);
                break;
            case 'D' :
                System.out.println("you passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
    }
        System.out.println("Your grade is " + grade);
    }
}




