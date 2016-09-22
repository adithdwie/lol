
public class ItemKoleksi {
	protected int id;
	protected String judul;
	protected int tahunTerbit;
	protected static int counter;

	ItemKoleksi(int a, String b, int c){
		this.id = a;
		this.judul = b;
		this.tahunTerbit = c;
		counter++;
	}

	public int getCounter(){
		return counter;
	}

	public int getId(){
		return this.id;
	}

	public String getJudul(){
		return this.judul;
	}

	public int getTahunTerbit(){
		return this.tahunTerbit;
	}
	
	public void printInfo(){
		System.out.println("ID : " + this.id + " Judul : " + this.judul + " Tahun terbit : " + this.tahunTerbit);
	}
}
