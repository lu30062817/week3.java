



public class FishTankCapacityCommand implements Command{
    FishTank fishTank;
    FishTankCapacityCommand(FishTank fishTank)
    {
    	this.fishTank = fishTank;
    }
	@Override
	public void execute() {
		fishTank.capacity();		
	}
    
}
