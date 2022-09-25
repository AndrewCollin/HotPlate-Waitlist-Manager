package com.hotplate.hotplate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public final class AlertBoxController {

    @FXML
    public VBox alertBoxVBox;

    @FXML
    public Label alertlabel;

    @FXML
    void alertBoxOkClick(ActionEvent event) {
        HotPlateApp.log.info("[Button] Clicked: " + event);
        AlertBox.stage.close();
    }


    @FXML
    public Label YesNoBoxLabel;

    @FXML
    boolean alertNoClick(ActionEvent event) {
        HotPlateApp.log.info("[Button] Clicked: " + event + "User's choice: No");
        YesNoBox.stage.close();
        YesNoBox.boxChoice = false;
        return false;
    }

    @FXML
    boolean alertYesClick(ActionEvent event) {
        HotPlateApp.log.info("[Button] Clicked: " + event + "User's choice: Yes");
        YesNoBox.boxChoice = true;
        YesNoBox.stage.close();
        return false;
    }

}



