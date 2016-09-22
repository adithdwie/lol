public class OperasiTitik{
	private void refleksiSumbuX (Titik titik){
		float y;
		y = titik.getOrdinat();
		y = (-1) * y;
		titik.setOrdinat(y);
	}
	private void refleksiSumbuY (Titik titik){
		float x;
		x = titik.getAbsis();
		x = (-1) * x;
		titik.setAbsis(x);
	}
	public Titik refleksiX (Titik titik){
		this.refleksiSumbuX(titik);
		//System.out.printf("Hasil Refleksi sumbu x = (%.2f,%.2f)\n",titik.getAbsis(),titik.getOrdinat());
		return titik;
	}
	public Titik refleksiY (Titik titik){
		this.refleksiSumbuY(titik);
		//System.out.printf("Hasil Refleksi sumbu y = (%.2f,%.2f)\n",titik.getAbsis(),titik.getOrdinat());
		return titik;
	}
}