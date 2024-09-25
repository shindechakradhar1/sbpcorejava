package in.sbp.showmessages.mainclasses;

import in.sbp.showmessages.interfaces.ShowMessages;

public class MainShowMessages {

	public static void main(String[] args) {
		ShowMessages message = 
				msg->System.out.println(msg);
	
				message.displayMessage("PRint this Message");
	}
}
