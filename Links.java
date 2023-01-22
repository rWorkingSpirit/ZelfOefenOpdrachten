public class Links
{
	public Linky rechts;

	Links()
	{
		Linky rechts = new Rechts();
		rechts.setNaam("naam van");
		rechts.setPrijs(22.22);
		this.rechts = rechts;
	}

	public static void main(String[] args)
	{
		Links l = new Links();
		l.Printen();
	}

	public void Printen()
	{
		System.out.println(rechts.getNaam());
		rechts.draaien();
		rechts.DoeIets();
		
	}

}


class Linky
{
	private String naam;
	private double prijs;

	public void draaien(){System.out.println("ik draai linky");}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

	public void DoeIets()
	{
		System.out.println("Gebruik mij linkyom.");
	}

}


class Rechts extends Linky
{
	public String naam;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = "rechts";
	}
	
	public void draaien()
	{
		System.out.println("ik draai rechts");
	}



	public void DoeIets()
	{
		System.out.println("Gebruik mij rechtsom.");
	}
}
