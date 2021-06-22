package HackerRank;

public class viralAdvt {


    // Complete the birthday function below.
    static int calc(int n) {
        int shared =5;
        int liked = 0;
        int cumm =0;
        for (int pass = 1; pass <= n; pass++) {

            liked =(int) Math.floor(shared/2);
            cumm = cumm + liked;
            shared = 3 * liked;


        }
        return cumm;

    }


    public static void main(String[] args) {






        int result = calc(5);

        System.out.println(result);
    }
}
