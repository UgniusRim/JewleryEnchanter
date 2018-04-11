package com.TheHandyMan.bots.jewleryEnchanter.Leafes;

import com.TheHandyMan.bots.jewleryEnchanter.MainPackage.MainClass;
import com.runemate.game.api.hybrid.Environment;
import com.runemate.game.api.hybrid.input.Mouse;
import com.runemate.game.api.hybrid.local.hud.interfaces.Inventory;
import com.runemate.game.api.hybrid.local.hud.interfaces.SpriteItem;
import com.runemate.game.api.osrs.local.hud.interfaces.Magic;
import com.runemate.game.api.script.Execution;
import com.runemate.game.api.script.framework.tree.LeafTask;

/**
 * Created by UgniusAdmin on 1/23/2017.
 */
public class EnchantRing extends LeafTask {
    public MainClass bot;

    public EnchantRing(MainClass bot) {
        this.bot = bot;
    }

    private SpriteItem ring;

    @Override
    public void execute() {
        int starS = Inventory.getItems(bot.targ).size();
        if(!Inventory.containsAnyOf("Cosmic rune")){
            Environment.getBot().stop();
        }
        System.out.println("0");
        ring = Inventory.newQuery().names(bot.targ).results().first();
            if(ring!=null && Magic.getSelected()==null){
                System.out.println("1");
                if(Magic.valueOf(bot.spell).activate()){
                    System.out.println("2");
                    Execution.delay(200,225);
                        if(ring.click()){
                            System.out.println("3");
                            Execution.delayUntil(() -> Inventory.getItems(bot.targ).size()<starS, 1000, 1200);
                        }
                }
            }
            else{
                System.out.println("5");
                if(ring!=null){
                    Mouse.click(ring, Mouse.Button.LEFT);
                }
                else{
                    Mouse.click(Inventory.getItemIn(1), Mouse.Button.LEFT);
                }

            }
            count(starS);

    }
    public void count(int starS){
        if(Inventory.getItems(bot.targ).size()<starS){
            System.out.println(starS+"----");
            bot.jewls++;
        }
    }
}


