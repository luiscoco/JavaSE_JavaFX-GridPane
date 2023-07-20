module com.sample2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.sample2 to javafx.fxml;
    exports com.sample2;
}
