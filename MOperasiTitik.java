public class MOperasiTitik{
	public static void main(String[] args){
		Titik t;
		OperasiTitik o;
		t = new Titik(4,4);
		o = new OperasiTitik();
		System.out.printf("Hasil Titik sebelum direfleksi = (%.2f,%.2f)\n",t.getAbsis(),t.getOrdinat()); //hasil sebelum refleksi
		o.refleksiX(t);
		System.out.printf("Hasil Refleksi sumbu x = (%.2f,%.2f)\n",t.getAbsis(),t.getOrdinat()); //hasil sesudah direfleksi sumbu x
		o.refleksiY(t);
		System.out.printf("Hasil Refleksi sumbu y = (%.2f,%.2f)\n",t.getAbsis(),t.getOrdinat()); //hasil sesudah direfleksi sumbu y
	}
}