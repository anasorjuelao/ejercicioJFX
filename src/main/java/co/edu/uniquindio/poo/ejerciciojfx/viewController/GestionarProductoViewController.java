package co.edu.uniquindio.poo.ejerciciojfx.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import co.edu.uniquindio.poo.ejerciciojfx.app.Aplicacion;

public class GestionarProductoViewController {

    Aplicacion aplicacion;

    public void setApp(Aplicacion aplicacion) {
        this.aplicacion= aplicacion;
    }
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtCategoria;

    @FXML
    private Button btnAgregarProducto;

    @FXML
    private Button btnEliminarProducto;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TextField txtCantidad;

    @FXML
    private TextField txtCodigo;

    @FXML
    private Button btnActualizarProducto;

    @FXML
    void agregarProductoEvent(ActionEvent event) {

    }

    @FXML
    void actualizarProductoEvent(ActionEvent event) {

    }

    @FXML
    void limpiarTablaEvent(ActionEvent event) {

    }

    @FXML
    void eliminarProductoEvent(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtCategoria != null : "fx:id=\"txtCategoria\" was not injected: check your FXML file 'agregarproductos.fxml'.";
        assert btnAgregarProducto != null : "fx:id=\"btnAgregarProducto\" was not injected: check your FXML file 'agregarproductos.fxml'.";
        assert btnEliminarProducto != null : "fx:id=\"btnEliminarProducto\" was not injected: check your FXML file 'agregarproductos.fxml'.";
        assert btnLimpiar != null : "fx:id=\"btnLimpiar\" was not injected: check your FXML file 'agregarproductos.fxml'.";
        assert txtCantidad != null : "fx:id=\"txtCantidad\" was not injected: check your FXML file 'agregarproductos.fxml'.";
        assert txtCodigo != null : "fx:id=\"txtCodigo\" was not injected: check your FXML file 'agregarproductos.fxml'.";
        assert btnActualizarProducto != null : "fx:id=\"btnActualizarProducto\" was not injected: check your FXML file 'agregarproductos.fxml'.";

    }
}
