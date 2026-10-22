package nedjelja6vjezbe;
import java.time.LocalDate;
public class Hrana extends Proizvod {
	
	private int brojKalorija;
	private LocalDate rok;
	

	public int getBrojKalorija() {
		return brojKalorija;
	}

	public void setBrojKalorija(int brojKalorija) {
		this.brojKalorija = brojKalorija;
	}

	public LocalDate getRok() {
		return rok;
	}

	public void setRok(LocalDate rok) {
		this.rok = rok;
	}

	public Hrana(String opis, int barKod, String zemljaProizvodnje, int godinaProizvodnje, double uvoznaCijena,
			int brojKalorija, LocalDate rok) {
		super(opis, barKod, zemljaProizvodnje, godinaProizvodnje, uvoznaCijena);
		this.setBrojKalorija(brojKalorija);
		this.setRok(rok);
	}

	public Hrana() {
		this(null,0,null,0,0,0,null);
	}
	
	/*public void dajCijenu() {
		LocalDate danas = LocalDate.now();
		if(danas.minusMonths(6).isAfter(rok)) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.1);
		}else {
			this.setUvoznaCijena(getUvoznaCijena() * 1.05);
		}
	}*/
	
	public void dajCijenu() {
		if(rok.isBefore(LocalDate.now().plusMonths(6))) {
			this.setUvoznaCijena(getUvoznaCijena() * 1.05);
		}else {
			this.setUvoznaCijena(getUvoznaCijena() * 1.1);
		}
	}

	@Override
	public String toString() {
		return "Hrana [brojKalorija=" + brojKalorija + ", rok=" + rok + ", Opis=" + getOpis() + ", BarKod="
				+ getBarKod() + ", ZemljaProizvodnje=" + getZemljaProizvodnje() + ", GodinaProizvodnje="
				+ getGodinaProizvodnje() + ", UvoznaCijena=" + getUvoznaCijena() + "]";
	}
	
	
	
	
	
	
	
}
