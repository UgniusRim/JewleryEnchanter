package com.TheHandyMan.bots.jewleryEnchanter.GUI;


import com.TheHandyMan.bots.jewleryEnchanter.MainPackage.MainClass;
import com.runemate.game.api.osrs.local.hud.interfaces.Magic;
import com.runemate.game.api.osrs.net.OSBuddyExchange;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by UgniusAdmin on 1/16/2017.
 */
public class Controller implements Initializable {
    private MainClass bot;
    @FXML
    private ComboBox Location_ComboBox;

    @FXML
    private Button Start_BT;

    public Controller(MainClass bot) {
        this.bot = bot;
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Location_ComboBox.getItems().addAll("Opal ring","Opal necklace", "Opal bracelet", "Opal amulet",
                "Jade ring", "Jade necklace", "Jade bracelet", "Jade amulet",
                "Topaz ring", "Topaz necklace", "Topaz bracelet", "Topaz amulet",
                "Sapphire ring", "Sapphire necklace", "Sapphire bracelet", "Sapphire amulet",
                "Emerald ring", "Emerald necklace", "Emerald bracelet", "Emerald amulet",
                "Ruby ring", "Ruby necklace", "Ruby bracelet", "Ruby amulet",
                "Diamond ring", "Diamond necklace", "Diamond bracelet", "Diamond amulet",
                "Dragonstone ring", "Dragonstone necklace", "Dragonstone bracelet", "Dragonstone amulet");

        Start_BT.setOnAction(getStart_BTAction());

        Location_ComboBox.setOnAction(getLocation_ComboBoxEvent());
    }

    public EventHandler<ActionEvent> getStart_BTAction() {
        return event -> {
            try {
                // Initialize all variables in your bot
                bot.guiWait = false;

                switch (Location_ComboBox.getSelectionModel().getSelectedItem().toString()) {

                    case "Opal ring":
                        bot.targ= "Opal ring";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_1_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21126).getBuying()-bot.cosmics
                        -OSBuddyExchange.getGuidePrice(21081).getBuying();
                        break;

                    case "Opal necklace":
                        bot.targ= "Opal necklace";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_1_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21143).getBuying()-bot.cosmics
                        -OSBuddyExchange.getGuidePrice(21090).getBuying();
                        break;

                    case "Opal bracelet":
                        bot.targ= "Opal bracelet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_1_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21177).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21117).getBuying();
                        break;

                    case "Opal amulet":
                        bot.targ= "Opal amulet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_1_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21160).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21108).getBuying();
                        break;

                    case "Jade ring":
                        bot.targ= "Jade ring";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_2_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21129).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21084).getBuying();
                        break;

