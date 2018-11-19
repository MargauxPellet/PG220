
public class Name{

	private int size = 10;
	protected String nom;

	public Name(){
		this.nom = "";
		this.size =0;
	}

	public Name(String nom, int size){
		this.nom = nom;
		this.size = size;
	}

	
	public void setname(String nom){
		this.nom = nom ; 
	}

	public void setsizemax(int size){
		this.size = size ; 
	}

	public String description() {
		return ("titre : " + this.nom);
	}
	
}

