package nedjelja6vjezbe;

public class Radnik {
	
	private String ID;
	private String ime;
	private String prezime;
	private double satnica;
	private double ukupnoSati;
	private double plata;
	
	
	public double getPlata() {
		return plata;
	}
	public void setPlata(double plata) {
		this.plata = plata;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public double getSatnica() {
		return satnica;
	}
	public void setSatnica(double satnica) {
		this.satnica = satnica;
	}
	public double getUkupnoSati() {
		return ukupnoSati;
	}
	public void setUkupnoSati(double ukupnoSati) {
		this.ukupnoSati = ukupnoSati;
	}
	
	
	public Radnik(String iD, String ime, String prezime, double satnica, double ukupnoSati, double plata) {
		super();
		ID = iD;
		this.ime = ime;
		this.prezime = prezime;
		this.satnica = satnica;
		this.ukupnoSati = ukupnoSati;
		this.plata = plata;
	}
	public Radnik() {
		this(null,null,null,0,0,0);
	}
	
	
	
	
	
	
}
