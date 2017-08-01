
package uem.aulas.semana1;

import java.util.Date;

/**
 *
 * @author João Metambo
 * @author José Seie
 * @author Alfredo Sebastião
 * @version 1.0
 *  
 * Classe Modelo do Gestor.
 */
public class Fachineiro {
    
    private String nome;
    private Date dataIngresso;
    private Date dataRegisto;
    private final double BONUS = 0.02;
    private double salario;

    public Fachineiro(String nome, Date dataIngresso, double salario) {
        this.nome = nome;
        this.dataIngresso = dataIngresso;
        this.salario = salario;
        this.setDataRegisto();
                
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public Date getDataRegisto() {
        return dataRegisto;
    }

    private void setDataRegisto() {
        this.dataRegisto = new Date();
    }

    public double getSalario() {
        return salario + (this.salario * this.BONUS);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
}
