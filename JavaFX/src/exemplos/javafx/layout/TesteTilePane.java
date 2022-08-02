package exemplos.javafx.layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Orientation;
import javafx.scene.layout.TilePane;

public class TesteTilePane 
extends TilePane{
	public TesteTilePane() {
		List<Quadrado> quadrados =
				new ArrayList<>()
				;
		
		for(int i = 0; i < 10; i++) {
			int tamanho = i * 10;
			quadrados.add(
				new Quadrado(tamanho, tamanho) 
			);
		}
		
		setVgap(25);
		setOrientation(Orientation.VERTICAL);
		
		getChildren().addAll(quadrados);
	}
}
