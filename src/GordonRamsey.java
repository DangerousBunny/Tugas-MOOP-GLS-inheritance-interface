import Interface.IChef;

public class GordonRamsey extends BaseCharacter implements IChef {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("GordonRamsey");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("Bertanggung jawab menciptakan dan menyusun menu, menentukan harga makanan,");
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println( aname +  "Memasak");
	}
	
}
