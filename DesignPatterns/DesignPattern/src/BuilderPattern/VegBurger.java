package BuilderPattern;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "VegBurger";
	}

	@Override
	public float cost() {
		return 15f;
	}

}
