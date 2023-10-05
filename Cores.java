import java.util.ArrayList;
import java.util.Collections;

public class Cores {
    public static void main(String args[]) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("VERDE");
        lista.add("AZUL");
        lista.add("VERMELHO");
        lista.add("AMARELO");
        lista.add("CINZA");
        // Insira na linha imediatamente a seguir a linha de código que atenda ao requisito
        // 1.
        lista.remove(2);
        System.out.println("Lista apos exclusao: " + lista);
        // Insira na linha imediatamente a seguir a linha de código que atenda ao requisito
        // 2.// Ordenar a lista em ordem decrescente
        Collections.sort(lista);

        System.out.println("Lista apos da ordenacao: " + lista);
        
        // alterar(lista,2,"BRANCO");
    }

    //fazer o método alterar(lista, indice, novaCor)
    public static void alterar(ArrayList<String> lista, int indice, String novaCor) {
        //remover o /node_modules
    }
        // A partir da próxima linha, crie o método alterar(lista, indice, novaCor).
}