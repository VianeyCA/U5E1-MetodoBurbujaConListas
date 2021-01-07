package listametodoburbujau5e1;
import java.util.LinkedList;
import java.util.List;
public class ListaMetodoBurbujaU5E1 {
     public static void main(String[] args) {
         // TODO code application logic here
         System.out.println("Ordenamiento burbuja en lista");
         List<Integer> lista = new LinkedList<Integer>();
         int auxiliar;
         lista.add(9);
         lista.add(1);
         lista.add(4);
         lista.add(3);
         lista.add(10);
         lista.add(7);
         lista.add(5);
         for (int i = 0; i < lista.size() - 1; i++) {
             for (int j = 0; j < lista.size() - 1; j++) {
                 if (lista.get(j) > lista.get(j + 1)) {
                     auxiliar = lista.get(j);
                     lista.set(j, lista.get(j + 1));
                     lista.set(j + 1, auxiliar);
                 }
             }
         }
         for (int i = 0; i < lista.size(); i++) {
             System.out.print(lista.get(i) + "  ");
         }
         System.out.println("");
     }   
}
