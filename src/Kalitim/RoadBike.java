package Kalitim;

public class RoadBike extends Bcycle{
	protected int lastik;
	RoadBike(int pedal,int hiz,int vites,int lastik){
		super(pedal,hiz,vites);
		this.lastik=lastik;
	}
	public int getLastik() {
		return lastik;
	}
	public void setLastik(int lastik) {
		this.lastik = lastik;
	}
	protected void yaz() {
		super.yaz();
		System.out.println("Lastil çapı:"+getLastik());
		System.out.println("------------------------");
	}
	protected void deneme() {
		System.out.println("deneme");
	}

}
