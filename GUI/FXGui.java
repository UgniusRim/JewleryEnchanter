package com.TheHandyMan.bots.jewleryEnchanter.GUI;

import com.TheHandyMan.bots.jewleryEnchanter.MainPackage.MainClass;
import com.runemate.game.api.hybrid.util.Resources;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by UgniusAdmin on 1/16/2017.
 */
public class FXGui extends GridPane implements Initializable {

    public FXGui(MainClass bot){
        FXMLLoader loader = new FXMLLoader();
        Future<InputStream> stream = bot.getPlatform().invokeLater(() -> Resources.getAsStream("com/TheHandyMan/bots/jewleryEnchanter/GUI/GUI.fxml"));
        loader.setController(new Controller(bot));

        loader.setRoot(this);

        try {
            loader.load(stream.get());
        } catch (IOException | InterruptedException | ExecutionException e) {
            System.err.println("Error loading GUI");
            e.printStackTrace();
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    setVisible(true);
    }
}
