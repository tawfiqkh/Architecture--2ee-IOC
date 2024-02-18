package view;

import dao.DaoImp;
import dao.IDao;
import service.ServiceImp;

public class StaticIOCView {

    public static void main(String[] arg){

        IDao daoV1 = new DaoImp();
        ServiceImp service = new ServiceImp();
        service.setDao(daoV1);

        System.out.println("results =>"+service.calculate());

    }
}
