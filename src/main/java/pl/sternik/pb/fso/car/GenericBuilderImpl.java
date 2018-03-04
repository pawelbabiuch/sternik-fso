package pl.sternik.pb.fso.car;


import pl.sternik.pb.fso.car.parts.ACType;
import pl.sternik.pb.fso.car.parts.CarType;
import pl.sternik.pb.fso.car.parts.Color;
import pl.sternik.pb.fso.car.parts.RadioType;
import pl.sternik.pb.fso.car.parts.TyresType;

public class GenericBuilderImpl implements CarBuilder {

	private Car car;
	CarType carType;
	
	public GenericBuilderImpl(CarType carType) {
		car = new Car();
		car.setCarType(carType);
		this.carType = carType;
	}
	
	@Override
	public CarBuilder startNewCar() {
		car = new Car();
		car.setCarType(carType);
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
	public CarBuilder withGPS(boolean withGPS) {
		car.setWithGps(withGPS);
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
