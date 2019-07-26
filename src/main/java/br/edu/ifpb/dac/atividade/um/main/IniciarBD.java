package br.edu.ifpb.dac.atividade.um.main;

import javax.persistence.EntityManager;

public class IniciarBD {
    
    private final EntityManager em;

    public IniciarBD(EntityManager em) {
        this.em = em;
    }
     
    public void dadosIniciais(){
        
    }
    
}
