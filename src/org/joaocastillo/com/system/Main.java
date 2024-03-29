package org.joaocastillo.com.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.joaocastillo.com.controller.Pantallas;
import org.joaocastillo.com.controller.ScreenController;
import org.joaocastillo.com.dao.ConnectionProducts;
import org.joaocastillo.com.view.components.BudgetComponent;
import org.joaocastillo.com.view.components.CompanyComponent;
import org.joaocastillo.com.view.components.DishTypeComponent;
import org.joaocastillo.com.view.components.ProductsComponent;

import static javafx.application.Application.launch;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = new ProductsComponent();
//        Parent root = FXMLLoader.load(this.getClass().getResource("../view/Pop-up.fxml"));
//        stage.initStyle(StageStyle.UNDECORATED);
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();

        ScreenController.getInstance().setStage(stage);
        ScreenController.getInstance().activate(Pantallas.EMPRESAS);
//
        stage.setResizable(true);
        stage.show();
    }
}
