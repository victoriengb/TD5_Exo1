package Vehicle;

public class AutomobileDiesel extends Automobile{

	public AutomobileDiesel(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public String toString() {
		return "Automobile diesel de modèle : " + this.modele + 
				" de couleur " + this.couleur;
	}
	
	@Override
	public void afficheCaracteristiques() {
		System.out.println(this);
		
	}
	
	
}
