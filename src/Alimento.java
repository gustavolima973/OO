public class Alimento extends Item {

    public String dataValidade;
    public String calorias;

    public Alimento(String nome, String preco, String quantidade, String dataValidade, String calorias) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
        this.calorias = calorias;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", dataValidade='" + dataValidade + '\'' +
                ", calorias=" + calorias +
                '}';
    }
}
