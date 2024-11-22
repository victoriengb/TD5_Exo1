package Vehicle;

public class AutomobileEssence extends Automobile{

	public AutomobileEssence(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public String toString() {
		return "Automobile à essence de modèle : " + this.modele + 
				" de couleur " + this.couleur;
	}
	
	@Override
	public void afficheCaracteristiques() {
		System.out.println(this);
		
	}
}
