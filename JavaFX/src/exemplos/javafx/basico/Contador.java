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
	
	private void atualizarLabelNumero( Label label ) {
		label.setText(
				contador.toString()
				)
		;
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador >= 0) {
			label.getStyleClass().add("verde");
		}
		else {
			label.getStyleClass().add("vermelho");
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");	
		
		Label labelNumero = new Label(contador.toString());
		labelNumero.getStyleClass().add("numero");	
		labelNumero.getStyleClass().add("verde");
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().
						add("botoes")
						;
		botaoIncremento.setOnAction(
				e -> {
					contador++;
					atualizarLabelNumero(
							labelNumero
							)
					;
				}
		);
		
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().
						add("botoes")
		;
		botaoDecremento.setOnAction(
				e -> {
					contador--;
					atualizarLabelNumero(
							labelNumero
							)
					;
				}
		);
		
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		VBox boxConteudo = new VBox();
		boxConteudo.getStyleClass().add("conteudo");
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		String caminhoDoCSS = getClass().
				getResource(
				"Contador.css"
				).toExternalForm()
		;
		String urlFont = 
				"https://fonts.googleapis.com/css2?family=Oswald";
		Scene cenaPrincipal = new Scene(
									boxConteudo,
									400, 400
									);
		cenaPrincipal.getStylesheets().
					 add(caminhoDoCSS);
		cenaPrincipal.getStylesheets()
					 .add( urlFont );		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
