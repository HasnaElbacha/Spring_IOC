package org.example.ext;


import org.example.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        // Se connecter à des capteur pour récupérer la température
        System.out.println("Version capteur");
        double temp=6000;
        return temp;
    }
}
