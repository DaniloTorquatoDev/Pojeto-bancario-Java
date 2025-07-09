
public class Data {

	private int numberAccount;
	private String holderAccount;
	private double balanceAccount;
	
	
	public Data(int numberAccount, String holderAccount) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
	}

	public Data(int numberAccount, String holderAccount, double balanceAccount) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
		this.balanceAccount = balanceAccount;
	}

	public int getNumberAccount() {
		return numberAccount;
	}


	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}

	public double getBalanceAccount() {
		return balanceAccount;
	}

	public void addBalance(double balanceAccount) {
		this.balanceAccount += balanceAccount;
	}
	
	public void removeBalance(double balanceAccount) {
		double fee = 5;
		this.balanceAccount -=(balanceAccount + fee) ;
	}
	
	public String toString() {
		return "\nDados da conta:\n" + "Numero da conta: " + getNumberAccount() + ", Titular da conta: "
				+getHolderAccount() + ", Valor na conta: R$" + String.format("%.2f", getBalanceAccount());
	}

}
