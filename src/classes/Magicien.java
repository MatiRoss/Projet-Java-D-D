package classes;

public class Magicien {

	private String name;
	private String picture;
	private int hp = 3;
	private int attack = 8;

	public Magicien() {
		name = "";
	}

	public Magicien(String name) {
		this.name = name;
	}

	public Magicien(String name, String picture, int hp, int attack) {
		this.name = name;
		this.picture = picture;
		this.hp = 3;
		this.attack = 8;
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
