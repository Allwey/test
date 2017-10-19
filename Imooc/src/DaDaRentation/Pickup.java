package DaDaRentation;

public class Pickup extends Car implements Accomodation, Weigh {

	public Pickup() {	
		carId = 2;
		name = "Tongyong";
		price = 700.0;//如果想在子类中调用父类成员变量，必须先调用父类的构造函数
		}
	
	@Override
	public double cargoCapacity() {
		double cargoCapacity = 4.0;
		return cargoCapacity;
	}

	@Override
	public int passengerCapacity() {
		int passengerCapacity = 40;
		return passengerCapacity;
	}

}
