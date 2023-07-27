public class Client{

	private int clientCode;
	private final List<Account> accounts;
	

	public Client(final int clientCode, final List<Account> account){
		this.clientCode = clientCode;
		this.accounts = accounts;

	}
    public int getClientCode(){
		return clientCode;

	}

	public List<Account> getAccounts(){
	     return accounts;
	 }

}