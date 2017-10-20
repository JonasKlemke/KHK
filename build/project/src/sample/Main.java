package sample;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	 	private BorderPane rootLayout;
	    private Scene scene;
	    private Stage primaryStage;

	    @Override
	    public void start(Stage primaryStage) throws Exception{
	        FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(Main.class.getResource("sample.fxml"));
	        rootLayout = (BorderPane) loader.load();
	        scene = new Scene(rootLayout);
	        primaryStage.setScene(scene);
	        primaryStage.setTitle("KHK Survey");
	        Controller controller = loader.getController();
	        primaryStage.show();
	    }


	    public static void main(String[] args) {
	        launch(args);
	    }
}
