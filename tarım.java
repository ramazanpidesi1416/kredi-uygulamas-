package bank;

public class tar�m extends CredyType {
	public tar�m(m��teri m) {
		super(m);
		// TODO Auto-generated constructor stub
	}

	private double risk=0.40;
	
	
	public double Calculate(m��teri m){
		double sonu�=m.getKredimiktar�()+m.getKredimiktar�()*risk+m.getKredimiktar�()*super.faiz;
		
		
		return sonu�;
		
	}

	public boolean uygunluk(m��teri m) {
		if(m.getMoney()+m.getSalary()>Calculate(m)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
}
