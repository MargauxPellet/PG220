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
    String argument = args[0];
    String name = args[1];
    while (true)
    {
      System.out.println("[" + name + "]");

      Scanner in = new Scanner(System.in);
      String call = in.nextLine();
      //call.trim();

      if (call.equals("++"))
      {
        System.exit(0);
      }

      else if (call.equals("@hello"))
      {
        Date dat= new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
        String date = dateFormat.format(dat) ;

        Calendar cal = Calendar.getInstance();
        String hour = cal.get(Calendar.HOUR_OF_DAY) + " heures " + cal.get(Calendar.MINUTE) + " minutes et " + cal.get(Calendar.SECOND)+" secondes.";

        System.out.println("[hello] Salut " + name + "! Nous sommes le " + date + " et il est " + hour);
      }

      else //if (call != "@hello" && call != "++")
      {
        System.out.println("[hello] " + call);
      }

    }
  }
}
