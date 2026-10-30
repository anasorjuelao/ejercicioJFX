package co.edu.uniquindio.poo.ejerciciojfx.model;

public class Producto {

    private final String codigo;
    private int cantidadDisponible;
    private Categoria categoriaProducto;

    public Producto(String codigo, int cantidadDisponible, Categoria categoriaProducto) {
        this.codigo = codigo;
        this.cantidadDisponible= cantidadDisponible;
        this.categoriaProducto= categoriaProducto;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Categoria getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(Categoria categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }
}
