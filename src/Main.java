
public class Main {
	public static Empresa empresa;
	public static Filial filial; 
	public static Alimento alimento;
	public static Eletronico eletronico;

	public static void main(String[]args) {

		empresa = new Empresa("Walmart");
		filial = new Filial("Atacadao","brasilia");
		alimento = new Alimento("Frango","R$9,99","1kg","02/06/2023","1,950c");
		eletronico = new Eletronico("Geladeira","3,000","100","Eletrolux","Duas portas","220");
		System.out.println();
        
		System.out.println(empresa.toString());
        
		System.out.println();
       
		System.out.println(filial.toString());
		System.out.println();
		
        System.out.println(alimento.toString());
        System.out.println();
        
        System.out.println(eletronico.toString());
        System.out.println();
}

}
