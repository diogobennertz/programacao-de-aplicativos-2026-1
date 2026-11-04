import java.util.ArrayList;
import java.util.List;

public class listaRetangulos {
    private List<retangulo> retangulos = new ArrayList<>();

    public void adicionar(retangulo r) {
        retangulos.add(r);
    }

    public retangulo getMaiorArea() {
        if (retangulos.isEmpty()) {
            return null;
        }
        retangulo maior = retangulos.get(0);
        for (retangulo r : retangulos) {
            if (r.calcularArea() > maior.calcularArea()) {
                maior = r;
            }
        }
        return maior;
    }

    public retangulo getMaiorPerimetro() {
        if (retangulos.isEmpty()) {
            return null;
        }
        retangulo maior = retangulos.get(0);
        for (retangulo r : retangulos) {
            if (r.calcularPerimetro() > maior.calcularPerimetro()) {
                maior = r;
            }
        }
        return maior;
    }
}