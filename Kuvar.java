package nedjelja6vjezbe;

public class Kuvar extends Radnik {
	
	private int iznos;

	public int getIznos() {
		return iznos;
	}

	public void setIznos(int iznos) {
		this.iznos = iznos;
	}

	public Kuvar(String iD, String ime, String prezime, double satnica, double ukupnoSati, double plata, int iznos) {
		super(iD, ime, prezime, satnica, ukupnoSati, plata);
		this.iznos = 1500;
	}
	
	public void plata() {
		this.setPlata(iznos + 4 * getSatnica() * getUkupnoSati());
	}
	
	
	
	
	
	
	
	
	
}
