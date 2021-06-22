package HackerRank;

public class minStepToOne {


    public static void main(String args[]){

        int num = 50;


        int step=0;
        //combi 1
        while(num>1){
            if(num%3==1){
                num = num-1;
                step++;
                continue;
            }
            if(num%3==0){
                num=num/3;
                step++;
                continue;
            }
            if(num%2==0){
                num=num/2;
                step++;
                continue;
            }
            if(num%3==2){
                num = num-1;
                step++;
                continue;
            }
        }
        System.out.println( "Min step : "+step);


    }
}
