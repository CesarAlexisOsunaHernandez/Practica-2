import java.util.*;

public class vector{
	int calif[], size;
	String nombre;
	
	public vector(int size){
		this.size = size;
		calif = new int[this.size];
	}
	
	public void calificaciones(){
		this.nombre = new String(capturarNombre());
		for(int i = 0; i < this.size; i++){
			this.calif[i] = capturarCalificaciones(i + 1);
		}
	}
	
	public static int capturarCalificaciones(int i){
		Scanner ents = new Scanner(System.in);
		System.out.print("\nCalificacion no." + i + ": ");
		return (ents.nextInt());
	}
	
	public static String capturarNombre(){
		Scanner nom = new Scanner(System.in);
		System.out.print("\n\nNombre del alumno: ");
		return (nom.nextLine());
	}
	
	public void imprimirCalificiones(){
		System.out.println("|" + this.nombre + "|Calificaciones|");
		
		for(int i = 0; i < this.size; i++){
			System.out.print("|" + (i + 1));
			for(int j = 0; j < this.nombre.length() - 1; j++){
				System.out.print(" ");
			}
			System.out.println("|      " + this.calif[i] + "       |");
		}
	}
	
	public void media(){
		float media = 0;
		for(int i = 0; i < this.size; i++){
			media += this.calif[i];
		}
		System.out.println("\nPromedio: " + media / this.size);
	}
	
	public void min(){
		int min = this.calif[0];
		
		for(int i = 0; i < this.size; i++){
			if(this.calif[i] < min){
				min = this.calif[i];
			}
		}
		
		System.out.println("\nCalificacion minima: " + min);
	}
	
	public void max(){
		int max = this.calif[0];
		
		for(int i = 0; i < this.size; i++){
			if(this.calif[i] > max){
				max = this.calif[i];
			}
		}
		
		System.out.println("\nCalificacion maxima: " + max);
	}
} 