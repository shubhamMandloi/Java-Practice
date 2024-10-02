package test;

public class OperationCount {

    public static void main(String[] args) {

        int input = 14;
        int count =0;
        while (input!=0){
            if(input%2==0){
                input = input/2;
                count++;
            }
            else {
                input = input - 1;
                count++;
            }
        }
        System.out.println("count :"+ count);
    }
}
