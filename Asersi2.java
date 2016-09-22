class lingkaran{
	private double jariJari;
	public lingkaran(double jariJari){
		this.jariJari=jariJari;
	}
	public double hitungKeliling(){
		double keliling=2*Math.PI*jariJari;
		return keliling;
	}
}
public class Asersi2{
	public static void main(String[] args){
		int x=0;
		assert(x>0):"jari-jari tidak boleh nol";
		lingkaran l=new lingkaran(x);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("Keliling Lingkaran ="+kelilingLingkaran);
	}
}