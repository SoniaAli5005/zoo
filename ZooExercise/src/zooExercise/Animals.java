package zooExercise;

public abstract class Animals {

	//////Attributes////
	protected int weight;
	protected String name;
	
	
	
	//////Constructors///
	public Animals(String vName) {
		this.name = vName;
		this.weight=0;
	}
	public Animals(String vName, int vWeight) {
		this.name = vName;
		this.weight = vWeight;
	}
		
	///////Method///////
	public void setWeight(int vWeight) {
		this.weight = vWeight;
	}
} 