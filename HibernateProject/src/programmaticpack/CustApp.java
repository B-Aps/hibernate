package programmaticpack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import customerpack.Customer;

public class CustApp {

	public static void main(String ar[])
	{
		Configuration cfg = new Configuration();
		cfg.addClass(customerpack.Customer.class);
		cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		cfg.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
		cfg.setProperty("hibernate.connection.url","jdbc:oracle:thin:@localhost:1521:XE");
		cfg.setProperty("hibernate.connection.username", "jothi");
		cfg.setProperty("hibernate.connection.password", "jothi1");
		
		
		
		SessionFactory factory = cfg.buildSessionFactory();
	  	Session session = factory.openSession();  
	  	Transaction t = session.beginTransaction();   
	           
	    Customer c = new Customer();  
	    c.setCustid(1004);
	    c.setName("test1004");
	        
	    session.save(c);  
	    t.commit();  
	    System.out.println("successfully saved");    
	    factory.close();  
	    session.close();  
	}
}
