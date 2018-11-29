package zooExercise;

public class Mammals extends Animals{
	//////Attributes////
	private String species; 

	
	
	//////Constructors///
	public Mammals(String vSpecies,String vName,int vWeight) {
		super(vName,vWeight);
		this.species = vSpecies;
	}
	
	public Mammals(String vSpecies, String vName) {
		this(vSpecies,vName,0);
	}

	
	///////Method///////
	public String getSpecies() {
		return this.species;
	}

}
