package bank;

public class araba extends CredyType {
public araba(m��teri m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

private static double risk=0.56;

public double Calculate(){
	double sonu�=m.getKredimiktar�()+m.getKredimiktar�()*risk+m.getKredimiktar�()*super.faiz;
	
	
	return sonu�;
	
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
