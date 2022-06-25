package bank;

public class araba extends CredyType {
public araba(müşteri m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

private static double risk=0.56;

public double Calculate(){
	double sonuç=m.getKredimiktarı()+m.getKredimiktarı()*risk+m.getKredimiktarı()*super.faiz;
	
	
	return sonuç;
	
}

public boolean uygunluk( ) {
	if(m.getMoney()+m.getSalary()>Calculate()) {
		return true;
	}
	else {
		return false;
	}
	
}
}
