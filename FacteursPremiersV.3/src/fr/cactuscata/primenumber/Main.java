package fr.cactuscata.primenumber;

import java.util.List;

import fr.cactuscata.primenumber.player.Learner;
import fr.cactuscata.primenumber.player.Worker;
import fr.cactuscata.primenumber.utils.Msg;

public final class Main {

	private static final List<Long> primeNumbers = Learner.fillList(Msg.getNumber("Veuillez choisir la mémoire total"));
	public static final String PROGRAM_NAME = "Facteurs Premiers 3.0.1";

	public static final void main(final String[] args) {

		new Worker().getPrimeNumbers(Msg.getNumber("Veuillez choisir le nombre à décomposer."));

		System.exit(0);

	}

	public static final List<Long> getPrimeNumbers() {
		return Main.primeNumbers;
	}

}
