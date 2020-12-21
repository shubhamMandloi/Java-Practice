package javaPrgm;

import java.util.Scanner;

public class count {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input String : ");
        String input = sc.nextLine();
        int[] charArray = new int[26];

        for(Character c : input.toCharArray()){
            //System.out.println((int)c);
            charArray[(int)c-97]++;
        }
        for(int i =0;i<charArray.length;i++){
            if(charArray[i]!=0)
                System.out.println("occurance of "+(char)(i+97) +" "+charArray[i]);

        }



    }
}
