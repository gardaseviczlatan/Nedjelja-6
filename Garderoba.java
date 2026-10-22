package nedjelja6vjezbe;

public class Garderoba extends Proizvod {
	
	private String materijal;
	private String sezona;
	public String getMaterijal() {
		return materijal;
	}
	public void setMaterijal(String materijal) {
		this.materijal = materijal;
	}
	public String getSezona() {
		return sezona;
	}
	public void setSezona(String sezona) {
		this.sezona = sezona;
	}
	public Garderoba(String opis, int barKod, String zemljaProizvodnje, int godinaProizvodnje, double uvoznaCijena,
			String materijal, String sezona) {
		super(opis, barKod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.materijal = materijal;
		this.sezona = sezona;
	}
	
	public Garderoba() {
		this(null,0,null,0,0.0,null,null);
	}
	
	public void dajCijenu() {
		this.setUvoznaCijena(getUvoznaCijena() * 1.05);
		//this.uvoznaCijena=this.getUvoznaCijena() * 1.05; ako je protected*
	}
	@Override
	public String toString() {
		return "Garderoba [materijal=" + materijal + ", sezona=" + sezona + ", opis=" + getOpis()
				+ ", BarKod=" + getBarKod() + ", ZemljaProizvodnje=" + getZemljaProizvodnje()
				+ ", godinaProizvodnje=" + getGodinaProizvodnje() + ", UvoznaCijena=" + getUvoznaCijena()
				+ "]";
	}
	
	
	
	
	
	
	
	
}
