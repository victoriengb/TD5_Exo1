package Vehicle;

public class AutomobileElectricite extends Automobile{

	public AutomobileElectricite(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public String toString() {
		return "Automobile électrique de modèle : " + this.modele + 
				" de couleur " + this.couleur;
	}
	
	@Override
	public void afficheCaracteristiques() {
		System.out.println(this);
		
	}
}
