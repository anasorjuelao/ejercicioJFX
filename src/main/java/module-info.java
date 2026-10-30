module co.edu.uniquindio.poo.ejerciciojfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens co.edu.uniquindio.poo.ejerciciojfx to javafx.fxml;

    exports co.edu.uniquindio.poo.ejerciciojfx.model;
    exports co.edu.uniquindio.poo.ejerciciojfx.app;
    exports co.edu.uniquindio.poo.ejerciciojfx.viewController;

    opens co.edu.uniquindio.poo.ejerciciojfx.viewController to javafx.fxml;

}