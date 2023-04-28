import java.util.Scanner;
public class Ejemplo14{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.println("Ingrese el numero de inicio");
		a=sc.nextInt();
		System.out.println("Ingrese el limite");
		b=sc.nextInt();
		if (a>=b){
			System.out.println("EL NUMERO LIMITE NO PUEDE SER IGUAL O MENOR QUE EL NUMERO DE INICIO");
		}else{
			System.out.println("INICIA LA CUENTA");
			do{
				System.out.println(a);
				a++;
			}while(a<=b);
		}
	}
}