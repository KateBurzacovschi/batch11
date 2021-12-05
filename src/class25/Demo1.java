package class25;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;


public class Demo1 {
    public static void main(String[] args) {


        String name = "Hasim";
        String name2 = "Ahmet";
        String[] names = {"Kate", "Peter"};

        //  1.Arrays are fixed in size

        ArrayList<String> listOfNames = new ArrayList<>();
        System.out.println("size " + listOfNames.size());
        listOfNames.add("Kate");
        listOfNames.add("Max");
        System.out.println("size "+listOfNames.size());
    }
}