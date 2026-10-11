package act9_analisis_semantico;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Por favor, proporcione un archivo de prueba como argumento.");
            return;
        }

        try {
            FileReader lector = new FileReader(args[0]);
            Lexer9 lexer = new Lexer9(lector);
            parser9 parser = new parser9(lexer);
            
            parser.parse();
            
            System.out.println("\n¡Análisis sintáctico y semántico finalizado con éxito!\n");
            
            // Imprimir la Tabla de Símbolos recopilada
            parser.tabla.mostrarTabla();

        } catch (Exception e) {
            System.err.println("Ocurrió un error durante el análisis: " + e.getMessage());
            e.printStackTrace();
        }
    }
}