package pl.sternik.pb.fso.car;

import pl.sternik.pb.fso.car.parts.*;

public class CarBuildDirector {
    private CarBuilder builder;

    public CarBuildDirector(CarBuilder builder) {
        this.builder = builder;
    }

    void setBuilder(CarBuilder builder) {
		this.builder = builder;
	}

	public Car constructSportVersion() {
        return builder
        		.withAc(ACType.AUTO)
        		.paintInColor(Color.RED)
        		.setSeats(2)
        		.mountTyresType(TyresType.SPORT)
        		.mountRadioSystem(RadioType.MP3)
        		.withGPS(true)
        		.withComputer(true).build();
    }
    public Car constructStandardVersion() {
        return builder
        		.withAc(ACType.MANUAL)
        		.paintInColor(Color.BLUE)
        		.setSeats(5)
        		.mountTyresType(TyresType.SUMMER)
        		.mountRadioSystem(RadioType.CD)
        		.withGPS(true)
        		.withComputer(false).build();
    }
    public static void main(final String[] arguments) {
        CarBuilder kabrioBuilder = new KabrioBuilder();
        CarBuilder kombiBuilder = new KombiBuilder();
        CarBuildDirector carBuildDirector = new CarBuildDirector(kabrioBuilder);
        System.out.println(carBuildDirector.constructSportVersion());
        
        System.out.println("Przestawiam fabryke na Kombi");
       carBuildDirector.setBuilder(kombiBuilder);
        System.out.println(carBuildDirector.constructStandardVersion());
       
        Car niedorobiony = kabrioBuilder
                .startNewCar()
        		.paintInColor(Color.BLACK)
        		.mountTyresType(TyresType.SPORT)
        		.build();
        System.out.println(niedorobiony);
  	
    }
}