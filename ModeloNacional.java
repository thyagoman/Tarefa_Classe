
public class ModeloNacional {
	public static void main(String[]args) {
		
		Automovel palio = new Automovel();
		Automovel gol = new Automovel();
		Automovel voyage = new Automovel();
		Automovel santana = new Automovel();
		Automovel fiorino = new Automovel();
		Automovel Palio = new Automovel();
		Automovel mobi = new Automovel();
		Automovel fox = new Automovel();
		Automovel saveiro = new Automovel();
		Automovel fiat500 = new Automovel();
		Automovel parati = new Automovel();
		Automovel gurgel = new Automovel();
		Automovel virtus = new Automovel();
		Automovel s10 = new Automovel();
	
		
	
		parati.setCor("vermelho");
		parati.setPlaca(2502);
		parati.setAnoCarro(1990);
		parati.setQuantidadePortas(200);
		parati.setQuantidadePortas(4);
		parati.setMotor(2.0);
		parati.setNomeCarro("Parati Summer");
		
		System.out.println(" Segue os dados do veiculo ");
		System.out.println();
		System.out.println(" Nome do veiculo = "+parati.getNomeCarro());
		System.out.println(" Cor do veiculo = "+parati.getCor());
		System.out.println(" Ano do veiculo = "+parati.getAnoCarro());
		System.out.println(" Placa do veiculo = "+parati.getPlaca());
		System.out.println(" Quantidade do veiculo = "+parati.getQuantidadePortas());	
		System.out.println(" Motor do veiculo = "+parati.getMotor());
		
	}

}