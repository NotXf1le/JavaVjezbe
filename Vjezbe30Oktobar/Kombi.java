package Default;

public class Kombi extends Vozilo{
	private int kapacitetPutnika;
	
	public int getKapacitetPutnika() { return kapacitetPutnika; }
	
	public void setKapacitetPutnika(int value) {  kapacitetPutnika = value; }
	
	public Kombi(String proizvodjac, int godinaProizodnje, int kubikaza, String boja, int kapacitetPutnika) 
	{
		this.proizvodjac = proizvodjac;
		this.godinaProizodnje = godinaProizodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;

		setKapacitetPutnika(kapacitetPutnika);
	}
	
	private int cijenaRegistracije()
	{
		int osnovica = osnovicaRegistracije();
		int cijena = osnovica + (kapacitetPutnika > 8 ? 30 : 0);
		
		return cijena;
		
	}
	@Override
	public String toString()
	{
		return " Tip voizlia " + this.getClass().getSimpleName() +
	   osnovniPodaci() + " " +
	 " KapacitetPutnika " + kapacitetPutnika +
	 "\nCijena registracije : " + cijenaRegistracije();
	 
	}
}
