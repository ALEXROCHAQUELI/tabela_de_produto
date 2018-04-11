package sistema;
import java.util.ArrayList;
/**
 *
 * @author Alex Rocha
 */
public class sistema {
    Produto p =new Produto();
    
    public static void main(String[] args) {
         ArrayList<Produto> Produto = new ArrayList();
             Produto produto = new Produto("001","Toyota","25","80,000");
             Produto produto1= new Produto("\n"+"002","Fiat","15","36,000");
             Produto produto2= new Produto("\n"+"003","Volkswagen","30","46,000");
             Produto produto3= new Produto("\n"+"004","Renault","22","33,000");
       
       
             Produto.add(produto);
             Produto.add(produto1);
             Produto.add(produto2);
             Produto.add(produto3);
                
                
        for(Produto p: Produto){
            System.out.println(p);
        }
     System.out.println("Total de itens na tabela:" + Produto.size());
    }  
}
