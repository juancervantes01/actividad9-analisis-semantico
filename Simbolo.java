package act9_analisis_semantico;

public class Simbolo {
    private String id;
    private String tiposimbolo; // "CLASE", "METODO", "VARIABLE", "ATRIBUTO", "CONSTANTE"
    private String tipodato;    // "int", "float", "boolean", "string", "void", etc.
    private Object valor;       // Valor inicial o "null" / "sin_inicializar"
    private String ambito;      // Ámbito donde fue declarado ("GLOBAL", nombre de clase o método)
    private int linea;          // Línea de origen
    private int columna;        // Columna de origen
    private String token;       // Token originador (ej. "ID")

    public Simbolo(String id, String tiposimbolo, String tipodato, Object valor, String ambito, int linea, int columna, String token) {
        this.id = id;
        this.tiposimbolo = tiposimbolo;
        this.tipodato = tipodato;
        this.valor = valor;
        this.ambito = ambito;
        this.linea = linea;
        this.columna = columna;
        this.token = token;
    }

    // Getters y Setters necesarios
    public String getId() { return id; }
    public String getTiposimbolo() { return tiposimbolo; }
    public String getTipodato() { return tipodato; }
    public Object getValor() { return valor; }
    public String getAmbito() { return ambito; }
    public int getLinea() { return linea; }
    public int getColumna() { return columna; }
    public String getToken() { return token; }
    
    public void setValor(Object valor) { this.valor = valor; }
}