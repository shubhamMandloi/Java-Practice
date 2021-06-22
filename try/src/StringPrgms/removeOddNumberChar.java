package StringPrgms;

public class removeOddNumberChar {


    public static void main(String args[]) {

        String input = "tommorow";//new Scanner(System.in).next();

        String result = "";
        for (Character ch : input.toCharArray()) {
            if (result.indexOf(ch) != -1) {
               // result = result.substring(0,result.indexOf(ch))+ result.substring(result.indexOf(ch)+1);
    
            } else {
                result = result + ch;
            }

        }




        System.out.println(result);

    }


}

