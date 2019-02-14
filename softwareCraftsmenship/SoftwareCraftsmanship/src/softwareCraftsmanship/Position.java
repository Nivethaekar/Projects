package softwareCraftsmanship;

public class Position {

	private int xPosition;
	private int yPosition;

	public Position(int xPosition, int yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}

	public Position translateY(int delta) {
		return new Position(xPosition,yPosition+delta);
	}

	public Position translateX(int delta) {
		return new Position(xPosition+delta,yPosition);
	}

	
	@Override
	public String toString() {
		return xPosition+" "+yPosition;
	}
}
