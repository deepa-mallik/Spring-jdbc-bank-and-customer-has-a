

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBank {
	
	public static void main(String[] args) {  
        
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
              
        Customer cust =(Customer)factory.getBean("obj1");  
        cust.show();  
          
    }
}
