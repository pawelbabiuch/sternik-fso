package pl.sternik.pb.fso.car;

import pl.sternik.pb.fso.car.parts.ACType;
import pl.sternik.pb.fso.car.parts.Color;
import pl.sternik.pb.fso.car.parts.RadioType;
import pl.sternik.pb.fso.car.parts.TyresType;

public interface CarBuilder {

	public CarBuilder startNewCar();
	public CarBuilder withAc(ACType withAC);
	public CarBuilder paintInColor(Color color);
	public CarBuilder setSeats(int seats);
	public CarBuilder mountTyresType(TyresType tyresType);
	public CarBuilder mountRadioSystem(RadioType radio);
	public CarBuilder withGPS(boolean withGPS);
	public CarBuilder withComputer(boolean withComputer);
	
	Car build();
}
