package softwareCraftsmanship;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MarsRoverSpecs {

	@Test
	public void test() {

		String initialPosition = "3 3 E";
		String commandSequence = "MMRMMRMRRM";

		String[] positions = initialPosition.split(" ");
		int xPosition = Integer.valueOf(positions[0]);
		int yPosition = Integer.valueOf(positions[0]);
		Direction direction = Direction.getDirection(positions[2]);
		
		MarsRover rover=new MarsRover(new Position(xPosition,yPosition),direction);
		for(char command:commandSequence.toCharArray()){
			rover.move(command);
		}
		assertEquals("5 1 E",  rover.getCurrentPosition()+" "+rover.direction); 
	}

}
