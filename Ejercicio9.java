public class Ejercicio9{
	public static void main(String args[]){
		int buscado=3;
		int veces=0;
		int arr[]={3,276,3,134,3,85,31};
		
		for(int i:arr){
			if (buscado!=i){
				
				continue;
				System.out.println("aun no encuentra el numero?");
				
			}
			veces++;
		}
		System.out.println("El numero "+buscado+" se encuentra "+veces+" vez(ces)");
	}	
}