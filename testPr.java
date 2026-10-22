package nedjelja6vjezbe;
import java.util.ArrayList;
import java.time.LocalDate;
public class testPr {

	public static void main(String[] args) {
		
		
		
		Garderoba g1 = new Garderoba("Majica",13485,"CG",2026,5,"Koza","Zimska");
		HemijskiProizvod hp1 = new HemijskiProizvod("Prasak",74920,"CG",2026,2,15,true);
		Hrana h1 = new Hrana("Pizza",83948,"CG",2025,3,300,LocalDate.of(2025, 5, 5));
		
		ArrayList <Proizvod> lista = new ArrayList<>();
		
		lista.add(g1);
		lista.add(hp1);
		lista.add(h1);
		for(Proizvod p:lista) {
			System.out.println(p);
			
		}
		for(Proizvod p:lista) {
			p.dajCijenu();
			
		}
		
		
		
		
		
		
		
	}

}
