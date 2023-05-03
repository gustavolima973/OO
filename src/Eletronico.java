public class Eletronico extends Item {

    public String marca;
    public String modelo;
    public String voltagem;

    public Eletronico(String nome, String preco, String quantidade, String marca, String modelo, String voltagem) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", voltagem=" + voltagem +
                '}';
    }
}
