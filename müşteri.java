package bank;

public class müşteri {

	private String name;
	private int salary,money,kredimiktarı;
	//private CredyType credy;
	public müşteri(String name, int salary, int money, int kredimiktarı) {
		
		this.name = name;
		
		this.salary = salary;
		this.money = money;
		this.kredimiktarı = kredimiktarı;
	}
	public int getKredimiktarı() {
		return kredimiktarı;
	}
	public void setKredimiktarı(int kredimiktarı) {
		this.kredimiktarı = kredimiktarı;
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
