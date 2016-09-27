package popups.view;

import javax.swing.JOptionPane;

public class Popupsviewer
{
	/**
	 * Creates a popup message to show the user a string.
	 * 
	 * @param message the String to show the user.
	 */
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Creates a popup to ask a question to the user stores the response
	 * as a string.
	 * @param question The question supplied to the user.
	 * @return The user response as a String.
	 */

	public String collectResponse(String question)
	{
		String response = "";

		response = JOptionPane.showInputDialog(null, question);

		return response;
	}
	/**
	 * Creates a popup to prompt user to choose yes/no/cancel
	 * @param question the question being asked
	 * @return the users response as a String.
	 */
	public int collectOption(String question)
	{
		int optionNumber = 0;
		
		optionNumber = JOptionPane.showConfirmDialog(null, question);
		
		return optionNumber;
	}

}
