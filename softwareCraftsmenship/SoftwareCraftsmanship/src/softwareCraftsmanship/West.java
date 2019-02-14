package softwareCraftsmanship;

public class West implements Direction {

	public Direction turnLeft() {
		return new South();
	}

	public Direction turnRight() {
		return new North();
	}

	public Position moveForward(Position position) {
		return position.translateX(-1);
	}

}
