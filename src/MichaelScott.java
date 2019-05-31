import Interface.IArtist;
import Interface.IDriver;
import Interface.IWorker;

public class MichaelScott extends BaseCharacter implements IWorker, IArtist, IDriver  {

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

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("MichaelScott");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("Memiliki 3 perkerjaan seperti berkerja, melukis, dan berkendara");
	}

}
