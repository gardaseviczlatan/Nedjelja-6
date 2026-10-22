package nedjelja6vjezbe;

public class Konobar extends Radnik {
	
	private double prekovremeno;

	public double getPrekovremeno() {
		return prekovremeno;
	}

	public void setPrekovremeno(double prekovremeno) {
		this.prekovremeno = prekovremeno;
	}

	public Konobar(String iD, String ime, String prezime, double satnica, double ukupnoSati, double plata, double prekovremeno) {
		super(iD, ime, prezime, satnica, ukupnoSati, plata);
		this.prekovremeno = prekovremeno;
	}
	
	public Konobar() {
		this(null,null,null,0,0,0,0);
	}
	
	public void izracunajPrekovremeno() {
		this.setPrekovremeno(getSatnica() * 1.2);
	}
	public void plata() {
		this.setPlata(4 * getSatnica() * getUkupnoSati() + getSatnica() * getPrekovremeno() * 1.2);
	}
	
	
	
	
	
}
