package project3;
import java.util.Random;
public class VehicleSpeedSensor {
	static Random rand =new Random();
	static int numberOfVehicle = rand.nextInt(1,5);

	static int typeOfVehicle=rand.nextInt(1,6) ;

	private	static int incrementSpeedOfBike1=rand.nextInt(60,150) ;
	static int decrementSpeedOfBike1=rand.nextInt(0,50);

	static int incrementSpeedOfBike2=rand.nextInt(50,160) ;
	static	int decrementSpeedOfBike2=rand.nextInt(0,50);


	static int incrementSpeedOfCar1=rand.nextInt(60,200) ;
	static int decrementSpeedOfcar1=rand.nextInt(0,60);


	static	int incrementSpeedOfCar2=rand.nextInt(60,190) ;
	static int decrementSpeedOfcar2=rand.nextInt(0,50);


	static int incrementSpeedOfTruck1=rand.nextInt(40,130);
	static int decrementSpeedOfTruck1=rand.nextInt(0,30);

	static int incrementSpeedOfTruc2=rand.nextInt(40,140);
	static int decrementSpeedOfTruck2=rand.nextInt(0,35);

	static truckSensor truck2 =new truckSensor();
	static truckSensor truck1 =new truckSensor();
	
	static Motorbike bike1 = new Motorbike();
	static Motorbike bike2 = new Motorbike();
	
	static CarSensor car1 = new CarSensor();
	static CarSensor car2 = new CarSensor();


	public static int bike1Speed(int bk1s) {
		bike1.setSpeed(20);
		bike1.increaseSpeed(incrementSpeedOfBike1);
		bike1.decreaseSpeed(decrementSpeedOfBike1);
		return  bike1.getSpeed();
	}
	public static int bike2Speed(int bk2s) {
		bike2.setSpeed(20);
		bike2.increaseSpeed(incrementSpeedOfBike1);
		bike2.decreaseSpeed(decrementSpeedOfBike1);
		return  bike2.getSpeed();
	}
	public static int car1Speed( int car1S) {

		car1.setSpeed(12);
		car1.increaseSpeed(incrementSpeedOfCar1);
		car1.decreaseSpeed(decrementSpeedOfcar1);
		return  car1.getSpeed();

	}

	public static int car2Speed( int car2S) {

		car2.setSpeed(12);
		car2.increaseSpeed(incrementSpeedOfCar1);
		car2.decreaseSpeed(decrementSpeedOfcar1);
		return  car2.getSpeed();
	}

	public static int truck1Speed(int tk1S) {

		truck1.setSpeed(23);
		truck1.increaseSpeed(incrementSpeedOfTruck1);
		truck1.decreaseSpeed(decrementSpeedOfTruck1);
		return  truck1.getSpeed();
	}
	public static int truck2Speed(int tk2S) {

		truck2.setSpeed(23);
		truck2.increaseSpeed(incrementSpeedOfTruck1);
		truck2.decreaseSpeed(decrementSpeedOfTruck1);
		return  truck2.getSpeed();
	}

	public static void main(String[] args) {

		switch( numberOfVehicle) {
		case 1:
			numberOfVehicle=1;

			switch(typeOfVehicle) {
			case 1:
				typeOfVehicle=1;
				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				break;

			case 2:
				typeOfVehicle=2;	
				System.out.println("Speed of Car: " +   car1Speed(car1.getSpeed()));
				break;
			case 3:
				typeOfVehicle=3;
				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));
				break;

			case 4:
				typeOfVehicle=4;
				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				break;
			case 5:
				typeOfVehicle=5;
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));
				break;
			case 6:
				typeOfVehicle=6;
				System.out.println("Speed of bike: " + bike2Speed(bike2.getSpeed()));
				break;
			}
			break;

		case 2:			
			numberOfVehicle=2;
			switch(typeOfVehicle) {
			case 1:
				typeOfVehicle=1;
				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				System.out.println("Speed of Car: " +   car1Speed(car1.getSpeed()));
				break;

			case 2:
				typeOfVehicle=2;
				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));
				System.out.println("Speed of bike: " + bike2Speed(bike2.getSpeed()));

				break;

			case 3:
				typeOfVehicle=3;

				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));
				System.out.println("Speed of Car: " +   car1Speed(car1.getSpeed()));
				break;

			case 4:
				typeOfVehicle=4;
				System.out.println("Speed of Car: " +   car1Speed(car1.getSpeed()));
				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				break;

			case 5:
				typeOfVehicle=5;

				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));
				break;

			case 6:
				typeOfVehicle=6;
				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				System.out.println("Speed of bike: " + bike2Speed(bike2.getSpeed()));

				break;
			}
			break;
		case 3:
			numberOfVehicle=3;

			switch(typeOfVehicle) {

			case 1:
				typeOfVehicle=1;

				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));
				System.out.println("Speed of bike: " + bike2Speed(bike2.getSpeed()));
				System.out.println("Speed of Car: " +   car1Speed(car1.getSpeed()));
				break;

			case 2:
				typeOfVehicle=2;
				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));
				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				break;

			case 3:
				typeOfVehicle=3;

				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				System.out.println("Speed of bike: " + bike2Speed(bike2.getSpeed()));
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));


				break;
			case 4:
				typeOfVehicle=4;
				System.out.println("Speed of bike: " + bike2Speed(bike2.getSpeed()));
				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));

				break;
			case 5:
				typeOfVehicle=5;

				System.out.println("Speed of Car: " +   car1Speed(car1.getSpeed()));
				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));
				break;

			case 6:
				typeOfVehicle=6;
				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));
				break;
			}
			break;

		case 4:
			numberOfVehicle=4;

			switch(typeOfVehicle) {

			case 1:
				typeOfVehicle =1;
				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));
				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				System.out.println("Speed of bike: " + bike2Speed(bike2.getSpeed()));

				break;
			case 2:
				typeOfVehicle=2;

				System.out.println("Speed of Car: " +   car1Speed(car1.getSpeed()));
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));
				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				break;

			case 3:
				typeOfVehicle=3;
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));
				System.out.println("Speed of truck: " +  truck2.getSpeed());
				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));

				break;
			case 4:
				typeOfVehicle=4;
				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));

				break;
			case 5:
				typeOfVehicle=5;

				System.out.println("Speed of Car: " +  car2Speed(car2.getSpeed()));
				System.out.println("Speed of bike: " + bike2Speed(bike2.getSpeed()));				
				System.out.println("Speed of Car: " +   car1Speed(car1.getSpeed()));
				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));

				break;

			case 6:

				typeOfVehicle=5;

				System.out.println("Speed of Bike: " + bike1Speed( bike1.getSpeed()));
				System.out.println("Speed of truck: " +  truck2Speed(truck2.getSpeed()));
				System.out.println("Speed of Car: " +   car1Speed(car1.getSpeed()));
				System.out.println("Speed of truck: " +   truck1Speed(truck1.getSpeed()));

				break;
			}
			break;
		default:
			System.out.println("There is no car passing through the sensor");
		}

	}
}




