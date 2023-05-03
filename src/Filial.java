import java.util.ArrayList;

public class Filial {

    public String nome;
    public String endereco;
    public ArrayList<Item> itens = new ArrayList<Item>();

    public Filial(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Filial{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco ;
    }
}
