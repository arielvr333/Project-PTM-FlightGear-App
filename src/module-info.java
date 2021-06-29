module ProjectPTM2 {
    requires javafx.graphics;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.controls;
    requires java.xml.crypto;
    requires Medusa;
    requires project;
    opens view;
    opens model;
}