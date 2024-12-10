module frontendapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;
    requires java.sql;

    exports Language to javafx.graphics;
    opens Language to javafx.fxml;
}