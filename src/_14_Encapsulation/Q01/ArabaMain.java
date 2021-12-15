package _14_Encapsulation.Q01;

public class ArabaMain {

	public static void main(String[] args) {
		
		Araba honda=new Araba();
		honda.setMotor(300);
		honda.setModel("civiccc");
		honda.setYil(2021);
		honda.getModel();
		System.out.println(honda.getYil());
		System.out.println(honda.getMotor());
		
		Araba volvo=new Araba("xc9o","beyaz",2070,2020);
		System.out.println(volvo.getYil());
		
		
		Araba ww=new Araba("passat","kirmizi",1600,2020);
		System.out.println(volvo.getYil()+volvo.getRenk()+volvo.getMotor());
		System.out.println(ww.getModel()+ww.getMotor()+ww.getRenk());

	}

}
