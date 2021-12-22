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
		System.out.println("Número do ID:" +id_carro) ;
		System.out.println("Numero de portas:" +numero_portas) ;
		System.out.println("Tipo de câmbio:" +tipo_cambio) ;
		System.out.println("Tipo de direção:" +tipo_direcao) ;
		System.out.println("Cor do carro:" +cor) ;
		System.out.println("O motor do carro é:" +motor);
	}
	
	public void deletaCarro(int id_carro) {
		System.out.println("Registro deletado.");
		
	}
	
	public void updateCarro(int id_carro) {
		System.out.println("Registro atualizado.");
	
	}
	
	public void procurarPortas(int numero_portas) {
		System.out.println("Os carros com o número de portas pedido são: ");
	}
	
	public void procurarCambio(String tipo_cambio) {
		System.out.println("Os carros com o tipo de câmbio pedido são: ");
	}
	
	public void procurarDirecao(String tipo_direcao) {
		System.out.println("Os carros com o tipo de direção pedido são: ");
	}
	
	public void procurarMotor(float motor) {
		System.out.println("Os carros com esse tipo de motor são: ");
	}



}