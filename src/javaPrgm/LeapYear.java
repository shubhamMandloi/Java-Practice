package javaPrgm;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to chec");
        int inputYear = sc.nextInt();
        if (inputYear % 4 == 0) {
            if (inputYear % 100 == 0) {
                if (inputYear % 400 == 0)
                    System.out.println(inputYear + " is a Leap year !!");
                else
                    System.out.println(inputYear + " is Not a Leap year !!");

            } else
                System.out.println(inputYear + " is a Leap year !!");
        } else
            System.out.println(inputYear + " is Not a Leap year !!");

    }
}
