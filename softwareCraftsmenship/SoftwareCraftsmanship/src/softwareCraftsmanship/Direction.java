package softwareCraftsmanship;

public interface Direction {

	Position moveForward(Position position);

	Direction turnRight();

	Direction turnLeft();

	static Direction getDirection(String direction) {
		switch (direction) {
		case "N":
			return new North();
		case "S":
			return new South();
		case "W":
			return new West();
		case "E":
			return new East();
		}
		return (Direction) new IllegalAccessException();

	};
	
}
