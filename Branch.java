import java.util.Set;
public class Branch{

	private int bankCode;
	private String bankName;
	private final String branchName;
	private final int branchCode;
	private final Set<Client> clients;    
	private final Set<Branch> branches;


	public Branch(final String branchName, final int branchCode, final Set<Client> clients, final int bankCode, 
		final String bankName, final Set<Branch> branches){

		this.branchName = branchName;
		this.branchCode = branchCode;
		this.clients = clients;
		this.bankCode = bankCode;
        this.bankName = bankName;
        this.bankName = branches;
	}

	public get String getBranchName(){
		return branchName;
	}

	public get int getBranchCode(){
		return branchCode;
	}
	public List<Client> getClients(){
		return clients;
	}

	 public int getBankCode() {
        return bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public Set<Branch> getBranches() {
        return branches;
    }


}