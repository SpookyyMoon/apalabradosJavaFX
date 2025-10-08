module com.example.apalabradosjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.apalabradosjavafx to javafx.fxml;
    exports com.example.apalabradosjavafx;
}