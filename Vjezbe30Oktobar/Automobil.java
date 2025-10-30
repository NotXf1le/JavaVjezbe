package Default;

public class Automobil extends Vozilo{
	private int brojVrata;
	private String tipMotora;
	
	public int getBrojVrata() { return brojVrata; }
	public String getTipMotora() { return tipMotora; }
	
	public void setBrojVrata(int value) {  brojVrata = value; }
	public void setTipMotora(String value) {  tipMotora = value; }

	public Automobil(String proizvodjac, int godinaProizodnje, int kubikaza, String boja, int brojVrata, String tipMotora) 
	{
		this.proizvodjac = proizvodjac;
		this.godinaProizodnje = godinaProizodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
		setBrojVrata(brojVrata);
		setTipMotora(tipMotora);
	}
	
	private int cijenaRegistracije()
	{
		int osnovica = osnovicaRegistracije();
		int cijena = osnovica + (tipMotora.toLowerCase() == "dizel" ? 20 : 0);
		
		return cijena;
		
	} 
	 
	@Override
	public String toString()
	{
		return " Tip voizlia " + this.getClass().getSimpleName() +
	   osnovniPodaci() + " " +
	 " BrojVrata " + brojVrata + 
	  " tipMotora " + tipMotora +
		 "\nCijena registracije: " + cijenaRegistracije();
	 
	}
}
