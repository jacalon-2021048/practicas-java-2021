public class CalcuSwitch{
	public static void main(String args [] ){
		System.out.println("Para suma ingrese +");
		System.out.println("Para resta ingrese -");
		System.out.println("Para multiplicacion ingrese *");
		System.out.println("Para division ingrese /");
		int numero=10;
		int numero2=50;
		int total;
		char signo='+';
		switch (signo){
			case '+':
				System.out.println("Suma");
				total=numero+numero2;
				System.out.println("El valor de la suma es:"+total);
				break;
			case '-':
				System.out.println("Resta");
				total=numero-numero2;
				System.out.println("El valor de la resta es:" +total);
				break;
			case '*':	
				System.out.println("Multiplicacion");
				total=numero*numero2;
				System.out.println("El valor de la multiplicacion es:" +total);
				break;
			case '/':
				System.out.println("Division");
				total=numero/numero2;
				System.out.println("El valor de la division es:" +total);
				if (numero2==0){
					System.out.println("INGRESE VALOR CORRECTO");
					
				}
			break;	
		}
	}

}