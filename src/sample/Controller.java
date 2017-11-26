package sample;


import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;


public class Controller {

    public JFXTextField username;


    public JFXTextField password;

    public void login(ActionEvent actionEvent) {
        System.out.println(username.getText());
        System.out.println(password.getText());
        System.out.println("helo");
    }
}
