package bank;

public abstract class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		m��teri m=new m��teri("Hakan",50,1,5000);
		
		banka b =new banka();
		araba a=new araba(m);
		b.yazd�r(a);
	}

}
