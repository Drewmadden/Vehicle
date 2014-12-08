package CiscFinal1;

public  class Truck extends Vehicle implements AbstractVehicle {

	private int NumberOfAxels;
	public Person newOwner;

	public int getNumberOfAxels() {
		return NumberOfAxels;
	}
	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}
	public Truck(){
	}
	public Truck(int NumberOfAxels, Person Owner){
		this.NumberOfAxels=NumberOfAxels;
		this.Owner= Owner;
	}
	public Person ownership(Person newOwner){
		super.transferOwnerShip(newOwner);
		 return  newOwner;
	}   }