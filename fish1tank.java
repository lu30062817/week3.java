

public class FishTankCommand {
   Command command;
   public void setCommand(Command command)
   {
	   this.command = command;
   }
   
   public void executeCommand()
   {
	   command.execute();
   }
}
}



