package com.exercicio.array.matriz;

public class ApplicationProgramming01 {
	public static void main(String[] args) {
		
		String[][] matriz = new String[5][5];
		
		matriz[0][4] = "00-linha - Matriz - 00";
		matriz[0][3] = "01-linha - Matriz - 00";
		matriz[0][2] = "02-linha - Matriz - 00";
		matriz[0][1] = "03-linha - Matriz - 00";
		matriz[0][0] = "04-linha - Matriz - 00";
		
		matriz[1][4] = "00-linha - Matriz - 01";
		matriz[1][3] = "01-linha - Matriz - 01";
		matriz[1][2] = "02-linha - Matriz - 01";
		matriz[1][1] = "03-linha - Matriz - 01";
		matriz[1][0] = "04-linha - Matriz - 01";
		
		matriz[2][4] = "00-linha - Matriz - 02";
		matriz[2][3] = "01-linha - Matriz - 02";
		matriz[2][2] = "02-linha - Matriz - 02";
		matriz[2][1] = "03-linha - Matriz - 02";
		matriz[2][0] = "04-linha - Matriz - 02";
		
		matriz[3][4] = "00-linha - Matriz - 03";
		matriz[3][3] = "01-linha - Matriz - 03";
		matriz[3][2] = "02-linha - Matriz - 03";
		matriz[3][1] = "03-linha - Matriz - 03";
		matriz[3][0] = "04-linha - Matriz - 03";
		
		matriz[4][4] = "00-linha - Matriz - 04";
		matriz[4][3] = "01-linha - Matriz - 04";
		matriz[4][2] = "02-linha - Matriz - 04";
		matriz[4][1] = "03-linha - Matriz - 04";
		matriz[4][0] = "04-linha - Matriz - 04";
		
		for(int i = 0; i < matriz.length; i++) {
			System.out.println();
			System.out.print("----------00-COLUNA----|---------01-COLUNA------|---------02-COLUNA------|------------03-COLUNA---|--------04-COLUNA-------");
			System.out.println();
			for(int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " | ");
				
			}
		}
	}

}
