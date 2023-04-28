public class Ejemplo2{
	public static void main(String args[]){
		int numero=9;
		int x=11;
		numero=10;
		x=numero;
		numero=x;
		x=x;
		
		System.out.println(x);
		System.out.println(numero);
	}
}