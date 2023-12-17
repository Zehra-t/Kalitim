package Kalitim;

public class test {

	public static void main(String[] args) {
		//Bcycle bike1=new Bcycle(30,40,18); //abstract yazınca nesne oluşmaz yorum satırına aldık
		//bike1.yaz();
		Mountainbike2 bike2=new Mountainbike2(25,20,24,"Dual");
		bike2.yaz();
		RoadBike bike3=new RoadBike(30,50,24,27);
		bike3.yaz();
		System.out.println(bike2.getPedal());// get ile mountainBike2'den pedal çağırdık
		Bcycle bike4=new Mountainbike2(30,20,24,"Single");//nesne bcycle parametre mountainden

	}

}
