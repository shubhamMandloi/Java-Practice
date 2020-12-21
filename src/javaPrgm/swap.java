package javaPrgm;

public class swap {
    public static void main(String args[]){
        int numberA = 10;
        int numberB = 20;

        System.out.println("Number A is : " + numberA + " And Number B is : " + numberB);

        int temp = numberB;
        numberB= numberA;
        numberA = temp;
        System.out.println("Number A is : " + numberA + " And Number B is : " + numberB);

        numberA = numberA+numberB;
        numberB = numberA-numberB;
        numberA = numberA-numberB;
        System.out.println("Number A is : " + numberA + " And Number B is : " + numberB);

    }
}
