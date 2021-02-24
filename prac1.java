import java.util.*;

public class prac1{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		vector met = new vector(6);
		int op;
		
		do{
			System.out.println("\n\n\n1)Captura de nombre y calificaciones");
			System.out.println("2)Imprimir calificaciones y promedio de calificaciones");
			System.out.println("3)Imprimir calificaciones y calificacion mas baja");
			System.out.println("4)Imprimir calificaciones y calificacion mas alta");
			System.out.println("5)Salir");
			op = scan.nextInt();
			
			switch(op){
				case 1:
					met.calificaciones();
					break;
				case 2:
					met.imprimirCalificiones();
					met.media();
					break;
				case 3:
					met.imprimirCalificiones();
					met.min();
					break;
				case 4:
					met.imprimirCalificiones();
					met.max();
					break;
				case 5:
					break;
			}
		}while(op != 5);
	}
}