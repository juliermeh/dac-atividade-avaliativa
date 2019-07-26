package br.edu.ifpb.dac.atividade.um.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Autor implements Serializable {
    
    @Id
    @GeneratedValue
    private int ID;
    private String instituicaoVinculada;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Pessoa pessoa;
    
    public Autor() { }

    public Autor(String instituicaoVinculada, Pessoa pessoa) {
        this();
        this.instituicaoVinculada = instituicaoVinculada;
    }
    
    public String getInstituicaoVinculada() {
        return instituicaoVinculada;
    }

    public void setInstituicaoVinculada(String instituicaoVinculada) {
        this.instituicaoVinculada = instituicaoVinculada;
    }
    
}
