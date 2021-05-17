package javaPrgm;

public class coinPuzzle {

    public static void main(String[] args){

        final int MaxNumberPerson=1100;

        boolean array[] = new boolean[MaxNumberPerson+1];
        for(boolean element : array){
            element=false;
        }
        for(int i =1;i<=MaxNumberPerson;i++){

            for(int j=i;j<=MaxNumberPerson;j=j+i){
                array[j]=!array[j];
            }
        }
        int counter=0;
        for(int i=1;i<=MaxNumberPerson;i++){
            if(array[i]==true){
                System.out.println("Person " +i + " is having Head");
                counter++;
            }

        }

        System.out.println("Total count = "+counter);
    }
}
