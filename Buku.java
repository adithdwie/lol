
public class Buku extends ItemKoleksi{
	private String pengarang;

	Buku(int a, String b, int c, String d){
		super(a,b,c);
		this.pengarang = d;
	}

	public String getPengarang(){
		return this.pengarang;
	}

	public void printInfo(){
		super.printInfo();
		System.out.println("Pengarang : " + this.getPengarang());
	}

	public int hitungBiayaPinjam(int a){
		return a*500;
	}
}
