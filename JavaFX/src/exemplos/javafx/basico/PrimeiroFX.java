package exemplos.javafx.basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFX extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		botaoA.setOnAction(e -> 
			System.out.println("Botao A pressionado!!!")
		);
		botaoC.setOnAction( e ->
			{
			System.out.println("Encerrando programa");
			System.exit(0);
			}
		);
		
		botaoB.setOnAction(e -> 
			System.out.println("Botao B pressionado!!!")
		);
		
		VBox box = new VBox();
		
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		Scene cena  = new Scene(box, 100, 150);
		
		primaryStage.setScene(cena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
