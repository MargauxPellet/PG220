import java.util.Scanner;
import java.util.Date;

public class Name{

	private int size = 10;

	private String nom;

	public Name{
		super();
		this.nom = new Name();
		this.size = new Name();
	}

	public Name(String nom, int size){
		this.nom = nom;
		this.size = size;
	}

	public give_name(){
		 return this.nom = nom;
	}
	public give_size(){
		return this.size = size;
	}
	public void setname(){
		this.nom = nom ; 
	}

	public void setsizemax(){
		this.size = size ; 
	}

	public static void main(String[] args) {
	try {
		Scanner sc = new Scanner (System.in);
		Date dat= new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
		String dt= dateFormat.format(dat) ;
		System.out.println("Salut"nom ) ; 
		System.out.println(dt);

	}
}
