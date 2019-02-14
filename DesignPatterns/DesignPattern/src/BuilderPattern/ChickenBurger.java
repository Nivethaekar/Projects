package BuilderPattern;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public float cost() {
		return 25f;
	}

}
