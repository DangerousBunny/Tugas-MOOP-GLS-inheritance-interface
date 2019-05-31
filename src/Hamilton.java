import Interface.IDriver;
import Interface.IWorker;

public class Hamilton extends BaseCharacter implements IDriver, IWorker{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Hamilton");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("Seorang yang mengendarai kendaraan dan bekerja");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println( aname +  "Berkerja");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println( aname +  "Berkendara");
	}

}
