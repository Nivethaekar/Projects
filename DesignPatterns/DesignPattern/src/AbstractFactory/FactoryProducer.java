package AbstractFactory;

public class FactoryProducer {

	public  static AbstractFactory getFactory(String factory){
		if(factory==null){
			System.out.println("No factory exists");
		}
		else if(factory.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}
		else if(factory.equalsIgnoreCase("Color")){
			return new ColorFactory();
		}
		return null;
		
	}
}
