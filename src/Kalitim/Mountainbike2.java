package Kalitim;

public class Mountainbike2 extends Bcycle{
		protected String suspan;
		Mountainbike2(int pedal,int hiz,int vites,String suspan){
			super(pedal,hiz,vites);
			this.suspan=suspan;
			
			
		}

		public String getSuspan() {
			return suspan;
		}
		public void setSuspan(String suspan) {
			this.suspan = suspan;
		}
		protected void yaz() {
			super.yaz();
			System.out.println("Süspansiyon Sistemi:"+getSuspan());
			System.out.println("------------------------");
		}
		protected void deneme() {
			System.out.println("deneme");
		}


}

