package br.edu.ifpb.dac.atividade.um.main;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MainJPQL {

    public static void main(String[] args) {
        
        EntityManager em = Persistence
            .createEntityManagerFactory("dac-atividade-avaliativa")
            .createEntityManager();
        new IniciarBD(em).dadosIniciais();
        
        //consultas jpql
        
    }
    
}
