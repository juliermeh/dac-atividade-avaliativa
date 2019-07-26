package br.edu.ifpb.dac.atividade.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aluno implements Serializable{
    
    @Id
    @GeneratedValue
    private int ID; 
    private String matricula;
    private Date dataIngresso;
    private String turma;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Pessoa pessoa;

    public Aluno() { }

    public Aluno(String matricula, Date dataIngresso, String turma, String nome, Pessoa pessoa) {
        this();
        this.matricula = matricula;
        this.dataIngresso = dataIngresso;
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
        
}
