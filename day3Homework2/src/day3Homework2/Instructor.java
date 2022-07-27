package day3Homework2;

public class Instructor extends User{
	private String natinalIdentityNumber;
	private String bankAccountNumber;
	private int salary;
	
	public String getNatinalIdentityNumber() {
		return natinalIdentityNumber;
	}
	public void setNatinalIdentityNumber(String natinalIdentityNumber) {
		this.natinalIdentityNumber = natinalIdentityNumber;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
