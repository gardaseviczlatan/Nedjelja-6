package nedjelja6vjezbe;

public class Proizvod {
	//atributi
	private String opis;
	private int barKod;
	private String zemljaProizvodnje;
	private int godinaProizvodnje;
	private double uvoznaCijena;
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public int getBarKod() {
		return barKod;
	}
	public void setBarKod(int barKod) {
		this.barKod = barKod;
	}
	public String getZemljaProizvodnje() {
		return zemljaProizvodnje;
	}
	public void setZemljaProizvodnje(String zemljaProizvodnje) {
		this.zemljaProizvodnje = zemljaProizvodnje;
	}
	public int getGodinaProizvodnje() {
		return godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public double getUvoznaCijena() {
		return uvoznaCijena;
	}
	public void setUvoznaCijena(double uvoznaCijena) {
		this.uvoznaCijena = uvoznaCijena;
	}
	
	public Proizvod() {
		this(null,0,null,0,0.0);
	}
	
	public Proizvod(String opis, int barKod, String zemljaProizvodnje, int godinaProizvodnje, double uvoznaCijena) {
		super();
		this.setOpis(opis);
		this.setBarKod(barKod);
		this.setZemljaProizvodnje(zemljaProizvodnje);
		this.setGodinaProizvodnje(godinaProizvodnje);
		this.setUvoznaCijena(uvoznaCijena);
	}
	
	public void dajCijenu() {
	}
	
	

}
