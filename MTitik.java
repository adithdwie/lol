public class MTitik{
	public static void main(String[] args){
		float a,b,c;
		
		Titik titik;
		titik = new Titik();
		a = titik.getAbsis();
		b = titik.getOrdinat();
		c = titik.getCounterTitik();
		System.out.println("Titik awal\t: (" + a + "," + b + ")");
		System.out.println("Jumlah Titik\t: " + c);
		
		
		Titik titik2;
		titik2 = new Titik();
		titik.setAbsis(10);
		titik.setOrdinat(20);
		a = titik.getAbsis();
		b = titik.getOrdinat();
		c = titik.getCounterTitik();
		System.out.println("Titik bentukan\t: (" + a + "," + b + ")");
		System.out.println("Jumlah Titik\t: " + c);
	}
}