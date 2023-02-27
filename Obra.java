public abstract class Obra {

    public static final String BRASIL = "BR";
    public static final String EUA = "EUA";
    public static final String FRANCA = "FR";

    private String titulo;
    private int anoLancamento;
    private String codigoPais;

    public Obra(String titulo, int anoLancamento, String codigoPais) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.codigoPais = codigoPais;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public abstract String getInfo();

}
