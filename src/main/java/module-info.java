module com.mycompany.posmini {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql; 

    opens com.mycompany.posmini to javafx.fxml;
    exports com.mycompany.posmini;
}
