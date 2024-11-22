package Factory;

import Vehicle.Automobile;
import Vehicle.AutomobileDiesel;
import Vehicle.Scooter;
import Vehicle.ScooterDiesel;

public class FabriqueVehiculeDiesel implements FabriqueVehicule{

	@Override
	public AutomobileDiesel creeAutomobile(String modele, String couleur, int puissance, double espace) {
		return new AutomobileDiesel(modele, couleur, puissance, espace);
	}

	@Override
	public ScooterDiesel creeScooter(String modele, String couleur, int puissance) {
		return new ScooterDiesel(modele, couleur, puissance);
	}

}
