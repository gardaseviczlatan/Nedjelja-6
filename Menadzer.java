package nedjelja6vjezbe;

public class Menadzer extends Radnik {
	private int osnovica;
	private int bonus;
	public int getOsnovica() {
		return osnovica;
	}
	public void setOsnovica(int osnovica) {
		this.osnovica = osnovica;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public Menadzer(String iD, String ime, String prezime, double satnica, double ukupnoSati, double plata,
			int osnovica, int bonus) {
		super(iD, ime, prezime, satnica, ukupnoSati, plata);
		this.osnovica = 1300;
		this.bonus = bonus;
	}
	
	public void plata() {
		this.setPlata(getOsnovica() + 4 * getUkupnoSati() * getSatnica() + getBonus());
	}
	
	
	
	
}
