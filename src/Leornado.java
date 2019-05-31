import Interface.IArtist;

public class Leornado extends BaseCharacter implements IArtist {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Leornado");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("Menggambar lukisan");
	}

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		System.out.println( aname +  "Melukis");
	}

}
