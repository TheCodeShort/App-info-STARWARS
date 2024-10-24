import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		ConsultaPelicula consulta = new ConsultaPelicula();
		Scanner lectura = new Scanner(System.in);
		System.out.println("Escriba el nuemro del la pelicula de Star Wars que quiere consultar");

		try {
			var numeroDePelicula  = Integer.valueOf(lectura.nextLine());
			Pelicula pelicula = consulta.buscarPelicula(numeroDePelicula);
			System.out.println(pelicula);
			GeneradorDeArchivo generar = new GeneradorDeArchivo();
			generar.guardarJson(pelicula);
		}catch (NumberFormatException e) {
			System.out.println("Numero no encontrado" + e.getMessage());
		}catch (RuntimeException | IOException e){
			System.out.println(e.getMessage());
			System.out.println("Finalizando mi Aplicacion");
		}

	}
}


