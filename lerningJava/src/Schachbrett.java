
public class Schachbrett {

	public static void main(String[] args) {
		int jetzigerwert = 1;
		int ergebniswert = 0;
		System.out.println(jetzigerwert);
		for(int i = 1; i < 65; i++){
			jetzigerwert = jetzigerwert*2;
			ergebniswert = jetzigerwert;
			System.out.println("Schritt " + i + " ist gleich " + ergebniswert);
		}
		
	}

}
