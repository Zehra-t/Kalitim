package Kalitim;

public class Bcycle {//abstract ekledik nesne oluşty-urulmasın diye
	protected int pedal;
	protected int hiz;
	protected int vites;

	Bcycle(int pedal,int hiz,int vites){
		this.pedal=pedal;
		this.hiz=hiz;
		this.vites=vites;
	}

	public int getPedal() {
		return pedal;
	}

	public void setPedal(int pedal) {
		this.pedal = pedal;
	}

	public int getHiz() {
		return hiz;
	}

	public void setHiz(int hiz) {
		this.hiz = hiz;
	}

	public int getVites() {
		return vites;
	}

	public void setVites(int vites) {
		this.vites = vites;
	}
	protected void yaz() {
		System.out.println("Bisiklet özellikleri:");
		System.out.println("--------------------------");
		System.out.println("Pedal çapı"+getPedal());
		System.out.println("Hizi:"+getHiz());
		System.out.println("Vites:"+getVites());
	}
	//protected abstract void deneme();// abstract fonksiyonu {} ile bitmez ; ile biter
	
}
