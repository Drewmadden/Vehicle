package CiscFinal1;

public  class Car extends Vehicle implements AbstractVehicle  {
	
	private int NumberOfDoors;
	
	public Car(){	
	}
	public int getNumberOfDoors() {
		return NumberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}
	public Car(int NumberOfDoors){
		this.NumberOfDoors= NumberOfDoors;
	}
	@Override
	public void transferOwnerShip(Person newOwner){
		Owner = newOwner;
	}    }
