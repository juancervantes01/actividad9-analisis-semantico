package act9_analisis_semantico;

public class ValidadorSemantico {

    // Validar PascalCase (Para Clases)
    public static boolean esPascalCase(String nombre) {
        if (nombre == null || nombre.isEmpty()) return false;
        return Character.isUpperCase(nombre.charAt(0)) && !nombre.contains("_");
    }

    // Validar camelCase (Para Métodos, Variables, Atributos)
    public static boolean esCamelCase(String nombre) {
        if (nombre == null || nombre.isEmpty()) return false;
        // Primera letra minúscula, sin guiones bajos (excepto si es constante)
        return Character.isLowerCase(nombre.charAt(0));
    }

    // Validar snake_case o convención de constantes
    public static boolean esConstanteValida(String nombre) {
        if (nombre == null || nombre.isEmpty()) return false;
        // Puede ser todo mayúsculas con guiones bajos o camelCase estricto
        return nombre.equals(nombre.toUpperCase()) || esCamelCase(nombre);
    }
}