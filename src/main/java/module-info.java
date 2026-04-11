module org.gmp.gmp {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.gmp.gmp to javafx.fxml, javafx.graphics;
    opens org.gmp.gmp.controller to javafx.fxml;
    opens org.gmp.gmp.model to javafx.fxml;

    exports org.gmp.gmp;
}