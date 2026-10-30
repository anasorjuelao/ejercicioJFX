package co.edu.uniquindio.poo.ejerciciojfx.controller;

import co.edu.uniquindio.poo.ejerciciojfx.model.Empresa;
import co.edu.uniquindio.poo.ejerciciojfx.model.Producto;

import java.util.ArrayList;

public class ProductoController {

    Empresa empresa;

    public boolean buscarCliente(){
        return buscarCliente();
    }
    public ProductoController(Empresa empresa){
        this.empresa= empresa;
    }

    public boolean crearProducto(Producto producto) {
        return empresa.agregarProducto(producto);
    }

    public ArrayList<Producto> obtenerProductos() {
        return empresa.getListaProductos();
    }

    public boolean eliminarProductos(String codigo) {
        return empresa.eliminarProducto(codigo);
    }

    public boolean actualizarProducto(String codigo, Producto producto) {
        return empresa.actualizarProducto(codigo, producto);
    }

}
