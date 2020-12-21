public class Runner{
    final int num =10;
    public void display(){

        int num =12;
        System.out.println(num);
        Runnable r = new Runnable() {
            final int num=15;

            @Override
            public void run() {
                int num = 20;
                System.out.println(this.num);
            }
        };
        r.run();
    }

    public static void main(String[] args) {
        Runner rv = new Runner();
        rv.display();
    }
}

