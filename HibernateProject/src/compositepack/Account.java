package compositepack;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Account {

	@EmbeddedId
	private AccountPK accountNo;
	private String name;
	private String acctype;
	private String status;
	public Account()
	{
		
	}
	public AccountPK getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(AccountPK accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
