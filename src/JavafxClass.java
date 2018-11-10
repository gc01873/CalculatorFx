import javafx.application.Application;
//Notice for the event look what we imported
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//Notice how we implemented the event handler interface
public class JavafxClass extends Application { //implements EventHandler<ActionEvent> {
	Button button;
	
	public static void main(String [] args) {
		launch(args);
		
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of the Window");
		button = new Button();
		button.setText("Click Me");
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("I am an anonymous inner class");
			}
			
		});
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	/*
	@Override
	//Event Driven Programming 
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==button){
			System.out.println("Ooooooooooo I love it!");
		}
		
	}
*/
	
	

}
