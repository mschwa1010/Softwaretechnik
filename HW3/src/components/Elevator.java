package components;

public class Elevator {

	private int currentFloor = 5;
	private int destFloor;
	
	private States state = States.IDLE;
	
	public void goUp() {
		
		state = States.MOVING_UP;
		System.out.println(state);
		currentFloor+=1;
		goToDest();

	}
	
	public void goDown() {
		
		state = States.MOVING_DOWN;
		System.out.println(state);
		currentFloor-=1;
		goToDest();

	}
	
	public void goToDest() {
		
		if(currentFloor<destFloor) {
			
			goUp();
			
		} else if(currentFloor>destFloor) {
			
			goDown();
			
		}else arrivedToDest();		
		
	}

	public void arrivedToDest() {
		
		System.out.println("Arrived to Floor: " + currentFloor);
		state = States.IDLE;

	}

	public void setDestFloor(int destFloor) {
		
		if(destFloor<0 || destFloor>10) {
			System.err.println("Error! Please contact support!");
			return;
		}

		System.out.println("Destination floor is: " + destFloor);
		this.destFloor = destFloor;
		goToDest();

	}

	public int getCurrentFloor() {
		return currentFloor;
	}

}
