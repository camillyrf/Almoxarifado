//Esta é a classe gerenciadora de estoque, que centraliza todas as movimentações e consultas.

import java.util.ArrayList;
import java.util.List;

public class Almoxarifado  {

    private List<Insumo> estoque;

    public Almoxarifado(){
        this.estoque = new ArrayList<>();
    }

    /*Como as classes de Insumo não têm acesso ao Almoxarifado, estes métodos são para criar os itens
    que vão estar na variável "estoque" */

    public void cadEscritorio(String nome, int qtd, int estoqueMinimo, String marca){
        InsumoEscritorio novoEscritorio = new InsumoEscritorio (nome, qtd, estoqueMinimo, marca);
        this.estoque.add(novoEscritorio);
    }

    public void cadEmbalagem(String nome, int qtd, int estoqueMinimo, String tamanho){
        InsumoEmbalagem novaEmbalagem = new InsumoEmbalagem (nome, qtd, estoqueMinimo, tamanho);
        this.estoque.add(novaEmbalagem);
    }

    public void cadEncartelados(String nome, int qtd, int estoqueMinimo, String tipo){
        InsumoEncartelados novoEncartelado = new InsumoEncartelados (nome, qtd, estoqueMinimo, tipo);
        this.estoque.add(novoEncartelado);
    }

    //Criação dos métodos de consulta:

    public void consultarEstoqueTotal (){
        if (this.estoque.isEmpty()){
            System.out.println("O estoque está vazio!");
            return;
        }
        for (Insumo item : this.estoque){
            System.out.println("-" + item.getNome() + " | Quantidade: " + item.getQtd() + " | Mínimo: " +
                item.getEstoqueMinimo());
        }
    }

    //Método de consulta por produto:

    public void consultarPorProduto(String nomeBusca) {
    if (nomeBusca == null || nomeBusca.isBlank()) {
        System.out.println("Erro: Digite um nome válido para a busca!");
        return;
    }

    boolean encontrou = false;
    System.out.println("\nResultado da buscar por '" + nomeBusca + "' ===");

    for (Insumo item : this.estoque) {
        // Verifica se o nome do item contém o texto pesquisado
        if (item.getNome().toLowerCase().contains(nomeBusca.toLowerCase())) {
            System.out.println("\nItem: " + item.getNome() + " | Qtd: " + item.getQtd() +
                                    " | Mínimo: " + item.getEstoqueMinimo());
            encontrou = true;
        }
    }

    if (!encontrou) {
        System.out.println("\nNenhum produto com esse nome foi encontrado.");
    }
}

//Consultar itens com estoque crítico

public void consultarItensARepor() {
    boolean algumItem = false;

    for (Insumo item : this.estoque) {
        // Utilização do método da própria classe Insumo (qtd <= estoqueMinimo) para verificar itens a repor
        if (item.precisaRepor()) {
            System.out.println("Atenção: " + item.getNome() + " | Qtd Atual: " + item.getQtd() +
                                    " | Mínimo Exigido: " + item.getEstoqueMinimo());
            algumItem = true;
        }
    }

    if (!algumItem) {
        System.out.println("Excelente! Todos os itens estão com estoque adequado.");
    }
}

//Verificar se algum item está zerado

public void consultarItensEmFalta() {
    boolean algumItemZerado = false;

    for (Insumo item : this.estoque) {
        if (item.getQtd() == 0) {
            System.out.println("\nAtenção: " + item.getNome() + " está ZERADO!");
            algumItemZerado = true;
        }
    }

    if (!algumItemZerado) {
        System.out.println("Nenhum item está em falta.");
    }
}

}
