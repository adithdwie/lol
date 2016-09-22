public class Titik {
		//attribute
		private float absis;
		private float ordinat;
		private static float counterTitik;
		//constructor
		public Titik(){
			this.absis = 0;
			this.ordinat = 0;
			Titik.counterTitik++;
		}
		public Titik(float a,float o){
			this.absis = a;
			this.ordinat = o;
			Titik.counterTitik++;
		}
		//method
		public void setAbsis(float a){
			this.absis=a;
		}
		public void setOrdinat(float o){
			this.ordinat=o;
		}
		public float getAbsis(){
			return absis;
		}
		public float getOrdinat(){
			return ordinat;
		}
		public static float getCounterTitik(){
			return counterTitik;
		} 
}