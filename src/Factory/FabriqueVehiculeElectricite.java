package Factory;

import Vehicle.Automobile;
import Vehicle.AutomobileElectricite;
import Vehicle.Scooter;
import Vehicle.ScooterElectricite;

public class FabriqueVehiculeElectricite implements FabriqueVehicule{

	@Override
	public AutomobileElectricite creeAutomobile(String modele, String couleur, int puissance, double espace) {
		return new AutomobileElectricite(modele, couleur, puissance, espace);
	}

	@Override
	public ScooterElectricite creeScooter(String modele, String couleur, int puissance) {
		return new ScooterElectricite(modele, couleur, puissance);
	}
	
}
