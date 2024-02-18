package view;

import dao.DaoImp;
import dao.IDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.IserviceImp;

public class StaticIOCView {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] arg){

        IDao daoV1 = new DaoImp();
        IserviceImp service = new IserviceImp();
        service.setDao(daoV1);

        logger.info(service.calculate());

    }
}
