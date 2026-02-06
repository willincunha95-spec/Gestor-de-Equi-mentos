public class Main {
    public static void main(String[] args) {
        GerenciadorEstoque Estoque = new GerenciadorEstoque();

        Equipamentos note = new Equipamentos( "1","Notebook galaxy Ebook 4  ","ocupado" , true);
        Equipamentos note2 = new Equipamentos( "2","Notebook DELL latitude 2400  " , "livre",false);

        System.out.println("----itens cadastrados!----");
        Estoque.adicionarEquipamento(note);
        Estoque.adicionarEquipamento(note2);

        System.out.println("\n---- verificando estoque ----");
        Estoque.listaEquipamentos();

        System.out.println("\n ---- Realizando Empresitmo ----");
        Estoque.emprestimoEquipamento(note);

        System.out.println("\n---- Status Atualizado ----");
        Estoque.listaEquipamentos();

        System.out.println("\n ---- Testando busca por nome 'Sansung ----");
        Estoque.buscaPorNome("Sansung");

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}