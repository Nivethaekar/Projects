package BuilderPattern;

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public float cost() {
		return 10f;
	}

}
