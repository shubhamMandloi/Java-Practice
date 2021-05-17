package javaPrgm;


class bas1 {

}
final class finalBase{

}
class cls2  extends bas1 implements inter, inter2 {

}

abstract class abs2 implements inter, inter2 {

}

interface inter2 {

}

interface inter {
}

class inter1 {
    public static void main(String[] args) {
        //abs2 obj = new abs2() ;
        finalBase finalObj = new finalBase();
    }

}