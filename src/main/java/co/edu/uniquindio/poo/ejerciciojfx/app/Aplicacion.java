package co.edu.uniquindio.poo.ejerciciojfx.app;

import co.edu.uniquindio.poo.ejerciciojfx.model.Categoria;
import co.edu.uniquindio.poo.ejerciciojfx.model.Cliente;
import co.edu.uniquindio.poo.ejerciciojfx.model.Empresa;
import co.edu.uniquindio.poo.ejerciciojfx.model.Producto;
import co.edu.uniquindio.poo.ejerciciojfx.viewController.GestionarClienteViewController;
import co.edu.uniquindio.poo.ejerciciojfx.viewController.GestionarProductoViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Aplicacion extends Application {

    private Stage primaryStage;

    public static Empresa empresa = new Empresa ("movistar");

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Empresa movistar");
        openViewLogin();
    }
    private void openViewLogin() {
        inicializarData();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Aplicacion.class.getResource("/co/edu/uniquindio/poo/ejerciciojfx/agregarcliente.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            GestionarClienteViewController gestionarClienteViewController = loader.getController();
            gestionarClienteViewController.setApp(this);

            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void openViewProductos() {


        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Aplicacion.class.getResource("/co/edu/uniquindio/poo/empresa/agregarproductos.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            GestionarProductoViewController gestionarProductoViewController = loader.getController();
            gestionarProductoViewController.setApp(this);


            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }



    private void inicializarData() {

        Cliente cliente1 = new Cliente
                ("Juan","Arias","1094");
        empresa.agregarCliente(cliente1);

        Producto producto1= new Producto("112", 67, Categoria.AUDIFONOS);
    }

    public static void main(String[] args) {
        launch();
    }
}
