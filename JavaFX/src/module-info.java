module exemplos.javafx {
	requires javafx.base;
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.fxml;
	
	opens exemplos.javafx.basico;
	opens exemplos.javafx.layout;
	opens exemplos.javafx.fxml;
}