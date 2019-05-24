package compositepack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CompositeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
	    		.configure("hibernate.cfg.xml").build();  
	    Metadata meta = new MetadataSources(ssr).getMetadataBuilder()
	    		.build();  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();     
	  	Session session = factory.openSession();  
	  	Transaction t = session.beginTransaction();  
	  
	  	Account a = new Account();
	  	a.setAccountNo(new AccountPK(1000,5000));
	  	a.setAcctype("SB");
	  	a.setName("jothi");
	  	a.setStatus("settled");
	  	session.save(a);
	  	t.commit();
	  	System.out.println("successfully saved");    
	    factory.close();  
	    session.close();    
	}

}
