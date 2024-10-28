package javaPrgm;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class dateSort {
    public static void main(String args[]) throws ParseException {

        String[] dateInputArray = {"01/20/2020", "3/23/2020", "05/13/2020", "02/28/2020", "10/11/2020"};



        List<String> inputList = Arrays.asList(dateInputArray);

        Arrays.sort(dateInputArray);
        System.out.println("#test.test sort");

        System.out.println(Arrays.toString(dateInputArray));
        System.out.println("#after test.test sort");
        System.out.println(Arrays.toString(dateInputArray));
        //System.out.println(String.format("%02d/%02d/%04d", dateInputArray[0].split("/")[0], dateInputArray[0].split("/")[1], dateInputArray[0].split("/")[2]));
        System.out.println(String.format("%02d", 3));
        System.out.println("After Sorting");

//To format date in format


        DateTimeFormatter df = DateTimeFormatter.ofPattern("M/d/yyyy");

        for (int i = 0; i < dateInputArray.length; i++) {
            //dateInputArray[i] = LocalDate.parse(dateInputArray[i], df).toString();
            dateInputArray[i] = String.format("%02d/%02d/%04d",
                    Integer.parseInt(dateInputArray[i].split("/")[0]),
                    Integer.parseInt(dateInputArray[i].split("/")[1]), Integer.parseInt(dateInputArray[i].split("/")[2]));
            System.out.println(dateInputArray[i]);
        }


        System.out.println(Arrays.toString(dateInputArray));

        inputList.sort((d1, d2) -> d1.compareTo(d2));
        System.out.println("After SOrting");
        inputList.forEach(d1 -> System.out.println(d1));

    }

}
