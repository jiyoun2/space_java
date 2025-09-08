package classes;

// 은행 계좌 클래스 
public class BankAccount {
	// 계좌 번호
	private String ano;
	//예금주
	private String owner;
	// 잔액
	private int balance;
	
	// setter(설정자) method; set+멤버변수()
	public void setAno(String ano) {
		this.ano = ano;
	}
	
//	getter(접근자) - get + 멤버변수()
	public String getAno() {
		return ano;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
		}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
}
