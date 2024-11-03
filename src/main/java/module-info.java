module exemplo.livro1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires transitive java.sql;

    opens exemplo.livro1.controller to javafx.fxml;
    exports exemplo.livro1.controller;

    opens exemplo.livro1.model to javafx.fxml;
    exports exemplo.livro1.model;

    opens exemplo.livro1.main to javafx.fxml;
    exports exemplo.livro1.main;

    opens exemplo.livro1.dao to javafx.fxml;
    exports exemplo.livro1.dao;

}