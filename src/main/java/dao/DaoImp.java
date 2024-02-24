package dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class DaoImp implements IDao{
    private static final Logger logger = LogManager.getLogger();

    @Override
    public double getData() {

        logger.info("retrive data ...");

        return 30.5;
    }
}
