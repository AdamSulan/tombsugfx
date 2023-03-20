package controllers;

import javafx.scene.control.Button;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModel mainModel;
    public MainController() {
        this.mainPanel=new MainPanel();
        this.mainModel=new MainModel();
        this.handleEvent();
    }
    public MainPanel getMainPanel(){
        return this.mainPanel;
    }
    public void handleEvent(){
        Button calcButton=this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> {
            double side=Double.parseDouble(this.mainPanel.getSidePanel().getValue());
            double alpha=Double.parseDouble(this.mainPanel.getAlphaPanel().getValue());
            double radius=this.mainModel.calcRadius(side, alpha);
            mainPanel.getRadiusPanel().setValue(String.valueOf(radius));
        });
    }
}
