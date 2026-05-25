public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private double precio;

    public Vehiculo(String placa, String marca, String modelo, int year, String color, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa + " | Marca: " + marca + " | Modelo: " + modelo + 
                           " | Año: " + year + " | Color: " + color + " | Precio: RD$" + precio);
    }
}