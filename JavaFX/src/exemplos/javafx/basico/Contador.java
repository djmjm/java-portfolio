package exemplos.javafx.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application{
	
	private Integer contador = 0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		Label labelNumero = new Label(contador.toString());
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.setOnAction(
				e -> {
					contador++;
					labelNumero.setText(
							contador.toString()
							)
					;
				}
		);
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.setOnAction(
				e -> {
					contador--;
					labelNumero.setText(
							contador.toString()
							)
					;
				}
		);
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxPrincipal = new VBox();
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.setSpacing(10);
		boxPrincipal.getChildren().add(labelTitulo);
		boxPrincipal.getChildren().add(labelNumero);
		boxPrincipal.getChildren().add(boxBotoes);
		
		Scene cenaPrincipal = new Scene(
									boxPrincipal,
									400, 400
									);
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
