module com.mycompany.t18operaciones {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.t18operaciones to javafx.fxml;
    exports com.mycompany.t18operaciones;
}
