package com.TheHandyMan.bots.jewleryEnchanter.Branches;

import com.TheHandyMan.bots.jewleryEnchanter.Leafes.Banking;
import com.TheHandyMan.bots.jewleryEnchanter.Leafes.EnchantRing;
import com.TheHandyMan.bots.jewleryEnchanter.MainPackage.MainClass;
import com.runemate.game.api.hybrid.input.Mouse;
import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.script.framework.tree.BranchTask;
import com.runemate.game.api.script.framework.tree.TreeTask;


/**
 * Created by UgniusAdmin on 1/23/2017.
 */
public class Root extends BranchTask {
    private MainClass bot;

    public Root(MainClass bot){
        this.bot = bot;
    }

    @Override
    public boolean validate() {
        System.out.println(Mouse.getSpeedMultiplier());
        return Inventory.containsAnyOf(bot.targ) && Bank.isOpen() == false;
    }

    @Override
    public TreeTask successTask() {
        System.out.println("Enchanting");
        return new EnchantRing(bot);
    }

    @Override
    public TreeTask failureTask() {
        System.out.println("Banking");
        return new Banking(bot);
    }
}
