
package project3;

public class Motorbike {
	/* Private means it can only accessed by methods within the class ,  not from outside
	The variable holds the current speed of MotorBike
	 */
	private int speed; 

	// the lines defines the constructor of Motor bike class
	Motorbike(){

		// The line initialize the speed variable of the newly created object to 0
		this.speed=0;
	}


	void start() {

		System.out.println("Vehicle started");
	}


	/* this line simply returns the value of the speed variable allowing other parts of
	 *  the program to retrieve the current speed
	 */
	public int getSpeed() {
		return speed;
	}


	/* method simply takes the speed from getsSpeed() method and set it to speed and also check the speed is more than 0
	 * and assign the value of speed if it is a positive number
	 */

	public void setSpeed(int speed) {
		if (speed>0)

			this.speed = speed;

	}

	// it will take the speed after vehicle start and run on the road
	public void increaseSpeed(int howmuch) {

		this.speed =this.speed + howmuch;
	}
	// it will take the speed when the speed decrease from actual speed
	// speed can be decreased due to speed brakes or anything else
	public void decreaseSpeed(int howmuch) {

		this.speed =this.speed - howmuch;
		// these condition will check the speed is more than the fixed speed limit or lower than than the speed limit
		if(speed >= 90)
			System.out.println("you are too fast police  arrest you \n and you have to pay  fine upto 4000");
		if(speed < 50)
			System.out.println("you are too slow this can cause trffic jam \n so just increase your speed upto 50 to 60");
		if(speed >=50 && speed < 90)
			System.out.println("Your speed is normal you can go smoothly \n  Enjoy your journey");

	}
}



