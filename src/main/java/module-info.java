module com.senai.teste {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senai.teste to javafx.fxml;
    exports com.senai.teste;
}