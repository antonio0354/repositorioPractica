
public class operarrays {

	public static int array[] = new int[10];
	public static void main(String[] args) {
		rellenarray();
		imprimearray();
		sumarray();
	}
	
	public static void rellenarray() {
		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*20);
			
		}
		
	}
	
	public static void imprimearray() {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
			
		}
		
	}
	//hola3
	public static void sumarray() {
		int suma=0;
		for(int i=0;i<array.length;i++) {
			suma=suma+array[i];
		}
		System.out.println("La suma es: "+suma);
	}

}
