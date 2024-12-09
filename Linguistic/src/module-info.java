module frontendapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.media;
    requires java.sql;

    exports Language to javafx.graphics;
    opens Language to javafx.fxml;
}
