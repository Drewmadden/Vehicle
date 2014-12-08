package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class CiscFinalJUnit {

	@Test
	public void test() {
		Person Guy = new Person();
		Guy.setFirstName("Drew");

	   	Car Mustang= new Car();
	   	Mustang.setOwner(Guy);
	   	Mustang.setNumberOfDoors(4);
	  	assertEquals("First name of the Person is","Drew",Guy.getFirstName());

	  	
	   	Truck Hummer= new Truck();
	   	Hummer.setOwner(Guy);
	   	Hummer.setNumberOfAxels(2);
	  	assertEquals("the Hummer is owned by","Drew",Hummer.getOwner().getFirstName());


	   	Person Girl = new Person();
	   	Girl.setFirstName("Ashley");
	   	Hummer.setOwner(Girl);
	   	assertEquals("the Hummer is now owned by","Ashley",Hummer.getOwner().getFirstName());


	   	Motorcycle HondaCBR1000= new Motorcycle();
	   	HondaCBR1000.setHasSideCar(false);
	   
	   	 
	  	assertEquals("The mustang has 4 doors",4,Mustang.getNumberOfDoors());
	  	assertEquals("The Hummer has 2 axels",2,Hummer.getNumberOfAxels());

	 	assertEquals("Motorcycle has no sidecar",false,HondaCBR1000.getHasSideCar());

		}

}
