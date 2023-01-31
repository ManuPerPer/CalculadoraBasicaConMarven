module Calculadora1.Calculadora {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.base;

    opens Calculadora1.Calculadora to javafx.fxml;
    exports Calculadora1.Calculadora;
}
