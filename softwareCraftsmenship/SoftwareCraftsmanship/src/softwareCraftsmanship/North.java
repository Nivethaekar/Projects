package softwareCraftsmanship;

public class North implements Direction {

	 public Direction turnLeft() {
		return new West();
	}

	public Direction turnRight() {
		return new East();
	}

	public Position moveForward(Position position) {
		return position.translateY(1);
	}
	
}
