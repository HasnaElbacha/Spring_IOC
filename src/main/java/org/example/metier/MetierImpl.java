package org.example.metier;


import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    //version autowired
    //@Qualifier('dao2')
    @Autowired
    private IDao dao;
    //version constructeur
    /*public MetierImpl(IDao dao){
        this.dao=dao;
    }*/
    @Override
    public double calcul() {
        double temp= dao.getData() ;
        return temp*540/Math.cos(temp*Math.PI);
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
