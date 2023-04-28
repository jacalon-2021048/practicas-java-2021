public class SerieFibonacci{
	public static void main(String args [] ){
		int numeroLimite=8;
		int numeroDeInicio=0;
		int numeroDeApoyo=1;
		int valor1=0;
		int valor2=0;
		while (valor1<=numeroLimite){
			System.out.println(numeroDeInicio);
			numeroDeInicio=numeroDeApoyo;
			System.out.println(numeroDeInicio);
			valor2=numeroDeInicio+numeroDeApoyo;
			numeroDeInicio=numeroDeApoyo;
			numeroDeApoyo=valor2;
			
			
			
		}
		
		
		
		
		
		
		
		
	}
}