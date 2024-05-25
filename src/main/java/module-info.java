module com.example.desafioaperfeicoarlogica {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.desafioaperfeicoarlogica to javafx.fxml;
    exports com.example.desafioaperfeicoarlogica;
}