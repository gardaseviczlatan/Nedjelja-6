package nedjelja6vjezbe;
import java.util.ArrayList;
public class Restoran {
	
	private String naziv;
	private String adresa;
	private String pib;
	private ArrayList<Radnik> radnik;
	
	public ArrayList<Radnik> getRadnik() {
		return radnik;
	}
	public void setRadnik(ArrayList<Radnik> radnik) {
		this.radnik = radnik;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getPib() {
		return pib;
	}
	public void setPib(String pib) {
		this.pib = pib;
	}
	public Restoran(String naziv, String adresa, String pib, ArrayList<Radnik> radnik) {
		this.naziv = naziv;
		this.adresa = adresa;
		this.pib = pib;
		this.radnik = radnik;
	}
	
	public void dodajRadnika(Radnik r) {
		radnik.add(r);
	}
	public void izbrisiRadnika(Radnik r) {
		radnik.remove(r.getID());
	}
	
	public Radnik nadjiRadnika(int id) {
		for(Radnik r:this.radnik) {
			if(r.getID() == id) {
				System.out.println(r.getIme());
			}
		}
	}
	
	
	public static void main(String[] args) {
		ArrayList<Radnik> radnik = new ArrayList<>();
		
		Konobar k1 = new Konobar("1", "Marko","Markovic",40,40,0,14);
		Kuvar ku1 = new Kuvar("2","Marko","Ivanovic",40,40,0,1500);
		
		Restoran r1 = new Restoran("Astorija", "City Kvart", "123",radnik);
		r1.dodaj
	}
	
	
	
	
	
	
}
