package view;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.IService;
import service.ServiceImp;

public class SpringAnotationBasedIOCView extends ServiceImp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao", "service");
        IService service = (IService) context.getBean(IService.class);
        System.out.println("result using spring annotation based ioc: " +service.calculate());
    }
}
