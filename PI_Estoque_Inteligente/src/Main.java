public class Main {
    public static void main(String[] args) throws Exception {

        //CRIANDO OS ITENS

        //Instanciar o Almoxarifado:
        Almoxarifado almoxarifado = new Almoxarifado();

        //Item com estoque normal, utilizando o padrão de tamanho e mais um para compor a lista:

        almoxarifado.cadEmbalagem("Sacola plástica", 1000, 100, "P");
        almoxarifado.cadEmbalagem("Sacola plástica", 500, 100, "G");

        //Item com estoque crítico (qtd <= estoqueMinimo) e tipo fora do padrão:

        almoxarifado.cadEncartelados("Folha", 45, 50, "cartela");
        almoxarifado.cadEncartelados("Rolo", 100, 50, "Etiqueta");

        //Item zerado / em falta (qtd <= 0):
        almoxarifado.cadEscritorio("Sulfite", 0, 50, "Paper Max");
        almoxarifado.cadEscritorio("Caneta azul", 51, 30, "Bic");

        //TESTANDO OS MÉTODOS DE CONSULTA

        System.out.println("\n -----------------------------------");
        System.out.println("=== EXIBINDO CONSULTA: ESTOQUE TOTAL ===");
        almoxarifado.consultarEstoqueTotal();

        //Teste 1 - item que existe.
        System.out.println("\n -----------------------------------");
        System.out.println("=== EXIBINDO CONSULTA: POR PRODUTO ===");
        almoxarifado.consultarPorProduto("Sulfite");
        
        //Teste 2 - item que não existe.
        System.out.println("\n -----------------------------------");
        System.out.println("=== EXIBINDO CONSULTA: POR PRODUTO ===");
        almoxarifado.consultarPorProduto("Grampeador");

        //Itens com estoque crítico
        System.out.println("\n -----------------------------------");
        System.out.println("=== EXIBINDO CONSULTA: ITENS A REPOR ===");
        almoxarifado.consultarItensARepor();

        //Itens em falta
        System.out.println("\n -----------------------------------");
        almoxarifado.consultarItensEmFalta();
    }
}
