module com.hotplate.hotplate {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;
    //requires twilio;


    opens com.hotplate.hotplate to javafx.fxml;
    exports com.hotplate.hotplate;
}