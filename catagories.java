


public class FishTankCategoriesCommand implements Command{
    FishTank fishTank;
    FishTankCategoriesCommand(FishTank fishTank)
    {
    	this.fishTank = fishTank;
    }
	@Override
	public void execute() {
		fishTank.categories();
		
	}
    


