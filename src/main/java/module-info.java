module com.firstapp.firstapplogin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.firstapp.firstapplogin to javafx.fxml;
    exports com.firstapp.firstapplogin;
}