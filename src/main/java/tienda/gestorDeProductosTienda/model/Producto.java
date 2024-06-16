import java.time.LocalDate;
import java.util.Date;

public abstract class Producto {

    private static int contador = 1;
    private int idProducto;
    private String nombre;
    private String marca;
    private  double precio;
    private int stockCantidad;
    private Date fechaCompra;
    private double descuento;

    public Producto(String nombre, String marca, double precio, int stockCantidad, Date fechaCompra, double descuento) {
        this.contador = ++contador;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stockCantidad = stockCantidad;
        this.fechaCompra = fechaCompra;
        this.descuento = descuento;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockCantidad() {
        return stockCantidad;
    }

    public void setStockCantidad(int stockCantidad) {
        this.stockCantidad = stockCantidad;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void aplicarDescuento(){
        this.precio -= this.precio * (descuento/100);
    }

}
