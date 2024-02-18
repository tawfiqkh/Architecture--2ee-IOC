package view;

import dao.IDao;
import service.IService;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicIOCView {

    public static void main(String args[])  {

        try {
            // scan config file
            Scanner scanner = new Scanner(new File("src/main/java/config/config.txt"));

            // create instance of doaImp class
            String daoClassName = scanner.nextLine();
            Class daoClass = Class.forName(daoClassName);
            IDao dao =  (IDao) daoClass.newInstance();

            // create instance of serviceImp class
            String serviceClassName = scanner.nextLine();
            Class serviceClass = Class.forName(serviceClassName);
            IService service = (IService) serviceClass.newInstance();

            // invoke setDao methode
            Method method = serviceClass.getMethod("setDao", IDao.class);
            method.invoke(service, dao);


            System.out.println("results =>"+ service.calculate());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
