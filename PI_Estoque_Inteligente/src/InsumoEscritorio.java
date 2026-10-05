//Aqui seráo criados os insumos de escritório, como sulfite, caneta etc.

public class InsumoEscritorio extends Insumo {

    private String marca;

    public InsumoEscritorio(String nome, int qtd, int estoqueMinimo, String marca) {
        super(nome, qtd, estoqueMinimo);
        this.marca = marca;
    }

}
