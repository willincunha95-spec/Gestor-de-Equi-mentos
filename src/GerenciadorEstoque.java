    import java.util.ArrayList;

    public class GerenciadorEstoque {

        private ArrayList<Equipamentos> listaEquipamentos = new ArrayList<>();

        public void adicionarEquipamento(Equipamentos objetoRecebido) {

            if (objetoRecebido.getNome().trim().length() > 3) {

                listaEquipamentos.add(objetoRecebido);

                System.out.println("Equipammento registrado com sucesso");
            } else {
                System.out.println("O nome do equipamento precisa ter mais de 3 caracteres.");
            }


        }

        public void listaEquipamentos() {
            System.out.println("-------LISTA DE EQUIPAMENTOS------");

            if(listaEquipamentos.isEmpty()) {
                System.out.println("O estoque está vazio ");

            }

            for (Equipamentos e : listaEquipamentos) {
                System.out.println("ID : " + e.getId() +
                        "|NOME : " + e.getNome() +
                        "DISPONIVEL : " + (e.getDisponivel() ? "SIM" : "NÂO"));

            }
        }

        public void emprestimoEquipamento(Equipamentos e ){
            if(e.getDisponivel()){
                e.setDisponivel(false);
                System.out.println("Emprestimo de :  " + e.getNome() + "concluido");
            }else{
                System.out.println("Erro o item :  " + e.getNome() + "está ocupado");
            }
        }

        public void buscaPorNome(String termoPesquisa){
            for(Equipamentos e:listaEquipamentos){
                if(e.getNome().toLowerCase().contains(termoPesquisa.toLowerCase())){
                    System.out.println("Encontrado: " + e.getNome() +
                            "|DISPONIVEL: " + (e.getDisponivel() ? "SIM" : "NÂO"));
                }
            }
        }
        public void DevolverEquipamento(Equipamentos e){
            e.setDisponivel(true);
            System.out.println("Equipamento : " + e.getNome() + "foi devolvido e está já está no estoque!");
        }
    }
