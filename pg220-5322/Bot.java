import java.io.*;
import java.util.*;
import java.lang.*;
import java.text.*;


public class Bot{


    private static String name;
    private static int nombre;

    public Bot(String name) throws Arginvalide{
        verifierArg(name);
        this.name=name;
    }

    public nbBot(int nombre) throws ArgInvalide{
        this.nombre = nombre;
    }

    private void verifierArg(String name) throws ArgInvalide {
        if(this.name != name){
            throw new Arginvalide(name);
        }
    }
    public void Nbincrement(int nombre, String name) throws Arginvalide{
        
        verifierArg(name);
        if (name != this.name) {
            this.nombre = nombre ++;
        }
    }


    public static void main (String[] args){
        try{
            while (true){
                if (args[0] == "-p"){
                    String name = args[1];
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
                    else if (call == "++") {
                        System.exit(0);
                    }
                    else {
                        System.out.println(call);
                    }
                }
            }
        }
        catch (ArgInvalide e) {
        System.out.println(e);
        } finally {
            x = new Bot();
            System.out.println(x.description());
        }

    }
}
