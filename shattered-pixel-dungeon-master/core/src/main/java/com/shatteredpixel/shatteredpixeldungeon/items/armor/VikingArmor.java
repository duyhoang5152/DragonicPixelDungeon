package com.shatteredpixel.shatteredpixeldungeon.items.armor;
import com.shatteredpixel.shatteredpixeldungeon.Dungeon;
import com.shatteredpixel.shatteredpixeldungeon.actors.Actor;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Buff;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.FlavourBuff;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Fortify;
import com.shatteredpixel.shatteredpixeldungeon.actors.buffs.Roots;
import com.shatteredpixel.shatteredpixeldungeon.actors.mobs.Mob;
import com.shatteredpixel.shatteredpixeldungeon.items.Item;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.missiles.Shuriken;
import com.shatteredpixel.shatteredpixeldungeon.levels.Level;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.plants.Earthroot;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.sprites.MissileSprite;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.shatteredpixel.shatteredpixeldungeon.utils.GLog;
import com.watabou.utils.Callback;


import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by dhoang9775 on 11/17/2017.
 */

public class VikingArmor extends ClassArmor{ {
    image = ItemSpriteSheet.ARMOR_VIKING;
}

    private HashMap<Callback, Mob> targets = new HashMap<Callback, Mob>();

    @Override
    public void doSpecial() {

        if(curUser.buff(Fortify.class)!=null){
            Buff.prolong(curUser, Fortify.class, Fortify.DURATION);
        }
        else {
            Buff.affect(curUser, Fortify.class, Fortify.DURATION);
        }
        curUser.HP -= (curUser.HP / 3);

        curUser.spend( Actor.TICK );
        curUser.sprite.operate( curUser.pos );


    }

}
