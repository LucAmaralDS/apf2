package apf2;

public class Motos {
	private int id_moto;
	private String tipo_cambio_moto;
	private String cor_moto;
	private float motor_moto;
	
	public void adicionaMoto(int id_moto, String tipo_cambio_moto, String cor_moto) {
		System.out.println("Moto adicionada:");
		System.out.println("N�mero do ID:" +id_moto);
		System.out.println("Tipo de c�mbio:" +tipo_cambio_moto);
		System.out.println("Cor do carro:" +cor_moto);

}
	
	public void deletaMoto(int id_moto) {
		System.out.println("Registro deletado.");
		
	}
	
	public void updateMoto(int id_moto) {
		System.out.println("Registro atualizado.");
	
	}
	
	public void procurarCambioMoto(String tipo_cambio_moto) {
		System.out.println("As motos com o tipo de c�mbio pedido s�o: ");
	}
	
	public void procurarMotorMoto(float motor_moto) {
		System.out.println("As motos com esse tipo de motor s�o: ");
	}


}
