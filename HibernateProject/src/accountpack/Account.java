package accountpack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//@Entity
public class Account {
	
	//@Id
	//@SequenceGenerator(name="seqAccno", sequenceName="aac_no",
	//				    initialValue=1000, 
	 //                  allocationSize=1)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, 
	//               generator="seqAccno")
	//@Column(name="id")
	private int id;
	
	private String name;
	
	public Account()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
