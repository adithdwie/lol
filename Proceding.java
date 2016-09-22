
public class Proceding extends ItemKoleksi{
	private int cetakanKe;

	Proceding(int a, String b, int c, int d){
		super(a,b,c);
		this.cetakanKe = d;
	}

	Proceding(int a, String b, int c){
		super(a,b,c);
	}

	public int getCetakanKe(){
		return this.cetakanKe;
	}

	public void printInfo(){
		super.printInfo();
		System.out.println("Cetakan Ke : " + this.getCetakanKe());
	}

	public void setCetakanKe(int a){
		this.cetakanKe = a;
	}

	public int hitungBiayaPinjam(int a){
		return 5000;
	}
}
