module com.illinihub {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.illinihub to javafx.fxml;
    exports com.illinihub;
}
