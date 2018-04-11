package com.TheHandyMan.bots.jewleryEnchanter.MainPackage;


import com.TheHandyMan.bots.jewleryEnchanter.Branches.Wait;
import com.TheHandyMan.bots.jewleryEnchanter.GUI.FXGui;
import com.TheHandyMan.bots.jewleryEnchanter.GUI.NewInfo;
import com.TheHandyMan.bots.jewleryEnchanter.GUI.NewInfoUI;
import com.runemate.game.api.client.embeddable.EmbeddableUI;
import com.runemate.game.api.hybrid.input.Mouse;
import com.runemate.game.api.hybrid.local.Skill;
import com.runemate.game.api.hybrid.util.StopWatch;
import com.runemate.game.api.hybrid.util.calculations.CommonMath;
import com.runemate.game.api.script.framework.tree.TreeBot;
import com.runemate.game.api.script.framework.tree.TreeTask;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Node;

import java.util.EventListener;
import java.util.concurrent.TimeUnit;

/**
 * Created by UgniusAdmin on 1/23/2017.
 */
public class MainClass extends TreeBot implements EventListener, EmbeddableUI {
    private SimpleObjectProperty<Node> botInterfaceProperty;
    private FXGui configUI;
    private NewInfoUI newInfoUI;
    public NewInfo newInfo;
    public StopWatch stopWatch = new StopWatch();
    public boolean guiWait;
    public double MagP;
    public int expStartMag , expMag, sum, jewls, price=0, cosmics=0;
    public String targ;
    public String spell;

    public MainClass(){
        guiWait = true;
        setEmbeddableUI(this);
        startEXP();
    }

    @Override
    public TreeTask createRootTask() {
        return new Wait(this);
    }

    @Override
    public void onStart(String... args) {
            jewls = 0;
            setLoopDelay(200,250);
            getEventDispatcher().addListener(this);
            Mouse.setSpeedMultiplier(10);
    }

    @Override
    public ObjectProperty<? extends Node> botInterfaceProperty() {
        if (botInterfaceProperty == null) {
            botInterfaceProperty = new SimpleObjectProperty<>(configUI = new FXGui(this));
            newInfoUI = new NewInfoUI(this);
        }
        return botInterfaceProperty;
    }
    public void setToInfoProperty() {
        botInterfaceProperty.set(newInfoUI);
    }
    public void updateInfo() {
        try {
            CurrExp();
            progressBarValues();
            newInfo = new NewInfo(stopWatch.getRuntimeAsString(), expMag -expStartMag, MagP,(int) CommonMath.rate(TimeUnit.HOURS, stopWatch.getRuntime(), sum),
                    (int) CommonMath.rate(TimeUnit.HOURS, stopWatch.getRuntime(), jewls),
                    ((int) CommonMath.rate(TimeUnit.HOURS, stopWatch.getRuntime(), jewls)*price),
                    jewls*price, Skill.MAGIC.getExperienceToNextLevel());

        } catch (Exception e) {
            e.printStackTrace();
        }
        Platform.runLater(() -> newInfoUI.update());

    }
    public void progressBarValues(){
        MagP = (double)((Skill.MAGIC.getExperienceToNextLevelAsPercent()-100)*-1)/100;
    }
    public void startEXP(){
        expStartMag = Skill.MAGIC.getExperience();
    }
    public void CurrExp(){
        expMag= Skill.MAGIC.getExperience();
        sum= (expMag-expStartMag);
    }
}
