package StringPrgms;

import javaPrgm.Stream;

public class removeRepeat {

    public static String camelCase(String input){
        input = input.replaceAll("\\s+"," ").trim();
        for(int index =0; index<input.length();index++)
        {
            if(index==0 ){
                Character ch = Character.toUpperCase(input.charAt(index));
                input = ch + input.substring(index+1);
            }
            if(input.charAt(index)==' '){
                Character ch = Character.toUpperCase(input.charAt(index+1));
                input = input.substring(0,index+1)+ch+input.substring(index+2);
            }

        }

        return input;
    }

    public static String removeRep(String input){
        return camelCase(input).replaceAll("(.)\\1+","$1");
    }



    public static void main(String[] args){
       // String input= "thiISss REeppeaatttT Worrdd1;";
        String input= "  thisss is a    testtttT   scriptTsssSS  ";
        System.out.println(input);

        input= removeRep(input);


        System.out.println(input);
    }
}
