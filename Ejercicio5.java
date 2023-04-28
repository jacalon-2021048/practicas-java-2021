public class Ejercicio5{
	public static void main (String args[]){
		int x=10;
		int y=0;
		int a=x*y;
		int z=0;
		do{
			System.out.println(x+ "*" +y+ "=" +a);
			y++;
			z++;
			a=x*y;
			
			
		}while (z<=10);
	}
}