package javaPrgm;


class bas1 {

}
final class finalBase{

}
class cls2  extends bas1 implements inter, inter2 {

    public void commonMethod(Object obj) {
        System.out.println("inside method");
    }
}

abstract class abs2 implements inter, inter2 {

}

interface inter2 {

    void commonMethod(Object obj);
}

interface inter {
    void commonMethod(Object obj);
}

class inter1 {
    public static void main(String[] args) {
        //abs2 obj = new abs2() ;
        finalBase finalObj = new finalBase();
         new cls2().commonMethod(1);


    }

}