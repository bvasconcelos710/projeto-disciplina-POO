import java.util.Arrays;

public class SerieDesenho extends Serie {

    private int faixaEtaria;

    public SerieDesenho(String titulo, int anoLancamento, String codigoPais, String[] criadores,
            int temporadas, int episodios, int faixaEtaria) {
        super(titulo, anoLancamento, codigoPais, criadores, temporadas, episodios);
        this.faixaEtaria = faixaEtaria;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int idade) {
        this.faixaEtaria = idade;

    }

    @Override
    public String getInfo() {
        return "Titulo: " + this.getTitulo() + " Criadores: " + Arrays.deepToString(this.getCriadores())
                + " Faixa etária: "
                + this.getFaixaEtaria();
    }
}
