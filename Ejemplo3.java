import java.util.Scanner;
public class Ejemplo3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int opciones;
		int numero;
		int numeroDos;
		int total;
		System.out.println("---------------------MENU--------------------");
		System.out.println("1.....SUMA");
		System.out.println("2.....RESTA");
		System.out.println("3.....MULTIPLICACION");
		System.out.println("4.....DIVISION(COCIENTE)");
		System.out.println("5.....DIVISION(RESIDUO)");
		opciones=sc.nextInt();
		switch (opciones){
			case 1:
				System.out.println("Ingrese el primer numero a operar");
				numero=sc.nextInt();
				System.out.println("Ingrese el segundo numero a operar");
				numeroDos=sc.nextInt();
				total=numero+numeroDos;
				System.out.println("El resultado de la suma es: " + total);
			break;
			case 2:
				System.out.println("Ingrese el primer numero a operar");
				numero=sc.nextInt();
				System.out.println("Ingrese el segundo numero a operar");
				numeroDos=sc.nextInt();
				total=numero-numeroDos;
				System.out.println("El resultado de la resta es: " + total);
			break;
			case 3:
				System.out.println("Ingrese el primer numero a operar");
				numero=sc.nextInt();
				System.out.println("Ingrese el segundo numero a operar");
				numeroDos=sc.nextInt();
				total=numero*numeroDos;
				System.out.println("El resultado de la multiplicacion es: " + total);
			break;
			case 4:
				System.out.println("Ingrese el primer numero a operar");
				numero=sc.nextInt();
				System.out.println("Ingrese el segundo numero a operar");
				numeroDos=sc.nextInt();
				total=numero/numeroDos;
				System.out.println("El resultado del cociente de la division es: " + total);
			break;
			case 5:
				System.out.println("Ingrese el primer numero a operar");
				numero=sc.nextInt();
				System.out.println("Ingrese el segundo numero a operar");
				numeroDos=sc.nextInt();
				total=numero%numeroDos;
				System.out.println("El resultado del residuo de la division es: " + total);
			break;
			
		}
	}
}