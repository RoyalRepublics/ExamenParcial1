package Evaluacion1;
import java.util.Scanner;
public class Pedido {
	Scanner sc= new Scanner(System.in);
		private String [] Producto;
		private String [] Proveedor;
		private float [] precioUnitario;
		private int [] unidades;
		int op,aux=0;
		float aux3;
		String aux2;
		int [] regisCompra;
		String [] nombreCompra;
		float suma;
		public void ingresoNumeros() {
			 System.out.print("Ingrese la cantidad Productos que desea registrar: ");
			 Pedido[] pedido = null;
			 op = sc.nextInt();
			 Producto = new String[op];			 
			 precioUnitario = new float[op];
			 unidades = new int[op];
			 
			 for (int i = 0; i < op; i++) {
				 sc.nextLine();
			 System.out.print("Ingrese el nombre del producto "+(i+1)+": ");
			 Producto[i] = sc.nextLine();			
			 System.out.print("Ingrese la cantidad del producto "+(i+1)+": ");
			 unidades[i] = sc.nextInt();
			 System.out.print("Ingrese el precio unitario del producto "+(i+1)+": ");
			 precioUnitario[i] = sc.nextFloat();
			 
			 }
			 System.out.println("Productos registrados exitosamente. ");
			 }
		//funcion para crear un nuevo proveedor.
		public void ingresoProveedores() {
			 System.out.print("Ingrese la cantidad de Proveedores que desea registrar: ");
			 op = sc.nextInt();			 
			 Proveedor = new String[op];			 
			 for (int i = 0; i < op; i++) {
				 sc.nextLine();
				 System.out.print("Ingrese el nombre del proveedor "+(i+1)+": ");
				 Producto[i] = sc.nextLine();
			 
			 }
			 System.out.println("Proveedores registrados exitosamente. ");
			 }
		//funcion para crear un nuevo pedido
		public void nuevoPedido() {
			 System.out.print("Lista de productos: ");
			 for(String i:Producto) {
				 int j=0;
				 System.out.println("hay el producto "+Producto[j]+" con Stock "+unidades[j]+" y precio unitario "+precioUnitario[j]);
			 }			 
			 for (int i = 0; i < Producto.length; i++) {
				 sc.nextLine();
			 
				 System.out.print("Ingrese el nombre del producto. ");
				 nombreCompra[i] = sc.nextLine();
				 System.out.print("Ingrese la cantidad del producto. ");
				 regisCompra[i] = sc.nextInt();
				 aux3=precioUnitario[i];
			 }
			 System.out.println("Proveedores registrados exitosamente. ");
			 }
			//funcion para crear la factura.
		public void nuevaFactura() {
			 System.out.print("Lista de productos: ");
			 
			 for (int i = 0; i < nombreCompra.length; i++) {
				 sc.nextLine();
			 //acumulador
				 suma=suma+(precioUnitario[i]*regisCompra[i]);
			 }
			 System.out.println("Proveedores registrados exitosamente. ");
			 }
		public void ventaMayor() {
			 System.out.print("Lista de productos: ");
			 
			 for (int i = 0; i < nombreCompra.length; i++) {
				 
				 if(aux<regisCompra[i]) {
						 aux=regisCompra[i];
						 aux2=nombreCompra[i];
				 }
			 //acumulador
				 
			 }
			 System.out.println("Producto que se ha ventido mas ");
			 }
		
		
		
		public String[] getProducto() {
			return Producto;
		}
		public void setProducto(String[] producto) {
			Producto = producto;
		}
		public String[] getProveedor() {
			return Proveedor;
		}
		public void setProveedor(String[] proveedor) {
			Proveedor = proveedor;
		}
		
		public float[] getPrecioUnitario() {
			return precioUnitario;
		}
		public void setPrecioUnitario(float[] precioUnitario) {
			this.precioUnitario = precioUnitario;
		}
		public int[] getUnidades() {
			return unidades;
		}
		public void setUnidades(int[] unidades) {
			this.unidades = unidades;
		}

}
