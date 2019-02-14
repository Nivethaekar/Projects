package softwareCraftsmanship;

public class East implements Direction {

	public Direction turnLeft() {
		return new North();
	}

	public Direction turnRight() {
		return new South();
	}

	public Position moveForward(Position position) {
		return position.translateX(1);
	}}
