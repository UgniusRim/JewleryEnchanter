package com.TheHandyMan.bots.jewleryEnchanter.GUI;


import com.TheHandyMan.bots.jewleryEnchanter.MainPackage.MainClass;
import com.runemate.game.api.hybrid.util.Resources;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by UgniusAdmin on 1/20/2017.
 */
public class NewInfoUI extends Accordion implements Initializable {
   private MainClass bot;
    @FXML
    private Label MAGIC_XP ,STOP_W, XP_H, JEWLS_PH, XP_TO_LVL;

    @FXML
    private Label GOLD_MADE;

    @FXML
    private Label GOLD_PH;

    @FXML
    private ProgressBar MAGIC_BAR;

    @FXML
    private LineChart<?, ?> GOLD_CHART;

    @FXML
    private CategoryAxis X_AXIS;

    @FXML
    private NumberAxis Y_AXIS;


    public NewInfoUI(MainClass bot) {
        this.bot = bot;
        FXMLLoader loader = new FXMLLoader();
        Future<InputStream> stream = bot.getPlatform().invokeLater(() -> Resources.getAsStream("com/TheHandyMan/bots/jewleryEnchanter/GUI/NewInfo.fxml"));
        loader.setController(this);
        loader.setRoot(this);

        try {
            loader.load(stream.get());
        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setVisible(true);
    }
    public void update() {
        try {
            NewInfo i = bot.newInfo;
            MAGIC_XP.textProperty().set(""+ i.MAGIC_XP);
            MAGIC_BAR.setProgress(i.MAGIC_BAR);
            STOP_W.textProperty().set(i.STOP_W);
            XP_H.textProperty().set(""+i.XP_H);
            JEWLS_PH.textProperty().set(""+i.JEWLS_PH);
            GOLD_PH.textProperty().set(""+i.GP_PH);
            GOLD_MADE.textProperty().set(""+i.GP_MADE);
            XP_TO_LVL.textProperty().set(""+i.XP_TO_LVL);

            Y_AXIS = new NumberAxis("Time", 1, bot.stopWatch.getRuntime(), 1);
           // new XYChart.Data<Double,Double>(0.0, 1.0);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
