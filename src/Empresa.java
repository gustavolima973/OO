import java.util.ArrayList;

public class Empresa {

    public String nome;
    public ArrayList<Filial> filiais = new ArrayList<Filial>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Filial> getFiliais() {
        return filiais;
    }

    public void setFiliais(ArrayList<Filial> filiais) {
        this.filiais = filiais;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nome='" + nome ;
    }
}