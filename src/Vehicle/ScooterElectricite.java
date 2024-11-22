package Vehicle;

public class ScooterElectricite extends Scooter{

	public ScooterElectricite(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public String toString() {
		return "Scooter électrique de modèle : " + this.modele + 
				" de couleur " + this.couleur;
	}
	
	@Override
	public void afficheCaracteristiques() {
		System.out.println(this);
	}
}
