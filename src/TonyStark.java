import Interface.IArtist;
import Interface.IChef;
import Interface.IDriver;
import Interface.IWorker;

public class TonyStark extends BaseCharacter implements IArtist, IDriver, IWorker, IChef{

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("TonyStark");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("Melakukan semua aktifitas dari bekerja, memasak, melukis dan berkendara");
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println( aname +  "Memasak");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println(aname +  "Berkendara");
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println(aname +  "Melukis");
	}
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(aname +  "Bekerja");
	}

}
