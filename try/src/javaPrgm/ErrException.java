package javaPrgm;

public class ErrException {

    public static void main(String[] args)throws Exception {
        try {

            badMethod();
            System.out.println("A");

        } catch (Exception e) {
            System.out.println("B");

        } /*catch(ArithmeticException e){

        }*/

        finally {
            System.out.println("C");


        }
        System.out.println("D");


        try{
            int age=14;
            assert age <= 18 : "Cannot Vote";
            System.out.println("t ");

        }catch (Error e ){
            System.out.println("Cwd");
            throw new Exception();

        }finally{
            System.out.println("f");
        }
    }



    public static void badMethod() {
    }



}
