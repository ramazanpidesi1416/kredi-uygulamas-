package bank;

public class banka {

	
	public void yazdýr(CredyType c) {
		if(c.uygunluk()==true) {
			System.out.println(c.m.getName()+" isimli kiþi kredi alamaz");
		}
		else {
			System.out.println(c.m.getName()+" kredi alamazsýn");
		}
	}

	
}
