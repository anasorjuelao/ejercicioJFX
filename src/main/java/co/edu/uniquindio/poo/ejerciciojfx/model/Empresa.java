package co.edu.uniquindio.poo.ejerciciojfx.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Empresa {
    private String nombre;
    private List <Cliente> listaClientes;
    private ArrayList <Producto> listaProductos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.listaClientes = new ArrayList<>();
        this.listaClientes= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public String registraEmpleado(Cliente cliente){
        boolean cliente1 = buscarCliente(cliente.getCedula());
        if(cliente1){
            return "Ya existe un empleado";
        }
        else listaClientes.add(cliente);
        return "Empelado registrado exitosamente";
    }
    public boolean buscarCliente(String cedula){
        for(Cliente cliente: listaClientes){
            if(cliente.getCedula().equals(cedula)){
                return true;
            }
        }
        return false;
    }
    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean agregarCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getCedula())) {
            listaClientes.add(cliente);
            centinela = true;
        }
        return centinela;
    }
    public boolean actualizarCliente(String cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.setCedula(actualizado.getCedula());
                cliente.setNombre(actualizado.getNombre());
                cliente.setApellido(actualizado.getApellido());
                centinela = true;
                break;
            }
        }
        return centinela;
    }
    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                listaClientes.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }
    //CRUD DE PRODUCTO
    public boolean agregarProducto(Producto producto) {
        boolean centinela = false;
        if (!verificarCliente(producto.getCodigo())) {
            listaProductos.add(producto);
            centinela = true;
        }
        return centinela;
    }
    public boolean verificarProducto(String codigo) {
        boolean centinela = false;
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                centinela = true;
            }
        }
        return centinela;
    }
    public boolean actualizarProducto(String codigo, Producto actualizado) {
        boolean centinela = false;
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                producto.setCantidadDisponible(actualizado.getCantidadDisponible());
                centinela = true;
                break;
            }
        }
        return centinela;
    }
    public boolean eliminarProducto(String codigo) {
        boolean centinela = false;
        for (Producto producto : listaProductos) {
            if (producto.getCodigo().equals(codigo)) {
                listaProductos.remove(producto);
                centinela = true;
                break;
            }
        }
        return centinela;
    }
}
