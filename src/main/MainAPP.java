/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class MainAPP {

	public static void main(String[] args) {

		Mysql.openConnection();		
		System.out.println("");
		
		Mysql.createDB("Cientificos");
		
		Mysql.createTable("Cientificos", "Cientificos", Inserciones.tablaCientificosCampos);
		Mysql.createTable("Cientificos", "Proyecto", Inserciones.tablaProyectoCampos);
		Mysql.createTable("Cientificos", "Asignado_A", Inserciones.tablaAsignado_ACampos);
		
		Mysql.insertData("Cientificos", "Cientificos", Inserciones.insercionTablaCientificos);
		Mysql.insertData("Cientificos", "Proyecto", Inserciones.insercionTablaProyecto);
		Mysql.insertData("Cientificos", "Asignado_A", Inserciones.insercionTablaAsignado_A);
		
		Mysql.getValues("Cientificos", "Asignado_A");
		
		Mysql.deleteRecord("Cientificos", "Asignado_A", 1000);
		
		Mysql.getValues("Cientificos", "Asignado_A");
		
		System.out.println("");
		Mysql.closeConnection();
	}

}
