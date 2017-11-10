package projetofila;

import java.util.LinkedList;
import java.util.Queue;

public class ProjetoFila {

    public static void main(String[] args) {

        Fila listafila = new Fila(); 
        
        listafila.insere("Primeiro");
        System.out.println(listafila);
        listafila.insere("Segundo");
        System.out.println(listafila);
        listafila.insere("Terceiro");
        System.out.println(listafila);
        
        listafila.excluir();
        System.out.println(listafila);
        listafila.excluir();
        System.out.println(listafila);
        listafila.excluir();
        System.out.println(listafila);
        listafila.excluir();
        System.out.println(listafila);

        
        Queue<String> fila = new LinkedList<String>();
        fila.add("Primeiro");
        fila.add("Segundo");
        System.out.println(fila);
        fila.poll();
        System.out.println(fila);
        fila.poll();
        System.out.println(fila);
    }
    
}
