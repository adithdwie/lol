import java.util.Scanner;
public class MLingkaran{
	public static void main(String[] args){
	double a;
	Scanner input = new Scanner (System.in);
	System.out.print("Masukkan jejari: ");
	a=input.nextDouble();
	Lingkaran l = new Lingkaran(a);
	System.out.println("Luas Lingkaran dengan jejari "+a+" satuan adalah "+l.hitungLuas());
	}
}