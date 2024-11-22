package Vehicle;

public class ScooterEssence extends Scooter{

	public ScooterEssence(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public String toString() {
		return "Scooter à essence de modèle : " + this.modele + 
				" de couleur " + this.couleur;
	}
	
	@Override
	public void afficheCaracteristiques() {
		System.out.println(this);
	}
}
