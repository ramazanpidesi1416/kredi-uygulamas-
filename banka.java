package bank;

public class banka {

	
	public void yazd�r(CredyType c) {
		if(c.uygunluk()==true) {
			System.out.println(c.m.getName()+" isimli ki�i kredi alamaz");
		}
		else {
			System.out.println(c.m.getName()+" kredi alamazs�n");
		}
	}

	
}
