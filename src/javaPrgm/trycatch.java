package javaPrgm;

public class trycatch {

    public static void main(String[] args) {
        try {
            System.out.println("inside try 1");
            //throw new Exception();

        } catch (Exception e) {
            System.out.println("inside catch 1 ");
            try {
                System.out.println("inside ineer try");
            } catch (Exception ex) {
                System.out.println("Inseide innner catch");
            } finally {
                System.out.println("inner finally");
            }
        } finally {
            System.out.println("inside finally");

        }
    }

}
