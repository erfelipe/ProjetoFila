package projetofila;

import java.util.LinkedList;
import java.util.List;

public class Fila {

    private List<String> nomes = new LinkedList<String>();

    public void insere(String s) {
        nomes.add(s);
    }

    public String excluir() {
        return nomes.remove(0);
    }

    @Override
    public String toString() {
        return nomes.toString();
    }

}
