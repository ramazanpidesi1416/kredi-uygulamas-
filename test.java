package bank;

public abstract class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		müşteri m=new müşteri("Hakan",50,1,5000);
		
		banka b =new banka();
		araba a=new araba(m);
		b.yazdır(a);
	}

}
