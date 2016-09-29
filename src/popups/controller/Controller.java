package popups.controller;

import popups.view.Popupsviewer;
import popups.model.Thingy;
import java.util.List;
import java.util.ArrayList;

public class Controller
{
	private Popupsviewer display;
	private List<Thingy> thingyList;

	public Controller()
	{
		display = new Popupsviewer();
		thingyList = new ArrayList<Thingy>();
	}

	public void start()
	{
		
	}
	private void askQuestionLoop()
	{
		String answer = "sample";
		
		while (answer != null &&!isDouble(answer))
		{
			answer = display.collectResponse("You need to type a doubble");
		}
	}

	private boolean isDouble(String potentialValue)
	{
		boolean validDouble = false;
		
		try
		{
			double testvalue = Double.parseDouble(potentialValue);
			validDouble = true;
		}
		catch(NumberFormatException exception)
		{
			exception.printStackTrace();
			display.displayMessage("That was not a double =:<");
		}
		return validDouble;
		/**
		 * checks the supplied String value to see if it n be converted to an integer.
		 * if th cannot a popup message is displayed.
		 * @param
		 */
	}

	private boolean isInteger(String potentialValue)
	{
		boolean validInteger = false;
		try
		{
			int testValue = Integer.parseInt(potentialValue);
			validInteger = true;
		} catch (NumberFormatException notIntegerError)
		{
			display.displayMessage(notIntegerError.getMessage());
			display.displayMessage("You need to type an int!");

		}
		return validInteger;
	}
	
	private void learnLists()
	{
		display.displayMessage("This ise size of the list" + thingyLists.size());
		thingyList.add(firstThingy);
		display.displayMessage("This is the size of the list" + thingyList.size);
	}
}

