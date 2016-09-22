
public class MItemKoleksi {
	public static void main(String[] args){
		Buku b = new Buku(1,"PBO",2015,"Latanza");
		Majalah m = new Majalah(1,"IF",2015,4);
		Proceding p = new Proceding(1,"SNIK",2015,1);
		Proceding p2 = new Proceding(2,"SOA",2015);

		System.out.println("adalah"+m.hitungBiayaPinjam(7));
		b.printInfo();
		m.getCounter();
		p.setCetakanKe(2);
		b.getPengarang();
	}
}
