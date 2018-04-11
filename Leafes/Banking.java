package com.TheHandyMan.bots.jewleryEnchanter.Leafes;

import com.TheHandyMan.bots.jewleryEnchanter.MainPackage.MainClass;
import com.runemate.game.api.hybrid.Environment;
import com.runemate.game.api.hybrid.input.Mouse;
import com.runemate.game.api.hybrid.local.hud.interfaces.Bank;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.osrs.local.hud.interfaces.Magic;
import com.runemate.game.api.script.Execution;
import com.runemate.game.api.script.framework.tree.LeafTask;


/**
 * Created by UgniusAdmin on 1/23/2017.
 */
public class Banking extends LeafTask {
    public MainClass bot;
    public Banking(MainClass bot) {
        this.bot = bot;
    }

    @Override
    public void execute() {
        if(Magic.getSelected()!=null){
            Mouse.click(Mouse.Button.LEFT);
        }
        Mouse.setSpeedMultiplier(35);
            if(Bank.open()){
                if(Bank.isOpen()){
                    if(!Bank.containsAnyOf(bot.targ)){
                        Environment.getBot().stop();
                    }
                    if(Bank.depositAllExcept("Cosmic rune")){
                        Execution.delayUntil(()-> Inventory.containsOnly("Cosmic rune"),1000);
                        if(Bank.withdraw(bot.targ,27)){
                            Execution.delayUntil(()-> Inventory.containsAnyOf(bot.targ), 1000, 1222);
                            Bank.close();
                            if(Inventory.containsAnyOf(bot.targ)){
                                if(Bank.close()){
                                   Execution.delayUntil(()-> !Bank.isOpen(), 1000,2000);
                                   Mouse.setSpeedMultiplier(10);
                                }
                            }
                        }
                    }
                }
                else if (Inventory.containsAnyOf(bot.targ)){
                    Bank.close();
                }
            }
        }


}


