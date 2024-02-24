package view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IService;
import service.ServiceImp;

public class SpringXMLBasedIOCView extends ServiceImp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        IService service = (IService) context.getBean("service");
        System.out.println("result using spring XML Based IOC is: " +service.calculate());
    }
}
