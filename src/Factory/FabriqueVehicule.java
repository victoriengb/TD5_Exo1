package Factory;

import Vehicle.Automobile;
import Vehicle.Scooter;

public interface FabriqueVehicule {
	public abstract Automobile creeAutomobile(String modele, String couleur, int puissance, double espace);
	public abstract Scooter creeScooter(String modele, String couleur, int puissance);
}
