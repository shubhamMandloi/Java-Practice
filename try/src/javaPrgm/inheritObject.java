package javaPrgm;

class A {
    int x = 10;
    int y = 20;
static int xy;

    void m1() {
        System.out.println("A m1");
    }

    static void m2() {
        System.out.println("A m2--"+xy);
        xy++;
        System.out.println("A m2--"+xy);
    }
    void m3() {
        System.out.println("A m3");
    }
}

class B extends A {
    int y = 30;
    int x = 100;
    int z = 40;

    static void m2() {
        System.out.println("B m2");
    }

    void m3() {
        System.out.println("B m3");
    }
}

class C extends A {
}


class inheritObject {
    public static void main(String[] args) {


        A a1 = new B();
        System.out.println(a1.x);//10
        System.out.println(a1.y);//20
        //System.out.println(a1.z);//40

        a1.m1();// A m1
        a1.m2();//A m2
        a1.m3();//B m3

        B a2 = new B();
        System.out.println(a2.x);//100
        System.out.println(a2.y);//30
        System.out.println(a2.z);//40

        a2.m1();// A m1
        a2.m2();//B m2
        a2.m3();//B m3


    }

}