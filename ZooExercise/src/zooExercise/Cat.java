package zooExercise;

public class Cat extends Mammals implements Sounds{
	//////Attributes////
	String colour;
		
	//////Constructors///
	public Cat(String vColour, String vSpecies, String vName, int vWeight) {
		super(vSpecies, vName, vWeight);
		this.colour = vColour;
	}
	
	public Cat(Cat vCat) {
		super(vCat.getSpecies(), vCat.name);
	}
	
	///////Method///////
	public void sound() {
		//System.out.println("Meow");
		
		super.sound();
	}
	
	
	
	
}
