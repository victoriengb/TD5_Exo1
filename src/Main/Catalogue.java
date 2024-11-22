package Main;

import Factory.FabriqueVehiculeDiesel;
import Factory.FabriqueVehiculeElectricite;
import Factory.FabriqueVehiculeEssence;
import Vehicle.AutomobileDiesel;
import Vehicle.AutomobileElectricite;
import Vehicle.AutomobileEssence;
import Vehicle.ScooterDiesel;
import Vehicle.ScooterElectricite;
import Vehicle.ScooterEssence;

public class Catalogue {
	
	public static void main(String[] args){
		AutomobileDiesel autoDiesel = new FabriqueVehiculeDiesel().creeAutomobile("FIAT", "noir", 0, 0);
		autoDiesel.afficheCaracteristiques();
		ScooterDiesel scootDiesel = new FabriqueVehiculeDiesel().creeScooter("Toyota", "noir", 0);
		scootDiesel.afficheCaracteristiques();
		
		AutomobileElectricite autoElectricite = new FabriqueVehiculeElectricite().creeAutomobile("Tesla", "noir", 0, 0);
		autoElectricite.afficheCaracteristiques();
		ScooterElectricite scootElectricite = new FabriqueVehiculeElectricite().creeScooter("Mitsubishy", "noir", 0);
		scootElectricite.afficheCaracteristiques();
		
		AutomobileEssence autoEssence= new FabriqueVehiculeEssence().creeAutomobile("Audi", "noir", 0, 0);
		autoEssence.afficheCaracteristiques();
		ScooterEssence scootEsseence= new FabriqueVehiculeEssence().creeScooter("Scooter essence", "noir", 0);
		scootEsseence.afficheCaracteristiques();
	}
}
