import java.util.List;

public interface GerenciadorObra {

    void adicionar(Obra obra);

    void remover(Obra obra);

    List<Obra> listar();

}
