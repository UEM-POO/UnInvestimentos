
package uem.aulas.semana1;

import java.util.Date;

/**
 *
 * @author João Metambo
 * @author José Seie
 * @author Alfredo Sebastião
 * @version 1.0
 *  
 * Classe Modelo do gestor.
 */
public class Gestor {
    
    private Date dataIngresso;
    private String categoria = "Gestor";
    private Date dataRegisto;
    private double salario;

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Date getDataRegisto() {
        return dataRegisto;
    }

    public void setDataRegisto(Date dataRegisto) {
        this.dataRegisto = dataRegisto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
