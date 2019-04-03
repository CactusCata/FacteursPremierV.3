package fr.cactuscata.primenumber.player;

import java.util.ArrayList;
import java.util.List;

import fr.cactuscata.primenumber.utils.ProgressBar;

public final class Learner {

	public static final List<Long> fillList(final long maxSize) {
		final List<Long> list = new ArrayList<>();
		final ProgressBar progress = new ProgressBar(2, (int) maxSize);
		progress.ini();
		for (long l = 2; l < maxSize; l++) {
			progress.add();
			if (isPrimeNumber(l))
				list.add(l);
		}
		progress.close();
		return list;

	}

	private static final boolean isPrimeNumber(final long n) {
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
