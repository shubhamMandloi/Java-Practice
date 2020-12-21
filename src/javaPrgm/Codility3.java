package javaPrgm;


public class Codility3 {

    public static int solution(int[] A) {

        int swap = 0;
        for (int i = 0; i <=A.length-1; i++) {
            if (i == 0) {
                if ((A[i] == A[i + 1])) {
                    if(A[i]==0)
                        A[i]=1;
                    else
                        A[i]=0;
                    swap++;
                    i=0;
                    continue;
                }
            }
            else {
                if (A[i] == A[i - 1]) {
                    if (A[i] == 0)
                        A[i] = 1;
                    else
                        A[i] = 0;
                    swap++;
                    i = 0;
                    continue;

                }
            }



        }

        return swap;

    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{1,0,1,0,1,0};
        System.out.println(solution(inputArray));

    }
}
