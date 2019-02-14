package softwareCraftsmanship;

public class South implements Direction {

	public Direction turnLeft() {
		return new East();
	}

	public Direction turnRight() {
		return new West();
	}

	int moveForwardFromSouth(int yPosition) {
		return yPosition--;
	}

	public Position moveForward(Position position) {
		return position.translateY(-1);
	}

}
