import java.util.Arrays;

public class Serie extends Obra {
    private String[] criadores = new String[3];
    private String[] atores = new String[3];;
    private int temporadas;
    private int episodios;

    public Serie(String titulo, int anoLancamento, String codigoPais, String[] criadores, int temporadas,
            int episodios) {
        super(titulo, anoLancamento, codigoPais);
        this.criadores = criadores;
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public Serie(String titulo, int anoLancamento, String codigoPais, String[] criadores, String[] atores,
            int temporadas, int episodios) {
        super(titulo, anoLancamento, codigoPais);
        this.criadores = criadores;
        this.atores = atores;
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public String[] getCriadores() {
        return criadores;
    }

    public void setCriadores(String[] temp) {
        criadores = temp;
    }

    public String[] getAtores() {
        return atores;
    }

    public void setAtores(String[] temp) {
        atores = temp;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temp) {
        temporadas = temp;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int temp) {
        episodios = temp;
    }

    @Override
    public String getInfo() {
        return "Titulo: " + this.getTitulo() + " Criadores: " + Arrays.deepToString(this.getCriadores())
                + " Temporadas: "
                + this.getTemporadas();
    }

}
