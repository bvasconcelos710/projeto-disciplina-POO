import java.util.Arrays;

public class Filme extends Obra {

    private String genero;
    private String duracao;
    private String[] diretor = new String[3];
    private String[] atores = new String[3];

    public Filme(String titulo, int anoLancamento, String codigoPais, String genero, String duracao, String[] diretor,
            String[] atores) {
        super(titulo, anoLancamento, codigoPais);
        this.genero = genero;
        this.duracao = duracao;
        this.diretor = diretor;
        this.atores = atores;
    }

    public Filme(String titulo, int anoLancamento, String codigoPais, String duracao, String[] diretor) {
        super(titulo, anoLancamento, codigoPais);
        this.duracao = duracao;
        this.diretor = diretor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String[] getDiretor() {
        return diretor;
    }

    public void setDiretor(String[] diretor) {
        this.diretor = diretor;
    }

    public String[] getAtores() {
        return atores;
    }

    public void setAtores(String[] atores) {
        this.atores = atores;
    }

    @Override
    public String getInfo() {

        return "Titulo: " + this.getTitulo() + " Diretor: " + Arrays.deepToString(this.getDiretor())
                + " Ano de Lançamento"
                + this.getAnoLancamento() + " Gênero: " + this.getGenero();
    }

}
