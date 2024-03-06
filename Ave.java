package actividad5;

import java.util.Random;

public class Ave extends Animal{
	Random Rand3 = new Random();
	int sizePluma = Rand3.nextInt(10);
	int numAlas = 2;

	@Override
	public String formaDeMoverse() {
		String move3 = "Puede moverse con sus patas o volar con sus alas";
		return move3;
	}

}
