package Evaluacion1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int opcion=0;
		
		Pedido pedido1 = new Pedido();
		//while para que se repita el menu hasta que el usuario escoja la opcion 6 para salir del programa.
		while(opcion!=6) {
		
			//switch para presentar el menu
		
			System.out.println("1. Productos.");
			System.out.println("2. Proveedores.");
			System.out.println("3. Nuevo pedido.");
			System.out.println("4. Pedido mayor.");
			System.out.println("5. Total Facturado.");
			System.out.println("6. Salir.");
			System.out.println("Escoja una opcion: ");
			opcion=sc.nextInt();
			switch (opcion) {
				case 1:
					pedido1.ingresoNumeros();
					break;
				case 2:
					pedido1.ingresoProveedores();
					break;
				case 3:
					pedido1.nuevoPedido();
					break;
				
				case 4:
					pedido1.ventaMayor();
					break;
				case 5:
					pedido1.nuevaFactura();
					break;
				case 6:
					System.out.println("ha salido con exito");
					break;
				default:
					System.out.println("Opcion Invalida");
					break;
					
			}
	}

}}
