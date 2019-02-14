package AbstractFactory;

public class AbstractFactoryDemo {
	
	public static void main(String[] args){
	
	
	 AbstractFactory shapeFactory=FactoryProducer.getFactory("Shape");
	 Shape rectangle=shapeFactory.getShape("rectangle");
	 rectangle.draw();
	 
	 Shape circle=shapeFactory.getShape("circle");
	 circle.draw();
	 
	 Shape square=shapeFactory.getShape("square");
	 square.draw();
	 
	 AbstractFactory colorFactory=FactoryProducer.getFactory("Color");
	 Color red=colorFactory.getColor("red");
	 red.fill();
	 
	 Color yellow=colorFactory.getColor("yellow");
	 yellow.fill();
	 
	 Color green=colorFactory.getColor("green");
	 green.fill();
	 
	}
	 

}
