package bank;

public class m��teri {

	private String name;
	private int salary,money,kredimiktar�;
	//private CredyType credy;
	public m��teri(String name, int salary, int money, int kredimiktar�) {
		
		this.name = name;
		
		this.salary = salary;
		this.money = money;
		this.kredimiktar� = kredimiktar�;
	}
	public int getKredimiktar�() {
		return kredimiktar�;
	}
	public void setKredimiktar�(int kredimiktar�) {
		this.kredimiktar� = kredimiktar�;
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
