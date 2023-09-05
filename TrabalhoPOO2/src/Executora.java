import java.util.Scanner;

public class Executora {
    public static void main(String[] args) {
        Lanchonete lanchonete = new Lanchonete();
        Lanche [] lanches = new Lanche[5];
        int quantidade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos lanches serão adicionados ao cardápio?");
        quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            String nome;
            double preco;
            System.out.println("Insira o nome do lanche " + (i+1));
            nome = scanner.next();
            System.out.println("Insira o preço do lanche " + (i+1));
            preco = scanner.nextInt();
            lanches[i] = new Lanche(nome, preco);
        }

        System.out.println();

        lanchonete.exibirCardapio(lanches);



    }
}
