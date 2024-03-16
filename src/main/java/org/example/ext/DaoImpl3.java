package org.example.ext;


import org.example.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao3")
public class DaoImpl3 implements IDao {
    @Override
    public double getData() {
        // Se connecter au Web Service pour récupérer la température
        System.out.println("Version web service");
        return 80;
    }
}
