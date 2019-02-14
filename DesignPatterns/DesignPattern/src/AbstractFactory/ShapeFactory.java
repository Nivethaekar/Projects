package AbstractFactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		if (shape == null) {
			System.out.println("No such shape exists");
		} else if (shape.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else if (shape.equalsIgnoreCase("square")) {
			return new Square();
		} else if (shape.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		return null;
	}

	@Override
	Color getColor(String color) {
		return null;
	}

}
