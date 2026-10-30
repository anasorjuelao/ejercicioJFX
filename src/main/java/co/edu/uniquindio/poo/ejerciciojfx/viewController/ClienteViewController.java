package co.edu.uniquindio.poo.ejerciciojfx.viewController;

import co.edu.uniquindio.poo.ejerciciojfx.app.Aplicacion;
import co.edu.uniquindio.poo.ejerciciojfx.controller.ClienteController;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClienteViewController {

    @FXML
    private ResourceBundle resources;

    private ClienteController agregarClienteController;

    @FXML
    private URL location;

    @FXML
    private TextField txtNombre;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnEliminarCliente;

    @FXML
    private Button btnActualizarCliente;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    private Aplicacion aplicacion;

    @FXML
    private Button btnAgregarCliente;

    @FXML
    void e81163(ActionEvent event) {

    }

    @FXML
    void e80948(ActionEvent event) {

    }

    @FXML
    void agregarClienteEvent(ActionEvent event) {

        agregarClienteAction();

    }

    private void agregarClienteAction() {
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cedula= txtCedula.getText();

        boolean buscarCliente = aplicacion.empresa.buscarCliente(cedula);

        if(buscarCliente) {
            mostrarMensaje("Cliente ya existente",
                    "Datos ya existentes", Alert.AlertType.INFORMATION);
        } else{
            mostrarMensaje("Cliente autorizado",
                    "Datos validos", Alert.AlertType.INFORMATION);
            aplicacion.openViewProductos();
        }
    }

    @FXML
    void actualizarClienteEvent(ActionEvent event) {

    }

    public void setApp(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;

        agregarClienteController = new ClienteController(aplicacion.empresa);
    }
    @FXML
    void limpiarTablaEvent(ActionEvent event) {

    }

    @FXML
    void eliminarClienteEvent(ActionEvent event) {

    }
    public void mostrarMensaje(String titulo,String mensaje,Alert.AlertType alertType) {
        Alert alerta = new Alert(alertType);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.show();
    }

    @FXML
    void initialize() {
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'agregarcliente.fxml'.";
        assert btnActualizarCliente != null : "fx:id=\"btnActualizarCliente\" was not injected: check your FXML file 'agregarcliente.fxml'.";
        assert txtApellido != null : "fx:id=\"txtApellido\" was not injected: check your FXML file 'agregarcliente.fxml'.";
        assert txtCedula != null : "fx:id=\"txtCedula\" was not injected: check your FXML file 'agregarcliente.fxml'.";
        assert btnAgregarCliente != null : "fx:id=\"btnAgregarCliente\" was not injected: check your FXML file 'agregarcliente.fxml'.";

    }
}

