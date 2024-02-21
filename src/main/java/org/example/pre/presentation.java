package org.example.pre;



// instenciation statique

import org.example.dao.DaoImpl;
import org.example.metier.MetierImpl;

public class presentation {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Le résultat : "+metier.calcul());
    }
}