                    case "Jade necklace":
                        bot.targ= "Jade necklace";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_2_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21146).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21093).getBuying();
                        break;

                    case "Jade bracelet":
                        bot.targ= "Jade bracelet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_2_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21180).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21120).getBuying();
                        break;

                    case "Jade amulet":
                        bot.targ= "Jade amulet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_2_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21163).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21111).getBuying();
                        break;

                    case "Topaz ring":
                        bot.targ= "Topaz ring";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_3_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21140).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21087).getBuying();
                        break;

                    case "Topaz necklace":
                        bot.targ= "Topaz necklace";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_3_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21157).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21096).getBuying();
                        break;

                    case "Topaz bracelet":
                        bot.targ= "Topaz bracelet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_3_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21183).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21123).getBuying();
                        break;

                    case "Topaz amulet":
                        bot.targ= "Topaz amulet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_3_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(21166).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(21114).getBuying();
                        break;

                    case "Sapphire ring":
                        bot.targ= "Sapphire ring";
                        bot.spell = Magic.LVL_1_ENCHANT.name();
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.price = OSBuddyExchange.getGuidePrice(2550).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1637).getBuying();
                        break;

                    case "Sapphire necklace":
                        bot.targ= "Sapphire necklace";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_1_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(3853).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1656).getBuying();
                        break;

                    case "Sapphire bracelet":
                        bot.targ= "Sapphire bracelet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_1_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(11074).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(11072).getBuying();
                        break;

                    case "Sapphire amulet":
                        bot.targ= "Sapphire amulet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_1_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(1727).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1694).getBuying();
                        break;

                    case "Emerald ring":
                        bot.targ= "Emerald ring";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_2_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(2552).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1639).getBuying();
                        break;

                    case "Emerald necklace":
                        bot.targ= "Emerald necklace";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_2_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(5521).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1658).getBuying();
                        break;

                    case "Emerald bracelet":
                        bot.targ= "Emerald bracelet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_2_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(11079).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(11076).getBuying();
                        break;

                    case "Emerald amulet":
                        bot.targ= "Emerald amulet";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_2_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(1729).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1696).getBuying();
                        break;

                    case "Ruby ring":
                        bot.targ= "Ruby ring";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_3_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(2568).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1641).getBuying();
                        break;

                    case "Ruby necklace":
                        bot.targ= "Ruby necklace";
                        bot.spell = Magic.LVL_3_ENCHANT.name();
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.price = 0-bot.cosmics;
                        break;

                    case "Ruby bracelet":
                        bot.targ= "Ruby bracelet";
                        bot.spell = Magic.LVL_3_ENCHANT.name();
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.price = OSBuddyExchange.getGuidePrice(11088).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(11085).getBuying();
                        break;

                    case "Ruby amulet":
                        bot.targ= "Ruby amulet";
                        bot.spell = Magic.LVL_3_ENCHANT.name();
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.price = OSBuddyExchange.getGuidePrice(1725).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1698).getBuying();
                        break;
                    case "Diamond ring":
                        bot.targ= "Diamond ring";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_4_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(2570).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1643).getBuying();
                        break;

                    case "Diamond necklace":
                        bot.targ= "Diamond necklace";
                        bot.spell = Magic.LVL_4_ENCHANT.name();
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.price =  OSBuddyExchange.getGuidePrice(11090).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1662).getBuying();
                        break;

                    case "Diamond bracelet":
                        bot.targ= "Diamond bracelet";
                        bot.spell = Magic.LVL_4_ENCHANT.name();
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.price = OSBuddyExchange.getGuidePrice(11095).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(11092).getBuying();
                        break;

                    case "Diamond amulet":
                        bot.targ= "Diamond amulet";
                        bot.spell = Magic.LVL_4_ENCHANT.name();
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.price = OSBuddyExchange.getGuidePrice(1731).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1700).getBuying();
                        break;
                    case "Dragonstone ring":
                        bot.targ= "Dragonstone ring";
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.spell = Magic.LVL_5_ENCHANT.name();
                        bot.price = OSBuddyExchange.getGuidePrice(2572).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1645).getBuying();
                        break;

                    case "Dragonstone bracelet":
                        bot.targ= "Dragonstone bracelet";
                        bot.spell = Magic.LVL_5_ENCHANT.name();
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.price = OSBuddyExchange.getGuidePrice(11088).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(11085).getBuying();
                        break;

                    case "Dragonstone amulet":
                        bot.targ= "Dragonstone amulet";
                        bot.spell = Magic.LVL_5_ENCHANT.name();
                        bot.cosmics = OSBuddyExchange.getGuidePrice(564).getBuying();
                        bot.price = OSBuddyExchange.getGuidePrice(1704).getBuying()-bot.cosmics
                                -OSBuddyExchange.getGuidePrice(1702).getBuying();
                        break;

                }

                Platform.runLater(() -> bot.setToInfoProperty());
                bot.stopWatch.start();

            } catch (Exception e) {
                e.printStackTrace();
            }

        };
    }
    public EventHandler<ActionEvent> getLocation_ComboBoxEvent() {
        return event -> {
            if (Location_ComboBox.getSelectionModel().getSelectedItem() != null)
                Start_BT.setDisable(false);
            else
                Start_BT.setDisable(true);
        };
    }
}
