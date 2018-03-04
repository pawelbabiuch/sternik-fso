package pl.sternik.pb.fso.car;

import pl.sternik.pb.fso.car.parts.*;

public class KabrioBuilder implements CarBuilder {
	private Car car;

	public KabrioBuilder() {
		car = new Car();
		car.setCarType(CarType.KABRIO);
	}
	@Override
	public CarBuilder startNewCar() {
		car = new Car();
		car.setCarType(CarType.KABRIO);
		return this;
	}
	@Override
	public CarBuilder withAc(ACType withAC) {
		car.setWithAC(withAC);
		return this;
	}
	@Override
	public CarBuilder paintInColor(Color color) {
		car.setColor(color);
		return this;
	}
	@Override
	public CarBuilder setSeats(int seats) {
		car.setSeats(seats);
		return this;
	}
	@Override
	public CarBuilder mountTyresType(TyresType tyresType) {
		car.setTyresType(tyresType);
		return this;
	}
	@Override
	public CarBuilder mountRadioSystem(RadioType radio) {
		car.setRadio(radio);
		return this;
	}
	@Override
	public CarBuilder withGPS(boolean withGps) {
		car.setWithGps(withGps);
		return this;
	}
	@Override
	public CarBuilder withComputer(boolean withComputer) {
		car.setWithComputer(withComputer);
		return this;
	}
	@Override
	public Car build() {
		return car;
	}
}