import java.util.Scanner;
public class Ejemplo5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int opcion;
		int a;
		int b;
		int total;
		System.out.println("---------------------MENU--------------------");
		System.out.println("1.....NUMERO POSITIVO O NEGATIVO");
		System.out.println("2.....MAYOR O MENOR");
		System.out.println("3.....DIVISION");
		opcion=sc.nextInt();
		switch(opcion){
			case 1:
				System.out.println("Ingrese el numero a evaluar");
				a=sc.nextInt();
				if (a<0){
					System.out.println("El numero: "+ a + " es un numero negativo");
				}else{
					System.out.println("El numero: "+ a + " es un numero positivo");
				}
			break;
			case 2:
				System.out.println("Ingrese el primer numero a evaluar");
				a=sc.nextInt();
				System.out.println("Ingrese el segundo numero a evaluar");
				b=sc.nextInt();
				if (a>b){
					System.out.println("El numero: "+ a + " es el numero mayor, el numero: "+ b + " es menor");
				}else{
					System.out.println("El numero: "+ a + " es el numero menor, el numero: "+ b + " es mayor");
				}
			break;
			case 3:
				System.out.println("Ingrese el primer numero a operar");
				a=sc.nextInt();
				System.out.println("Ingrese el segundo numero a operar");
				b=sc.nextInt();
				if (b==0){
					System.out.println("INGRESE VALOR CORRECTO");
				}else{
					total=a/b;	
					System.out.println("El valor de la division es:" + total);
				}
			break;
		}
	}
}