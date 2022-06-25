package bank;

public class müþteri {

	private String name;
	private int salary,money,kredimiktarý;
	//private CredyType credy;
	public müþteri(String name, int salary, int money, int kredimiktarý) {
		
		this.name = name;
		
		this.salary = salary;
		this.money = money;
		this.kredimiktarý = kredimiktarý;
	}
	public int getKredimiktarý() {
		return kredimiktarý;
	}
	public void setKredimiktarý(int kredimiktarý) {
		this.kredimiktarý = kredimiktarý;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	
	
}
