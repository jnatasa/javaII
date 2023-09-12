package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication  extends Application{

    private static void launch(Class<ButtonAndLabelApplication> aClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  public void start(Stage window) {

        Button buttonComponent = new Button("Button");

        Label textComponent = new Label("Text element");

        FlowPane componentGroup = new FlowPane();

        componentGroup.getChildren().add(buttonComponent);
        componentGroup.getChildren().add(textComponent);

        Scene view = new Scene(componentGroup);

        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(ButtonAndLabelApplication.class);
    }


   

}
