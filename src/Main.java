
public class Main {

	public static void main(String[] args) {
		
		int i, j;
		int[][] tabelle = new int[9][9];
	
		for (i = 0; i < tabelle.length; i++) {
			
			for (j = 0; j < tabelle[i].length; j++) {
				
				tabelle[i][j] = (i + 1) * (j + 1);
				System.out.print(tabelle[i][j] + "\t");
				
			}
			System.out.println();
		}
		
	}

}
