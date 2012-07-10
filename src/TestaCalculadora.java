
public class TestaCalculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora c = new Calculadora();
		int valorDaSoma = c.somar(10, 10);
		if (valorDaSoma == 20) {
			System.out.println("esta correto");
		}else{
			System.out.println("esta errado");
		}
		
		int valorDaSubtracao = c.subtracao(20,10);
		if (valorDaSubtracao == 10){
			System.out.println("esta correto");
		}else{
			System.out.println("esta errado");
		}
	}

}
