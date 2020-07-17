import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> proveedor = new ArrayList<String>();
		ArrayList<String> ciudad = new ArrayList<String>();
		ArrayList<Integer> articulos = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);

		// llenado de listas
		proveedor.add("maria");
		proveedor.add("pedro");
		proveedor.add("camilo");

		ciudad.add("paris");
		ciudad.add("roma");
		ciudad.add("barcelona");

		articulos.add(29);
		articulos.add(12);
		articulos.add(42);

		System.out.println(
				" Ingrese el numero de la operacion para realizarla  : \n1: Obtener informacion del proveedor. \n2: Cambiar ciudad de un proveedor. \n3: Cambiar numero de articulos de un proveedor. \n4: Agregar un proveedor. \n5: Dar de baja a un proveedor. \n0: Cerrar el programa");
		int opc = scan.nextInt();
		while (opc != 0) {
			System.out.println("Ingrese el nombre del proveedor");
			String name = scan.next();

			switch (opc) {
			case 1:
				if (proveedor.contains(name)) {
					int pos = proveedor.indexOf(name);
					System.out.println("\tNombre \tCiudad \tArticulos \n" + "\t" + proveedor.get(pos) + "\t"
							+ ciudad.get(pos) + "\t" + articulos.get(pos));

				} else {
					System.out.println("El proveedor no existe");
				}

				break;
			case 2:

				if (proveedor.contains(name)) {
					int pos = proveedor.indexOf(name);
					System.out.println(
							"la ciudad actual es : " + ciudad.get(pos) + "\nIngrese el nombre de la nueva ciudad");
					ciudad.set(pos, scan.next());
					System.out.println("\tNombre \tCiudad \tArticulos");
					for (int i = 0; i < proveedor.size(); i++) {
						System.out.println("\t" + proveedor.get(i) + "\t" + ciudad.get(i) + "\t" + articulos.get(i));
					}

				} else {
					System.out.println("El proveedor no existe");
				}
				break;
			case 3:
				if (proveedor.contains(name)) {
					int pos = proveedor.indexOf(name);
					System.out.println("el numero actual de articulos es :" + articulos.get(pos)
							+ "\ningrese la cantidad de ariculos que aumeta o disminuye. Si disminuye el numero debe ser negativo");

					articulos.set(pos, articulos.get(pos) + scan.nextInt());
					System.out.println("\tNombre \tCiudad \tArticulos");
					for (int i = 0; i < proveedor.size(); i++) {
						System.out.println("\t" + proveedor.get(i) + "\t" + ciudad.get(i) + "\t" + articulos.get(i));
					}

				} else {
					System.out.println("El proveedor no existe");
				}
				break;
			case 4:
				System.out.println("ingrese el nombre del nuevo proveedor");
				String nuevoName = scan.next();
				System.out.println("ingrese la ciudad del nuevo proveedor");
				String nuevoCiudad = scan.next();
				System.out.println("ingrese el numero de articulos del nuevo proveedor");
				int nuevoArticulo = scan.nextInt();
				proveedor.add(nuevoName);
				ciudad.add(nuevoCiudad);
				articulos.add(nuevoArticulo);
				System.out.println("\tNombre \tCiudad \tArticulos");
				for (int i = 0; i < proveedor.size(); i++) {
					System.out.println("\t" + proveedor.get(i) + "\t" + ciudad.get(i) + "\t" + articulos.get(i));
				}

				break;

			case 5:
				if (proveedor.contains(name)) {
					int pos = proveedor.indexOf(name);
					proveedor.remove(pos);
					articulos.remove(pos);
					ciudad.remove(pos);
					System.out.println("\tNombre \tCiudad \tArticulos");
					for (int i = 0; i < proveedor.size(); i++) {
						System.out.println("\t" + proveedor.get(i) + "\t" + ciudad.get(i) + "\t" + articulos.get(i));
					}

				} else {
					System.out.println("El proveedor no existe");
				}
				break;

			default:
				break;

			}
			System.out.println(
					" Ingrese el numero de la operacion para realizarla  : \n1: Obtener informacion del proveedor. \n2: Cambiar ciudad de un proveedor. \n3: Cambiar numero de articulos de un proveedor. \n4: Agregar un proveedor. \n5: Dar de baja a un proveedor. \n0: Cerrar el programa");
			opc = scan.nextInt();
		}

	}

}
