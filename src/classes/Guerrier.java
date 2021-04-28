package classes;



public class Guerrier {
	
	private String name;
	private String picture;
	private int hp = 5;
	private int attack = 5;

	public Guerrier() {
		name = "";
	}

	public Guerrier(String name) {
		this.name = name;
	}

	public Guerrier(String name, String picture, int hp, int attack) {
		this.name = name;
		this.picture = picture;
		this.hp = 5;
		this.attack = 5;
	}

	public void setName() {

		this.name = name;

	}

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public String toString() {
		return "Votre personnage s'appelle " + this.name + ", il a " + this.hp + " points de vie " + " et "
				+ this.attack + " d'attaque ";
	}
}
