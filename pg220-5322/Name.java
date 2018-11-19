import java.util.Scanner;
import java.util.Date;

public class Name{

	private int size = 10;

	private String nom;

	public Name(){
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
	public void setname(String nom){
		this.nom = nom ; 
	}

	public void setsizemax(int size){
		this.size = size ; 
	}

	public String description() {
		return "Point (" + this.nom + "," + this.size + ") " + super.description();
	}

	public static void main(String[] args) {
	//try {
		Scanner sc = new Scanner (System.in);
		String nom = args[2];

		Date dat= new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy") ;
		String dt= dateFormat.format(dat) ;
		System.out.println("Salut"+ nom.description() ) ; 
		System.out.println(dt);

		//}
	}
}

