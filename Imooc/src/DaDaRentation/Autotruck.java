package DaDaRentation;

public class Autotruck extends Car implements Accomodation, Weigh {

	public Autotruck() {	
	super.carId = 1;
	name = "Dongfeng";
	price = 1000.0;//如果想在子类中调用父类成员变量，必须先调用父类的构造函数
	}
	
	@Override
	public double cargoCapacity(){
		double cargoCapacity = 5.0;
		return cargoCapacity;
	}

	@Override
	public int passengerCapacity() {
		int passengerCapacity = 50;
		return passengerCapacity;
	}

}
