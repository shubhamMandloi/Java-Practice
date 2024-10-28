package test;

public class test2 {

    public static boolean isConsecutivePair(int a, int b){

        if(b-a == 1){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {

        String input = "986672130103465478987043210";
        int result=0;
        int fwdResult=0;
        int len = input.length();

        for(int i = len-1;i>=1;i--){
            Integer a = Integer.valueOf(input.charAt(i));
            Integer b = Integer.valueOf(input.charAt(i-1));
            if(isConsecutivePair(a,b))
                result++;
            if(isConsecutivePair(b,a))
                fwdResult++;
        }


        System.out.println("Total consecutive Pair : "+ result);
    }
}
