
public class ModeloImportado {
	
	
	public static void main(String[]args) {
		Automovel bmw = new Automovel();
		Automovel mercedes= new Automovel();
		Automovel audi = new Automovel();
		Automovel fiat = new Automovel();
		Automovel volkswagen = new Automovel();
		
		
		
		fiat.setCor("vermelho");
		fiat.setPlaca(2502);
		fiat.setAnoCarro(1990);
		fiat.setQuantidadePortas(200);
		fiat.setQuantidadePortas(4);
		fiat.setMotor(2.0);
		fiat.setNomeCarro("punto");
		
		System.out.println(" Segue os dados do veiculo ");
		System.out.println();
		System.out.println(" Nome do veiculo = "+fiat.getNomeCarro());
		System.out.println(" Cor do veiculo = "+fiat.getCor());
		System.out.println(" Ano do veiculo = "+fiat.getAnoCarro());
		System.out.println(" Placa do veiculo = "+fiat.getPlaca());
		System.out.println(" Quantidade do veiculo = "+fiat.getQuantidadePortas());	
		System.out.println(" Motor do veiculo = "+fiat.getMotor());
	}
	
	

}
