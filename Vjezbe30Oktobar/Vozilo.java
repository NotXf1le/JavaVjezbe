package Default;

public class Vozilo {
	protected String proizvodjac;
	protected int godinaProizodnje;
	protected int kubikaza;
	protected String boja;
	
	protected int osnovicaRegistracije()
	{
		int cijena = 100;
		cijena += godinaProizodnje < 2010 ? 30 : 0;
		cijena += kubikaza > 2000 ? 50 : 0;
		
		return cijena;
		
	}
	
	protected String osnovniPodaci()
	{
		return " Proizvodjac: " + proizvodjac + 
				" GodinaProizodnje: " + godinaProizodnje + 
				" Kubikaza: " + kubikaza + 
				" Boja: " + boja;
	 
	}
}
