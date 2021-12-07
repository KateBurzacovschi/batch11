package class26;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> subject1=new ArrayList<>();
        subject1.add("SDLC");
        subject1.add("Manual Testing");
        subject1.add("JAva");
        subject1.add("G");
        subject1.add("Selenium");
        subject1.add("TestNg");
        subject1.add("SQL");

       // for(String str:subject1){
           // if(str.length()>4){      not allowed to use this method
            //    subject1.remove(str);
          //  }
      //  }

      // for (int i=0;i<subject1.size();i++){
          // if(subject1.get(i).length()>4){
               // subject1.remove(i);
           // }

       // }
         System.out.println(subject1);
    }
}
