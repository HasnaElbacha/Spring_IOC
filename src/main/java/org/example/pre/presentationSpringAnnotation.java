package org.example.pre;

import org.example.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.dao", "org.example.metier"})
public class presentationSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(presentationSpringAnnotation.class);
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("resultat : " + metier.calcul());
    }
}
