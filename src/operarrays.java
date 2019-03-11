
public class operarrays {

	public static int array[] = new int[10];
	public static void main(String[] args) {
		rellenarray();

	}
	
	public static void rellenarray() {
		for(int i=0;i<array.length;i++) {
			array[i]=(int) Math.round(Math.random()*20);
			
		}
		
	}

}
