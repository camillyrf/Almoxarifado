public class InsumoEncartelados extends Insumo {

    private String tipo; //etiqueta ou cartela

    public InsumoEncartelados(String nome, int qtd, int estoqueMinimo, String tipo) {
        super(nome, qtd, estoqueMinimo);
        setTipo(tipo);
    }

    //Método set para permitir apenas 'Cartela' ou 'Etiqueta'. Os funcionários são previamente informados.

    public void setTipo(String tipo){
        if (tipo == null && (!tipo.equalsIgnoreCase("ETIQUETA") ||
                            !tipo.equalsIgnoreCase("CARTELA"))) {
            System.out.println("Erro: Tipo inválido! Escolha apenas 'ETIQUETA' ou 'CARTELA'.");
            return;
        }
        this.tipo = tipo.toUpperCase();
    }

    public String getTitulo(){
        return tipo;
    }

}
