public class RegistroAgencia {
    private Vehiculo[] inventario;
    private int cantidadActual;

    public RegistroAgencia(int capacidadMaxima) {
        inventario = new Vehiculo[capacidadMaxima];
        cantidadActual = 0;
    }

    public void registrar(Vehiculo nuevoVehiculo) {
        if (cantidadActual < inventario.length) {
            inventario[cantidadActual] = nuevoVehiculo;
            cantidadActual++;
            System.out.println("\n¡Vehículo registrado exitosamente!");
        } else {
            System.out.println("\nError: El inventario está lleno, no se pueden registrar más vehículos.");
        }
    }

    public void mostrarTodos() {
        if (cantidadActual == 0) {
            System.out.println("\nNo hay vehículos registrados en el sistema.");
            return;
        }
        
        System.out.println("\n--- Lista de Vehículos ---");
        for (int i = 0; i < cantidadActual; i++) {
            inventario[i].mostrarInformacion();
        }
    }

    public void buscarPorPlaca(String placaBuscada) {
        boolean encontrado = false;
        
        System.out.println("\n--- Resultado de Búsqueda ---");
        for (int i = 0; i < cantidadActual; i++) {
            if (inventario[i].getPlaca().equalsIgnoreCase(placaBuscada)) {
                inventario[i].mostrarInformacion();
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontró ningún vehículo con la placa: " + placaBuscada);
        }
    }

    public void mostrarPorMarca(String marcaBuscada) {
        boolean encontrado = false;
        
        System.out.println("\n--- Vehículos de la marca " + marcaBuscada + " ---");
        for (int i = 0; i < cantidadActual; i++) {
            if (inventario[i].getMarca().equalsIgnoreCase(marcaBuscada)) {
                inventario[i].mostrarInformacion();
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No se encontraron vehículos de la marca: " + marcaBuscada);
        }
    }
}