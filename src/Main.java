import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static ArrayList<Articulo> articulos = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int opcion2;
        float precioModificar;
        String modeloModificar;

        while (true) {
            System.out.println("------------------------------------------");
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("    1. Agregar un articulo ");
            System.out.println("    2. Modificar el precio de un articulo");
            System.out.println("    3. Consultar listado de articulos ");
            System.out.println("    4. Salir del programa");
            System.out.print(">");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion == 4) {
                    System.out.println("Saliendo del programa...");
                    break;
                }

                switch (opcion){
                    case 1:
                        System.out.println("    Seleccione una de las siguientes opciones: ");
                        System.out.println("        1. Agregar un telefono ");
                        System.out.println("        2. Agregar una laptop");
                        System.out.print("     >");
                        opcion2 = scanner.nextInt();
                        scanner.nextLine();
                        try {
                            switch (opcion2) {
                                case 1:
                                    Telefono tel = new Telefono();

                                    System.out.println("Ingrese el nombre: ");
                                    tel.setNombre(scanner.nextLine());
                                    System.out.println("Ingrese el modelo: ");
                                    tel.setModelo(scanner.nextLine());
                                    System.out.println("Ingrese la descripcion: ");
                                    tel.setDescripcion(scanner.nextLine());
                                    System.out.println("Ingrese el precio: ");
                                    tel.setPrecio(scanner.nextFloat());
                                    System.out.println("Ingrese la capacidad (GB): ");
                                    tel.setCapacidad(scanner.nextInt());
                                    System.out.println("Ingrese el año de manufactura: ");
                                    tel.setYearModel(scanner.nextInt());

                                    articulos.add(tel);

                                    break;
                                case 2:
                                    Laptop laptop = new Laptop();

                                    System.out.println("Ingrese el nombre: ");
                                    laptop.setNombre(scanner.nextLine());
                                    System.out.println("Ingrese el modelo: ");
                                    laptop.setModelo(scanner.nextLine());
                                    System.out.println("Ingrese la descripcion: ");
                                    laptop.setDescripcion(scanner.nextLine());
                                    System.out.println("Ingrese el precio: ");
                                    laptop.setPrecio(scanner.nextFloat());
                                    scanner.nextLine();
                                    System.out.println("Ingrese el color: ");
                                    laptop.setColor(scanner.nextLine());
                                    System.out.println("Ingrese el año de manufactura: ");
                                    laptop.setYearModel(scanner.nextInt());

                                    articulos.add(laptop);
                                    break;
                                default:
                                    System.out.println("\n    No existe la opcion, seleccione una opcion del menu \n");
                                    break;
                            }
                        }catch (InputMismatchException exception){
                            System.out.println("\n    *Ingrese un dato valido* \n");
                            scanner.nextLine();
                        }
                        break;
                    case 2:
                        System.out.println("---------------------------------");
                        System.out.print("| Ingrese el modelo a modificar: ");
                        modeloModificar = scanner.nextLine();
                        System.out.print("| Ingrese el precio a modificar: $");
                        precioModificar = scanner.nextFloat();
                        scanner.nextLine();
                        System.out.println("---------------------------------");

                        modificarArticulo(modeloModificar, precioModificar);
                        break;
                    case 3:
                        mostrarListaArticulos();
                        break;
                    default:
                        System.out.println("\n    No existe la opcion, seleccione una opcion del menu \n");
                        break;
                }
            }catch (Exception exception) {
                System.out.println("\n    *Ingrese un dato valido* \n");
                scanner.nextLine();
            }
        }

    }


    private static void modificarArticulo(String modelo, float precioM) {
        for (int i = 0; i < articulos.size(); i++) {
            if (articulos.get(i).getModelo().equals(modelo)){
                articulos.get(i).setPrecio(precioM);
                System.out.println("    Cantidad modificada correctamente :)");
            }
        }
    }
    private static void mostrarListaArticulos() {
        for (int i = 0; i < articulos.size(); i++) {
            System.out.println("        Articulo n°" + i + 1);
            System.out.print("= Nombre: ");
            System.out.println(articulos.get(i).getNombre());

            System.out.print("= Modelo: ");
            System.out.println(articulos.get(i).getModelo());

            System.out.print("= Descripcion: ");
            System.out.println(articulos.get(i).obtenerDescripcion());

            System.out.print("= Precio: ");
            System.out.println(articulos.get(i).obtenerPrecio());

            /*System.out.println("Ingrese la capacidad (GB): ");
            System.out.println(articulos.get(i).());

            System.out.println("Ingrese el año de manufactura: ");
            System.out.println(articulos.get(i).());*/
        }
    }
}