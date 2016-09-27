package popups.controller;

import popups.view.Popupsviewer;

public class Controller
{
	private Popupsviewer display;
	
	public Controller(){
		display = new Popupsviewer();
	}
	public void start()
	{
		String answer = "sample";
		while(!answer.equals(""))
		{
			display.displayMessage("look words on the monitor");
			
			answer = display.collectResponse("Who are you?");
			
		}
	}
}
