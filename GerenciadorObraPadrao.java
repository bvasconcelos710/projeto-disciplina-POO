import java.util.ArrayList;
import java.util.List;

public class GerenciadorObraPadrao implements GerenciadorObra {

    private List<Obra> obras = new ArrayList<>();

    @Override
    public void adicionar(Obra obra) {
        this.obras.add(obra);
    }

    @Override
    public void remover(Obra obra) {
        this.obras.remove(obra);
    }

    @Override
    public List<Obra> listar() {
        return this.obras;
    }

}
