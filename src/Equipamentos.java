import java.util.UUID;


public class Equipamentos {
    private String id;
    private String nome;
    private String statusDisponivel;
    private boolean disponivel;


    public void Equipamentos(){

    }

    public Equipamentos(String id,String nome,String statusDisponivel, boolean disponivel){
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.statusDisponivel = statusDisponivel;
        this.disponivel= disponivel;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getNome (){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getStatusDisponivel(){
        return statusDisponivel;
    }
    public void setStatusDisponivel(String statusDisponivel){
        this.statusDisponivel = statusDisponivel;
    }

    public boolean getDisponivel(){
        return disponivel;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
}