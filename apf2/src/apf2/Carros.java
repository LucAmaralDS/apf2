package apf2;

public class Carros {
	private int id_carro;
	private int numero_portas; 
	private String tipo_cambio;
	private String tipo_direcao; 
	private String cor;
	private float motor;
	
	public void adicionaCarro(int id_carro, int numero_portas, String tipo_cambio, String tipo_direcao, String cor, float motor) {
		System.out.println("Carro adicionado:") ;
		System.out.println("N�mero do ID:" +id_carro) ;
		System.out.println("Numero de portas:" +numero_portas) ;
		System.out.println("Tipo de c�mbio:" +tipo_cambio) ;
		System.out.println("Tipo de dire��o:" +tipo_direcao) ;
		System.out.println("Cor do carro:" +cor) ;
		System.out.println("O motor do carro �:" +motor);
	}
	
	public void deletaCarro(int id_carro) {
		System.out.println("Registro deletado.");
		
	}
	
	public void updateCarro(int id_carro) {
		System.out.println("Registro atualizado.");
	
	}
	
	public void procurarPortas(int numero_portas) {
		System.out.println("Os carros com o n�mero de portas pedido s�o: ");
	}
	
	public void procurarCambio(String tipo_cambio) {
		System.out.println("Os carros com o tipo de c�mbio pedido s�o: ");
	}
	
	public void procurarDirecao(String tipo_direcao) {
		System.out.println("Os carros com o tipo de dire��o pedido s�o: ");
	}
	
	public void procurarMotor(float motor) {
		System.out.println("Os carros com esse tipo de motor s�o: ");
	}



}