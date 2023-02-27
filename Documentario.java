import java.util.Arrays;

public class Documentario extends Filme {

    private String tema;

    public Documentario(String titulo, int anoLancamento, String codigoPais, String duracao,
            String[] diretor, String tema) {
        super(titulo, anoLancamento, codigoPais, duracao, diretor);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public String getInfo() {
        return "Titulo: " + this.getTitulo() + " Diretor(a): " + Arrays.deepToString(this.getDiretor())
                + " Ano de Lançamento: "
                + this.getAnoLancamento() + " Tema: " + this.getTema();
    }

}
