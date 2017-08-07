
package uem.aulas.semana1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author João Metambo
 * @author José Seie
 * @author Alfredo Sebastião
 * @version 1.0
 *  
 * Classe Controladora das classes: Gstor, Caixa e Fachineiro.
 */
public class FuncionarioController {
    
    private Gestor[] gestores = new Gestor[1000];
    private Fachineiro[] fachineiros = new Fachineiro[1000];
    private Caixa[] caixas = new Caixa[1000];
    private int totalGestores = 0;
    private int totalCaixas = 0;
    private int totalFachineiros = 0;
    SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    
      
   public boolean addicionar(Gestor gestor){   
       gestores[totalGestores] = gestor;
       totalGestores++;
       return true;
   }
   public boolean addicionar(Caixa caixa){   
       caixas[totalCaixas] = caixa;
       totalCaixas++;
       return true;
   }
   public boolean addicionar(Fachineiro fachineiro){   
       fachineiros[totalFachineiros] = fachineiro;
       totalFachineiros++;
       return true;
   }
    
   public JTable listarTodos(JTable tabela){   
       String colunas[] = {"Nome ", " Data de Registo "," Data de Ingresso ", " Salario ", "  Categoria  "};
       
       ArrayList dados = new ArrayList();
       
       //Preenchimento dos Gestores
       dados = buscarGestores(dados);
       
       //Preenchimento dos Caixas
       dados = buscarCaixas(dados);       
      
       //Preenchimento dos Fachineiros
       dados = buscarFachineiros(dados);       

       ModeloTabela modeloT = new ModeloTabela(dados, colunas);
       tabela.setModel(modeloT);
        
       return tabela;
   }
   
   private ArrayList buscarGestores(ArrayList dados){
       
       for (int i = 0; i < totalGestores; i++) {
           dados.add(new Object[]{
               this.gestores[i].getNome(),
               sdf.format(this.gestores[i].getDataRegisto()),
               sdf.format(this.gestores[i].getDataIngresso()),
               this.gestores[i].getSalario(),
               " Gestor "
           });
       }
       return dados;
   }

   
   private ArrayList buscarCaixas(ArrayList dados){
       
       for (int i = 0; i < totalCaixas; i++) {
           dados.add(new Object[]{
               this.caixas[i].getNome(),
               this.caixas[i].getDataRegisto(),
               this.caixas[i].getDataIngresso(),
               this.caixas[i].getSalario(),
               " Caixa "
           });
       }
       return dados;
   }
   
   private ArrayList buscarFachineiros(ArrayList dados){
       
       for (int i = 0; i < totalFachineiros; i++) {
           dados.add(new Object[]{
               this.fachineiros[i].getNome(),
               this.fachineiros[i].getDataRegisto(),
               this.fachineiros[i].getDataIngresso(),
               this.fachineiros[i].getSalario(),
               " Fachineiro "
           });
       }
       return dados;
   }

      
    
}
