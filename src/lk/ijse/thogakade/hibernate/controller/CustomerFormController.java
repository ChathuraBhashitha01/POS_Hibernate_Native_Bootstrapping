package lk.ijse.thogakade.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerFormController {

    public ImageView btnCustomer;
    public ImageView btnItem;
    public ImageView btnOrder;
    public TextField txtCustomerID;
    public TextField txtCustomerName;
    public TextField txtAddress;
    public Button btnSave;
    public Button btnUpdate;
    public Button btnDelete;
    public AnchorPane root;

    public void btnCustomerOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/thogakade/hibernate/view/customer_form.fxml"))));
        stage.setTitle("Customer Form");
        stage.centerOnScreen();
        stage.show();

    }

    public void btnItemOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/thogakade/hibernate/view/item_form.fxml"))));
        stage.setTitle("Item Form");
        stage.centerOnScreen();
        stage.show();


    }

    public void btnOrderOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/lk/ijse/thogakade/hibernate/view/order_form.fxml"))));
        stage.setTitle("Order Form");
        stage.centerOnScreen();
        stage.show();


    }

    public void btnSaveOnAction(ActionEvent actionEvent) {

    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {

    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {

    }
}
