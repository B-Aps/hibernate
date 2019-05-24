package compositepack;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AccountPK implements Serializable{

	private int accountId;
	private int custId;
	
	public AccountPK()
	{
		
	}
	public AccountPK(int accountId, int custId)
	{
		this.accountId = accountId;
		this.custId = custId;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	
	
}
