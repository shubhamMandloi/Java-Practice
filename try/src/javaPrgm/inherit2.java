package javaPrgm;

class superBase{
    static{
        int intial =0;
        System.out.println("inside super base initial");
    }
    superBase(){
        System.out.println("inside super base const");
    }
}

class Base extends  superBase{

    protected int i = 10;

    public Integer Print() {
        System.out.println("Base " + this.getClass());

        return 0;
    }

    Base() {
        System.out.println("inside parent const");
        i = 20;
    }

    private void method1() {
    }

    final void method2() {
    }
}

class Derived extends Base {

    int i = 100;
    Base n = new Base();

    Derived() {

        i = 5;

    }

    void method1(int i) {
        // i = super.i;
        System.out.println(i);
    }

    final void method2(int i) {
    }

}

public class inherit2 {
    public static void DoPrint(Base o) {
        o.Print();

    }

    public static void main(String args[]) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        DoPrint(x);
        DoPrint(y);

        DoPrint(z);
        z.method1(5);

        DoPrint(z.n);

    }
}
