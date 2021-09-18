
public class Test {

	public static void main(String[] args) {
		FishTank fishTank = new FishTank();
		FishTankCommand ftc=new FishTankCommand();
		ftc.setCommand(new FishTankCategoriesCommand(fishTank));
		ftc.executeCommand();
		ftc.setCommand(new FishTankTypesCommand(fishTank));
		ftc.executeCommand();
		ftc.setCommand(new FishTankCapacityCommand(fishTank));
		ftc.executeCommand();
	}

}
