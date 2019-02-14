package factoryPattern;

public class FactoryPatternDemo {
	
	public static void main(String[] args){
		
		ShapeFactory factory=new ShapeFactory();
		Shape rectangle=factory.getShape("rectangle");
		rectangle.draw();
		
		Shape square=factory.getShape("square");
		square.draw();
		
		Shape circle=factory.getShape("circle");
		circle.draw();
	}
	
}
