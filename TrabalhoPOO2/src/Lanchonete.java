public class Lanchonete {
    private String local;
    private String nome;

    public Lanchonete() {
    }

    public Lanchonete(String local, String nome) {
        this.local = local;
        this.nome = nome;

    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void exibirCardapio(Lanche [] lanches) {
        if(lanches[0] != null) {
            System.out.println("====== CARDAPIO ======");
            for (int i = 0; i < lanches.length; i++) {
                System.out.print((i+1) + " - " + lanches[i].getNome());
                System.out.println("    " + lanches[i].getPreco());
            }
        } else {
            System.out.println("Não há lanches no cardápio.");
        }
    }
}
