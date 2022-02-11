import java.util.ArrayList;
public class Tester4 {

public static void main (String[] args) {
EnglishBulldog english1  = new EnglishBulldog("Tom", 2017 ,"Yes!"); 
EnglishBulldog english2 = new EnglishBulldog("Lisa", 2007, "Yes!");
NewFoundLand newfie1 = new NewFoundLand("Jerry", 2014, "No!", "Yes!");
NewFoundLand newfie2 = new NewFoundLand ("Taco", 2021, "No!", "Yes!");

ArrayList<Dog> kennel = new ArrayList<Dog>();
kennel.add(english1);
kennel.add(newfie1);
kennel.add(newfie2);

}
}
