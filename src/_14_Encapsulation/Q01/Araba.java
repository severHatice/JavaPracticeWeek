package _14_Encapsulation.Q01;

public class Araba {
	
	private String model;
	private String renk;
	private int motor;
	private int yil;
	
	
	public Araba() {
		super();
	}


	public Araba(String model, String renk, int motor, int yil) {
	
		this.model = model;
		this.renk = renk;
		//this.motor = motor;
		//this.yil = yil;
		setYil(yil);//girdigin yil setyil metoduna gitmesi lazim inst vaariable gitmeden once
		//cunku yaptigin degisikligi uzerinde uygulamasi lazim
		setMotor(motor);//bunlar kontrollu#######################
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getRenk() {
		return renk;
	}


	public void setRenk(String renk) {
		this.renk = renk;
	}


	public int getMotor() {
		return motor;
	}


	public void setMotor(int motor) {
		if(motor>=100) {
			this.motor=motor;//metod yapildigi icin nokta
			//System.out.println("dogru girdiniz");
		}else System.out.println("agam eglenir 100un altinda beygir gucu olmazzzz");
		
	}


	public int getYil() {
		return yil;
	}


	public void setYil(int yil) {
		if(yil<=0) {
			System.out.println("negatif yil giremezseniz");
			this.yil=(-1)*yil;
		}else this.yil = yil;
	}
	
	//default kendi packagena ulasir 
	
	
	
	
	
	

}
