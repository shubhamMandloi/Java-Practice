package javaPrgm;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

interface arrayDemo {
    ArrayList<String> unsafeArray = new ArrayList<String>(Arrays.asList("A", "B", "C"));
    List<String> saferArray = Collections.synchronizedList(new ArrayList<String>());
    CopyOnWriteArrayList safeArray = new CopyOnWriteArrayList(Arrays.asList("A", "B", "C"));

}


class ThreadDemo extends Thread implements arrayDemo {


    public void run() {
        try {
            String result = "Thread " +
                    Thread.currentThread().getId() + " ";


            System.out.println(result + "Size of unsafe Array is : " + unsafeArray.size() + " " + unsafeArray);
            unsafeArray.add(result+"E");
            System.out.println(result + "Size of unsafe Array is : " + unsafeArray.size() + " " + unsafeArray);
            unsafeArray.add(result+"F");
            System.out.println(result + "Size of unsafe Array is : " + unsafeArray.size() + " " + unsafeArray);
            System.out.println(result + "End of list Array" + unsafeArray.size());



            saferArray.add(result + "A");
            saferArray.add(result + "B");
            saferArray.add(result + "C");
            System.out.println(result + "Size of Safer Array is : " + saferArray.size() + " " + saferArray);
            saferArray.add(result + "E");
            System.out.println(result + "Size of Safer Array is : " + saferArray.size() + " " + saferArray);
            saferArray.add(result + "F");
            System.out.println(result + "Size of Safer Array is : " + saferArray.size() + " " + saferArray);

          /*  synchronized (saferArray) {
                Iterator it = saferArray.iterator();
                System.out.println(result+"Sync Safer Array :");
                while (it.hasNext()) {
                    System.out.println(result+" " + it.next());
                }



            }*/
            System.out.println(result + "End of sync list array" + saferArray.size());
            System.out.println(result + "Size of Safe Array is : " + safeArray.size() + " " + safeArray);
            safeArray.add(result + "E");
            System.out.println(result + "Size of Safe Array is : " + safeArray.size() + " " + safeArray);
            safeArray.add(result + "F");
            System.out.println(result + "Size of Safe Array is : " + safeArray.size() + " " + safeArray);

            System.out.println(result + "End of sync Safe array" + saferArray.size());


        } catch (Exception E) {
            System.out.println("Exception caught" + E.getMessage());
        }
    }


}

public class mutithread {
    public static void main(String args[]) {

        for (int i = 1; i <= 10; i++) {
            ThreadDemo thread = new ThreadDemo();
            thread.start();

        }
    }
}

