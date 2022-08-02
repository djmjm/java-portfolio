package exemplos.javafx.layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent raiz = null;
		//raiz = new TesteAnchorPane();
		raiz = new TesteBorderPane();
		
		/*
		  Scene principal = new Scene(
		 
				criarCaixas(), 
				800, 600)
		;
		*/
		/*Scene principal = 
				new Scene(
						new TesteAnchorPane(),
						800, 600
						)
				;
		*/
		Scene principal = 
				new Scene(
						raiz,
						800, 600
						)
				;
		
		primaryStage.setScene(principal);
		primaryStage.setTitle(
				"Gerenciadores de Layout"
		);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	private VBox criarCaixas() {
		VBox temp = new VBox();
		temp.getChildren().add(
				new Caixa().
				comTexto("1")
		)
		;
		
		temp.getChildren().add(
				new Caixa().
				comTexto("2")
		)
		;
		
		temp.getChildren().add(
				new Caixa().
				comTexto("3")
		)
		;
		
		temp.getChildren().add(
				new Caixa().
				comTexto("4")
		)
		;
		temp.getChildren().add(
				new Caixa().
				comTexto("5")
		)
		;
		
		temp.getChildren().add(
				new Caixa().
				comTexto("6")
		)
		;
		
		return temp;
	}
}
