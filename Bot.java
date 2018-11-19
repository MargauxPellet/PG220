import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;


public class Bot{


  private static String name;

  public Bot(String name){
    this.name=name;
  }

  public static void main (String []args){
    int c = 0;
    while (c == 0){
      if (args[1] == "-p"){
        args[2] = name;
        System.out.println("[" + name + "]");
        Scanner in = new Scanner(System.in);
        String call = in.nextLine();

        call.trim();
        if (call == "@Hello"){
          Date dat= new Date();
          DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
          String date = dateFormat.format(dat) ;
          Calendar cal = Calendar.getInstance();
          String hour = cal.get(Calendar.HOUR_OF_DAY)+"h "+cal.get(Calendar.MINUTE)+"m et "+cal.get(Calendar.SECOND)+"s";

          System.out.println("Salut " + name + "! Nous sommes le " + date + "et il est " + hour);
        }
        if (call == "++") {
          c = c + 1;
        }
        else {
          System.out.println(call);
        }
      }
    }
  }
}
