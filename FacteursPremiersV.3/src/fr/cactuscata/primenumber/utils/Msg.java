package fr.cactuscata.primenumber.utils;

import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

import fr.cactuscata.primenumber.Main;

public final class Msg {

	public static final void sendBoxMessage(final String message, final Object... wanted) {
		JOptionPane.showMessageDialog(null, String.format(message, wanted), Main.PROGRAM_NAME,
				JOptionPane.INFORMATION_MESSAGE);
	}

	public static final String getAnswer(final String question, final String... wanted) {

		final List<String> list = Arrays.asList(wanted);
		final String answer = JOptionPane.showInputDialog(null, question, Main.PROGRAM_NAME,
				JOptionPane.QUESTION_MESSAGE);
		return answer == null || answer.isEmpty() || (!list.isEmpty() && !list.contains(answer))
				? Msg.getAnswer(question, wanted)
				: answer;

	}

	public static final long getNumber(final String question) {
		try {
			return Long.parseLong(Msg.getAnswer(question));
		} catch (final NumberFormatException e) {
			return getNumber(question);
		}
	}

}
