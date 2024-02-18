package service;

import dao.IDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServiceImp implements IService{

    private static final Logger logger = LogManager.getLogger();

    private IDao dao;
    @Override
    public double calculate() {

        logger.info("calculate result");

        double tmp = dao.getData();
        return tmp*540/Math.cos(tmp*Math.PI);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
