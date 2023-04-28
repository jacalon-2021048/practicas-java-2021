public class Ejercicio8{
	public static void main (String args[]){
		int buscado=400;
		int arregloEntero[]={100,200,400,500,600};
		
		for(int i:arregloEntero){
			System.out.println(i);
			
			if (buscado==i){
				System.out.println(Valor encontrado!!, anda a mimir!!!);
				break;
				
			}
		}
	}	
}