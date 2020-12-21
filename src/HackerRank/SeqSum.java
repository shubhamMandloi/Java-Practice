package HackerRank;

public class SeqSum {


        public static long solution (int i, int j , int k){
            long result = 0;
            String msg = "";
            for(int x =i;x<=j;x++){
                result = result + x;
                System.out.println(msg + " + " +x);
            }
            for(int x =j-1;x>=k;x--) {
                result = result + x;
                System.out.println(msg + " + " + x);
            }

            return result;

        }


    public static void main(String[] args) {

        System.out.println(solution(0,5,-1));
    }
}
