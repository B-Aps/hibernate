package customerpack;

import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
  
    
public class CustApp {    
public static void main(String[] args) {    
        
     
  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
          
  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
 
  	SessionFactory factory = meta.getSessionFactoryBuilder().build();  
  	Session session = factory.openSession();  
  	Transaction t = session.beginTransaction();   
           
    Customer c = new Customer();  
    c.setCustid(1006);
    c.setName("newcust");
        
    session.save(c);  
    t.commit();  
    System.out.println("successfully saved");    
    factory.close();  
    session.close();    
        
}    
}   
