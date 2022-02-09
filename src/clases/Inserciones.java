/*
 * @autor: Abel Jornet, Edgar Falcó, Raúl Garrido
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaAsignado_ACampos = "(Cientifico varchar(8) NOT NULL,"
			+ "Proyecto char(4) NOT NULL,"
			+ "PRIMARY KEY (Cientifico,Proyecto),"
			+ "KEY Proyecto (Proyecto),"
			+ "CONSTRAINT Asignado_A_ibfk_1 FOREIGN KEY (Cientifico) REFERENCES Cientificos (DNI) ON DELETE CASCADE,"
			+ "CONSTRAINT Asignado_A_ibfk_2 FOREIGN KEY (Proyecto) REFERENCES Proyecto (Id) ON DELETE CASCADE);";

	public static String tablaCientificosCampos = "(DNI varchar(8) NOT NULL,"
			+ "NomApels varchar(255) DEFAULT NULL,"
			+ "PRIMARY KEY (DNI));";
	
	public static String tablaProyectoCampos = "(Id char(4) NOT NULL,"
			+ "Nombre varchar(255) DEFAULT NULL,"
			+ "Horas int unsigned DEFAULT NULL,"
			+ "PRIMARY KEY (Id));";
				
	public static String insercionTablaCientificos = "(DNI, NomApels) values "
			+ "('41032423', 'Edgar'),"
			+ "('41032422', 'Abel'),"
			+ "('41032421', 'Raul'),"
			+ "('41032431', 'Ramon'),"
			+ "('41032432', 'Jorge');";
	
	public static String insercionTablaProyecto = "(Id, Nombre, Horas) values "
			+ "('1000', 'Vacuna','10000'),"
			+ "('2000', 'Comida Artificial','200'),"
			+ "('3000', 'Productos de higiene','400'),"
			+ "('4000', 'Pildoras','1200'),"
			+ "('5000', 'Suplementos','40000');";
	
	public static String insercionTablaAsignado_A = "(Cientifico, Proyecto) values "
			+ "('41032423', '1000'),"
			+ "('41032422', '2000'),"
			+ "('41032421', '3000'),"
			+ "('41032431', '4000');";
		
}
