package service;

import dao.IDao;

public class IserviceImp implements IService{

    private IDao dao;
    @Override
    public double calculate() {
        double tmp = dao.getData();
        return tmp*540/Math.cos(tmp*Math.PI);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
