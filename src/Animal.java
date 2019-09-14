public class Animal {

	private String name;
	private String sound;

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setSound(String newSound) {
		sound = newSound;
	}

	public String getSound() {
		return sound;
	}
	
	Animal(){
		//this.name = "fara nume";
		//this.sound = "niciun sunet";
	}
	
	Animal(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
	public void show() {
		System.out.println(this.getName() + " makes " + this.getSound());
	}


}