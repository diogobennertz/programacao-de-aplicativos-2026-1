import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Veiculo> veiculos;

    public Concessionaria(){
        veiculos = new ArrayList<>();
    }
    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
    }
}
