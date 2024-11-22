package Factory;

import Vehicle.Automobile;
import Vehicle.AutomobileEssence;
import Vehicle.Scooter;
import Vehicle.ScooterEssence;

public class FabriqueVehiculeEssence implements FabriqueVehicule{

	@Override
	public AutomobileEssence creeAutomobile(String modele, String couleur, int puissance, double espace) {
		return new AutomobileEssence(modele, couleur, puissance, espace);
	}

	@Override
	public ScooterEssence creeScooter(String modele, String couleur, int puissance) {
		return new ScooterEssence(modele, couleur, puissance);
	}

}
