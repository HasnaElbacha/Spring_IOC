package org.example.metier;


import org.example.dao.IDao;

public class MetierImpl implements IMetier{
    public IDao dao;
    @Override

    public double calcul() {
        double temp= dao.getData() ;
        return temp*540/Math.cos(temp*Math.PI);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
