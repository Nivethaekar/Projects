package AbstractFactory;

public class ColorFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		return null;
	}

	@Override
	Color getColor(String color) {
		if (color == null)
			System.out.println("No color found");
		else if (color.equalsIgnoreCase("red")) {
			return new Red();
		} else if (color.equalsIgnoreCase("yellow")) {
			return new Yellow();
		} else if (color.equalsIgnoreCase("green")) {
			return new Green();
		}
		return null;
	}

}
