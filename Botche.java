import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;


public class Bot
{


  private static String name;

  public Bot(String name)
  {
    this.name=name;
  }

  public static void main (String[] args)
  {
    while (true)
    {
      String argument = args[0];
      String name = args[1];
      System.out.println("[" + name + "]");
      // try
      // {
      //   Thread.sleep(1000);
      // }
      // catch (InterruptedException ex){
      //   Thread.currentThread().interrupt();
      // }
      Scanner in = new Scanner(System.in);
      String call = in.nextLine();

      call.trim();
      if (call == "++")
      {
        System.exit(0);
      }
      else if (call == "@hello")
      {
        Date dat= new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
        String date = dateFormat.format(dat) ;
        Calendar cal = Calendar.getInstance();
        String hour = cal.get(Calendar.HOUR_OF_DAY)+"h "+cal.get(Calendar.MINUTE)+"m et "+cal.get(Calendar.SECOND)+"s";

        System.out.println("[hello] Salut " + name + "! Nous sommes le " + date + "et il est " + hour);
      }

      else
      {
        System.out.println(call);
      }

    }
  }
}
