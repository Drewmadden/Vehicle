package CiscFinal1;

public class TestVehicle {
	
    public static void main(String[] args){
   	 Person Guy = new Person();
   	 Guy.setFirstName("Drew");
   	 
   	 Car Mustang= new Car();
   	 Mustang.Owner= Guy;
   	 Mustang.setNumberOfDoors(4);
   	 System.out.println(Mustang.Owner.getFirstName());

   	 Truck Hummer= new Truck();
   	 Hummer.Owner=Guy;
   	 Hummer.setNumberOfAxels(2);

   	 Person CuteGirl= new Person();
   	 CuteGirl.setFirstName("Courtney");
   	 Hummer.Owner=CuteGirl;
   	 
   	 Motorcycle HondaCBR1000= new Motorcycle();
	 HondaCBR1000.setHasSideCar(false);		
	 
	 System.out.println(Hummer.Owner.getFirstName());
    	}       	}
   	 
   	 