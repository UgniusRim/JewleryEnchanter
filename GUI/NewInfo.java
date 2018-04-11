package com.TheHandyMan.bots.jewleryEnchanter.GUI;

/**
 * Created by UgniusAdmin on 1/20/2017.
 */
public class NewInfo {
    public int MAGIC_XP, XP_H, JEWLS_PH, GP_PH, GP_MADE,XP_TO_LVL;
    public double MAGIC_BAR;
            String STOP_W;

    public NewInfo(String STOP_W, int MAGIC_XP , double MAGIC_BAR, int XP_H, int JEWLS_PH, int GP_PH, int GP_MADE
    , int XP_TO_LVL){

        this.STOP_W = STOP_W;
        this.MAGIC_XP = MAGIC_XP;
        this.MAGIC_BAR = MAGIC_BAR;
        this.XP_H = XP_H;
        this.JEWLS_PH = JEWLS_PH;
        this.GP_PH = GP_PH;
        this.GP_MADE = GP_MADE;
        this.XP_TO_LVL = XP_TO_LVL;

    }

}
