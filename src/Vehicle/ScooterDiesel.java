package Vehicle;

public class ScooterDiesel extends Scooter{

	public ScooterDiesel(String modele, String couleur, int puissance) {
		super(modele, couleur, puissance);
	}

	@Override
	public String toString() {
		return "Scooter diesel de modèle : " + this.modele + 
				" de couleur " + this.couleur;
	}
	
	@Override
	public void afficheCaracteristiques() {
		System.out.println(this);
		
	}
}
