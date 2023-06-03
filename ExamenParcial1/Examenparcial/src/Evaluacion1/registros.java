package Evaluacion1;

import java.util.Scanner;

public class registros {
	private String [] regisProducto;
	private int [] regisUnidades;
	Scanner sc= new Scanner(System.in);
	int opcion=0;
	
	Pedido pedido1 = new Pedido();
	public String[] getRegisProducto() {
		return regisProducto;
	}
	public void setRegisProducto(String[] regisProducto) {
		this.regisProducto = regisProducto;
	}
	public int[] getRegisUnidades() {
		return regisUnidades;
	}
	public void setRegisUnidades(int[] regisUnidades) {
		this.regisUnidades = regisUnidades;
	}

}
