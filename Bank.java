import java.util.Set;
public class Bank{

   private int bankCode;
   private String bankName;   
   private final Set<Branch> branches;
   private final Set<Client> clients;


    public Bank( final int bankCode, final String bankName, final Set<Branch> branches, final Set<Client> clients) {
        this.bankCode = bankCode;
        this.bankName = bankName;        
        this.branches = branches;
        this.clients =  clients;
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

    public Set<Client> getClients() {
        return clients;
    }
}

