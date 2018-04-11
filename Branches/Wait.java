package com.TheHandyMan.bots.jewleryEnchanter.Branches;

import com.TheHandyMan.bots.jewleryEnchanter.Leafes.Empty;
import com.TheHandyMan.bots.jewleryEnchanter.MainPackage.MainClass;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;


/**
 * Created by UgniusAdmin on 1/24/2017.
 */
public class Wait extends BranchTask {
    public MainClass bot;

    public Wait(MainClass bot){
        this.bot = bot;
    }

    @Override
    public boolean validate() {
        System.out.println(bot.price);
        return bot.guiWait;
    }

    @Override
    public TreeTask failureTask() {

        bot.updateInfo();
        return new Root(bot);
    }

    @Override
    public TreeTask successTask() {
        return new Empty();
    }
}
