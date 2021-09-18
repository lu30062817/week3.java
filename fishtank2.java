
public class FishTankTypesCommand implements Command{
    FishTank fishTank;
    FishTankTypesCommand(FishTank fishTank)
    {
    	this.fishTank = fishTank;
    }
	@Override
	public void execute() {
		fishTank.types();
	}
    
}
