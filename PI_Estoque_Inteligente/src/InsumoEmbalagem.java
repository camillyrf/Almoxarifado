//Aqui são os insumos de embalagem.

public class InsumoEmbalagem extends Insumo {

    //Atributo específico para embalagam, para definir o tamanho (P, M ou G)
    //O único tipo de embalagem que foi necessário registrar no estoque trabalha é a sacola.
    
    private String tamanho;

    public InsumoEmbalagem(String nome, int qtd, int estoqueMinimo, String tamanho) {
        super(nome, qtd, estoqueMinimo);
        setTamanho(tamanho);
    }

    public String getTamanho(){
        return tamanho;
    }

    //Criando o método set para aceitar tamanhos do tipo P, M ou G, apenas.
    public void setTamanho(String tamanho){
        if (tamanho == null && (!tamanho.equalsIgnoreCase("P") ||
                                (!tamanho.equalsIgnoreCase("M")) ||
                                (!tamanho.equalsIgnoreCase("G")))){
            System.out.println("Tamanho inválido! Escolha apenas P, M ou G.");
            return;
        }
        this.tamanho = tamanho.toUpperCase();
    }

}
