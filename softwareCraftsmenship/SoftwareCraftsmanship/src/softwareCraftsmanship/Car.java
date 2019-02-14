package softwareCraftsmanship;

public class Car {
	
	int position;

	Car(int position){
		this.position=position;
	}


	public void addPosition(int addedposition){
		this.position= this.position+addedposition;
	}
	
	public void printPositionOfCar(Car car){
		System.out.println("The car is currently at position "+position);
	}
}
