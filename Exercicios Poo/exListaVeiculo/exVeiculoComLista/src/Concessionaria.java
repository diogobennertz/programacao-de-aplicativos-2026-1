import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Concessionaria {
    private List<Veiculo> veiculos;

    public Concessionaria(){
        veiculos = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
    }

    // 1. Método para RETORNAR a lista (para usar em outras partes do código)
    public List<Veiculo> obterTodosVeiculos() {
        return Collections.unmodifiableList(veiculos);
    }


    public Veiculo obterVeiculoMaisBarato(){
        double menorpreco = Double.MAX_VALUE;
        Veiculo veiculoMaisBarato = null;
        for (Veiculo v : veiculos){
            if (v.getPreco() < menorpreco){
                menorpreco = v.getPreco();
                veiculoMaisBarato = v;
            }
        }
        return veiculoMaisBarato;
    }
}
