public class NewFoundLand extends Dog  {
	private String swim;
	
	
public NewFoundLand(String name, int birth, String shortSnout, String swim) {
super(name, birth);
this.swim =  swim;
 
}


public void works () {
	
}

public String toString () {
	return ("The dogs name and birth is " + super.toString() + ". The dogs speciality is " + swim);
} 
}
