public class EnglishBulldog extends Dog { 
	private String shortSnout;
	
	
public EnglishBulldog(String name, int birth, String shortSnout) {
super(name, birth);
this.shortSnout =  shortSnout;
 
}

public void tugWar () { 
	


}

public String toString () {
	return ("The dogs name and birth is " + super.toString() + ". The dogs speciality is " + shortSnout);
} 
}
