package bank;

public class ev extends CredyType {
	public ev(müşteri m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	private double risk=0.68;
	
	
	public double Calculate(müşteri m){
		double sonuç=m.getKredimiktarı()+m.getKredimiktarı()*risk+m.getKredimiktarı()*super.faiz;
		
		
		return sonuç;
		
	}

	public boolean uygunluk(müşteri m) {
		if(m.getMoney()+m.getSalary()>Calculate(m)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
}
