package nedjelja6vjezbe;

public class HemijskiProizvod extends Proizvod {
	
	private double tempSkladistenja;
	private boolean zapaljivo;
	public double getTempSkladistenja() {
		return tempSkladistenja;
	}
	public void setTempSkladistenja(double tempSkladistenja) {
		this.tempSkladistenja = tempSkladistenja;
	}
	public boolean isZapaljivo() {
		return zapaljivo;
	}
	public void setZapaljivo(boolean zapaljivo) {
		this.zapaljivo = zapaljivo;
	}
	public HemijskiProizvod(String opis, int barKod, String zemljaProizvodnje, int godinaProizvodnje,
			double uvoznaCijena, double tempSkladistenja, boolean zapaljivo) {
		super(opis, barKod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.tempSkladistenja = tempSkladistenja;
		this.zapaljivo = zapaljivo;
	}
	
	public HemijskiProizvod() {
		this(null,0,null,0,0,0,false);
	}
	
	public void dajCijenu() {
		if(this.zapaljivo) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.125);
		}else {
			this.setUvoznaCijena(getUvoznaCijena() * 1.1);
		}
	}
	@Override
	public String toString() {
		return "HemijskiProizvod [tempSkladistenja=" + tempSkladistenja + ", zapaljivo=" + zapaljivo + ", Opis="
				+ getOpis() + ", BarKod=" + getBarKod() + ", getZemljaProizvodnje()=" + getZemljaProizvodnje()
				+ ", GodinaProizvodnje=" + getGodinaProizvodnje() + ", UvoznaCijena=" + getUvoznaCijena()
				+ "]";
	}
	
	
	
	
	
	
	
}
