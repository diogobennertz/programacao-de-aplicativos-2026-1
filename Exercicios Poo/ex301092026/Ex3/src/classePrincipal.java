//3)
//A partir das representações abaixo dos objetos de uma classe Produto, escreva o código
//necessário para suportar tais objetos.
//Ou seja, o código necessário para criar a classe e instanciar os objetos de modo que fiquem
//com o estado apresentado.
//produto1: Produto
//nome = “Caderno”
//descricao = “Caderno em espiral tamanho médio”
//precoUnitario = 4.50
//desconto = 15
//produto2: Produto
//nome = “Caneta ESF”
//descricao = “Caneta esferográfica 5mm”
//precoUnitario = 1.20
//desconto = 2
//produto3: Produto
//nome = “Esquadro”
//descricao = “Esquadro de acrílico 20 cm”
//precoUnitario = 2.35
//desconto = 10
public class classePrincipal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        produto1.nomeProduto = "Caderno";
        produto1.descriProduto = "Caderno em espiral tamanho médio";
        produto1.precoProduto = 4.50;
        produto1.descontoProduto = 15;

        produto2.nomeProduto = "Caneta ESF";
        produto2.descriProduto = "Caneta esferográfica 5mm";
        produto2.precoProduto = 1.20;
        produto2.descontoProduto = 2;


        produto3.nomeProduto = "Esquadro";
        produto3.nomeProduto = "Esquadro de acrílico 20 cm";
        produto3.precoProduto = 2.35;
        produto3.descontoProduto = 10;
        System.out.println("Produto: " + produto1.nomeProduto);
        System.out.println("Descrição: " + produto1.descriProduto);
        System.out.println("Preço: R$" + produto1.precoProduto + " | Desconto: " + produto1.descontoProduto + "%");
        System.out.println("----------------------------------------");

        System.out.println("Produto: " + produto2.nomeProduto);
        System.out.println("Descrição: " + produto2.descriProduto);
        System.out.println("Preço: R$" + produto2.precoProduto + " | Desconto: " + produto2.descontoProduto + "%");
        System.out.println("----------------------------------------");

        System.out.println("Produto: " + produto3.nomeProduto);
        System.out.println("Descrição: " + produto3.descriProduto);
        System.out.println("Preço: R$" + produto3.precoProduto + " | Desconto: " + produto3.descontoProduto + "%");


    }
}