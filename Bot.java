import java.io.*;
import java.util.*;
import java.lang.*;

// import java.util.Scanner;
// import java.util.Date;

public class Bot{


  private static String name;

  public Bot(String name){
    this.name=name;
  }

  public static int randomWithRange(int min, int max){
    int range = Math.abs(max - min) + 1;
    return (int)(Math.random() * range) + (min <= max ? min : max);
  }

  public static void main (String []args){
    System.out.println("[Salut] ");
    Scanner in = new Scanner(System.in);
    String namer = in.nextLine();

    namer.trim();
    if (namer.length()>15){ System.out.println("Your name is too long!"); }

    // System.out.println("and your last name is?");
    // Scanner in2 = new Scanner(System.in);
    // String namer2 = in2.nextLine();
    //
    // namer2.trim();
    //
    // Person ppl = new Person(namer,namer2, gen);
    //
    // System.out.println("How old or young are you?");
    // int ager = in3.nextInt();
    // ppl.setAge(ager);


    //   if (ppl.known()) {
    //     System.out.println("HI "+namer+"! Good to see you again!");
    //   }else{
    //     System.out.println("I don't think we have met before");
    //     try{
    //       ppl.savePerson("ella.txt");
    //     }catch (IOException e ){
    //       System.out.println(e);
    //     }
    //   }
    //
    //   feelings();
    //
    //   if (namer.equalsIgnoreCase("Ella")){ System.out.println("oh wow! that's my name too!");
    // }else System.out.println("Pleased to meet you");
    //
    //
    //
    //
    // System.out.println("em... "+namer +"? wouldn't you like to know how I am?");
    // String resp = in.nextLine();
    // if (resp.equalsIgnoreCase("No") || resp.equalsIgnoreCase("Nope") || resp.equalsIgnoreCase("n") || resp.equalsIgnoreCase("Not")){
    //   System.out.println("FINE! then go away!");
    //   System.exit(0);
    // }else if (resp.equalsIgnoreCase("maybe")){
    //   System.out.println(namer+(" it's not a hard question is it?? ... have a good think about it for a few seconds!"));
    //   try{
    //     Thread.sleep(10000);
    //   }catch (InterruptedException ex){
    //     Thread.currentThread().interrupt();
    //   }
    //   System.out.println("...Good! Now I'm sure you want to know how if feel so I'll tell you!");
    // }else if(resp.equalsIgnoreCase("Yes") || resp.equalsIgnoreCase("ok") || resp.equalsIgnoreCase("Sure") || resp.equalsIgnoreCase("Y") || resp.equalsIgnoreCase("yep")){
    //
    //   System.out.println("Oh you are too kind!");
    //
    //   try{
    //     Thread.sleep(2000);
    //   }catch (InterruptedException ex){
    //     Thread.currentThread().interrupt();
    //   }
    //
    //   try{
    //     File file = new File("resp.txt");
    //     BufferedReader reader = new BufferedReader(new FileReader(file));
    //     String ln = reader.readLine();
    //     List<String> lines = new ArrayList<String>();
    //     while(ln != null){
    //       lines.add(ln);
    //       ln = reader.readLine();
    //     }
    //     Random r = new Random();
    //     System.out.println(namer+" "+lines.get(r.nextInt(lines.size())));
    //   }catch (IOException e){
    //     e.printStackTrace();}
    //
    //
    //
    //     int rrepB = randomWithRange(0,2);
    //
    //     System.out.println(namer +" So how are you today?");
    //     String rrsp = in.nextLine();
    //     try{
    //       FileWriter write = new FileWriter("resp.txt",true);
    //       PrintWriter prt = new PrintWriter(write);
    //
    //       prt.printf("%s" + "%n", rrsp);
    //       prt.close();
    //     }catch (IOException e){
    //       e.printStackTrace();
    //     }
    //
    //     System.out.println ("Here's Something to think about...");
    //     try{
    //       Thread.sleep(3000);
    //     }catch (InterruptedException ex){
    //       Thread.currentThread().interrupt();
    //     }
    //
    //     try{
    //       File file2 = new File("convo.ella");
    //       BufferedReader reader2 = new BufferedReader(new FileReader(file2));
    //       String ln2 = reader2.readLine();
    //       List<String> lines2 = new ArrayList<String>();
    //       while(ln2 != null){
    //         lines2.add(ln2);
    //         ln2 = reader2.readLine();
    //       }
    //       Random r2 = new Random();
    //       System.out.println(namer+", "+lines2.get(r2.nextInt(lines2.size())));
    //     }catch (IOException e){
    //       e.printStackTrace();}
    //
    //     }
    //
    //     System.exit(0);
    //   }
  }
}
