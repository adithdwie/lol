
public class Majalah extends ItemKoleksi{
	private int bulanTerbit;

	Majalah(int a, String b, int c, int d){
		super(a,b,c);
		this.bulanTerbit = d;
	}

	public int getBulanTerbit(){
		return this.bulanTerbit;
	}

	public void printInfo(){
		super.printInfo();
		System.out.println("Bulan terbit : " + this.getBulanTerbit());
	}

	public int hitungBiayaPinjam(int a){
		return a*1500*(1+1/super.tahunTerbit);
	}
}
