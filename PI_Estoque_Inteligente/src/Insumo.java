//Essa é a superclasse, em que cada tipo de insumo a utilizará como modelo.

public class Insumo {

    //Definição das variáveis modelo com modificador de acesso
    private String nome;
    private int qtd;
    private int estoqueMinimo;

    //Criação do construtor
    public Insumo(String nome, int qtd, int estoqueMinimo){
        this.nome = nome;
        this.qtd = qtd;
        if (estoqueMinimo <= 0){
            System.out.println("Erro: estoque mínimo deve ser maior que zero.");
            return;
        }
        this.estoqueMinimo = estoqueMinimo;
    }

    //Aplicando métodos get e set para acesso e modiicação de forma segura
    public String getNome(){
        return nome;
    }

    public int getEstoqueMinimo(){
        return estoqueMinimo;
    }

    public int getQtd(){
        return qtd;
    }

    public void setNome(String nome){
        if (nome == null || nome.isBlank()){
            System.out.println("Nome inválido!");
            return;
        }
        this.nome = nome;
    }

    //O setQtd não foi adicionado para proteger o histórico de movimentações.

    public void setEstoqueMinimo(int estoqueMinimo){
        if (estoqueMinimo < 0){
            System.out.println("Erro: estoque não pode ser negativo");
            return;
        }
        this.estoqueMinimo = estoqueMinimo;
    }

    //Método para somar ao estoque existente a quantidade adicionada
    public void addEstoque(int qtd){
        if(qtd <= 0){
            System.out.println("Erro: quantidade deve ser maior que zero.");
            return;
        }
        this.qtd += qtd;
    }

    //Método para subtrair do estoque existente a quantidade retirada
    public void retirarEstoque(int qtd){
        if(qtd > this.qtd){
            System.out.println("Quantidade indisponível!");
            return;
        } if(qtd <= 0){
            System.out.println("Erro: quantidade deve ser maior que zero.");
            return;
        }
        this.qtd -= qtd;
    }

    //Método para o estoque identificar se é necessário repor algum produto
    public boolean precisaRepor(){
        return qtd <= estoqueMinimo;
    }

}
