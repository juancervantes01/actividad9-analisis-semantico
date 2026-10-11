package act9_analisis_semantico;

import java.util.ArrayList;
import java.util.List;

public class TablaSimbolos {
    private List<Simbolo> listaSimbolos;

    public TablaSimbolos() {
        this.listaSimbolos = new ArrayList<>();
    }

    // Método para insertar un símbolo validando duplicados en el mismo ámbito
    public boolean insertar(Simbolo simbolo) {
        if (buscarDuplicado(simbolo.getId(), simbolo.getAmbito())) {
            System.err.println("Error semántico en línea " + simbolo.getLinea() + ", columna " + simbolo.getColumna() + 
                               ": El identificador '" + simbolo.getId() + "' ya ha sido declarado en el ámbito '" + simbolo.getAmbito() + "'.");
            return false;
        }
        listaSimbolos.add(simbolo);
        return true;
    }

    // Búsqueda de duplicados en el mismo ámbito
    public boolean buscarDuplicado(String id, String ambito) {
        for (Simbolo s : listaSimbolos) {
            if (s.getId().equals(id) && s.getAmbito().equals(ambito)) {
                return true;
            }
        }
        return false;
    }

    // Método para desplegar la tabla completa en formato tabular idéntico a la rúbrica
    public void mostrarTabla() {
        System.out.println("========================================================================================================================");
        System.out.println("                                                  TABLA DE SÍMBOLOS");
        System.out.println("========================================================================================================================");
        System.out.printf("%-18s %-13s %-11s %-16s %-18s %-7s %-9s %-20s\n", 
                          "ID", "Categoría", "Tipo Dato", "Valor", "Ámbito", "Línea", "Columna", "Token Originador");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        
        for (Simbolo s : listaSimbolos) {
            System.out.printf("%-18s %-13s %-11s %-16s %-18s %-7d %-9d %-20s\n",
                              s.getId(), s.getTiposimbolo(), s.getTipodato(), 
                              String.valueOf(s.getValor()), s.getAmbito(), 
                              s.getLinea(), s.getColumna(), s.getToken());
        }
        System.out.println("========================================================================================================================");
        System.out.println("Total de símbolos registrados: " + listaSimbolos.size());
    }
}