package br.edu.ifpb.dac.atividade.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Professor implements Serializable {
    
    @Id
    private int ID;
    private double salario;
    @OneToOne
    private Pessoa pessoa;
    @ManyToMany(mappedBy = "professores")
    private List<Telefone> telefones;

    public Professor() { }

    public Professor(double salario, Pessoa pessoa) {
        this();
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    
}
