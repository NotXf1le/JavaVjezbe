package Default;

public class Kamion extends Vozilo{
	private int kapacitetTereta;
	private boolean hasPrikolica;
	
	public int getKapacitetTereta() { return kapacitetTereta; }
	public boolean getHasPrikolica() { return hasPrikolica; }
	
	public void setKapacitetTereta(int value) {  kapacitetTereta = value; }
	public void setHasPrikolica(boolean value) {  hasPrikolica = value; }
	
	public Kamion(String proizvodjac, int godinaProizodnje, int kubikaza, String boja, int kapacitetTereta, boolean hasPrikolica) 
	{
		this.proizvodjac = proizvodjac;
		this.godinaProizodnje = godinaProizodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
		setKapacitetTereta(kapacitetTereta);
		setHasPrikolica(hasPrikolica);
	}
	
	private int cijenaRegistracije()
	{
		int osnovica = osnovicaRegistracije();
		int cijena = osnovica + (hasPrikolica ? 50 : 0);
		
		return cijena;
		
	}
	@Override
	public String toString()
	{
		return " Tip voizlia " + this.getClass().getSimpleName() +
	   osnovniPodaci() + " " +
	 " KapacitetTereta " + kapacitetTereta + 
	  " HasPrikolica " + hasPrikolica +
		 "\nCijena registracije: " + cijenaRegistracije();
	 
	}
}
