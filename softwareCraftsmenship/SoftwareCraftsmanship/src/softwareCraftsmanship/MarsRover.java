package softwareCraftsmanship;

public class MarsRover {

	 Position position;
	 Direction direction;


	public MarsRover(Position position, Direction direction) {
		this.position = position;
		this.direction = direction;
	}

	void move(char command) {
		switch (command) {
		case 'L':
			direction = direction.turnLeft();
			break;
		case 'R':
			direction = direction.turnRight();
			break;
		case 'M':
			position = direction.moveForward(position);
			break;
		}
	} 
	
	public Position getCurrentPosition(){
		return this.position;
	}

}
