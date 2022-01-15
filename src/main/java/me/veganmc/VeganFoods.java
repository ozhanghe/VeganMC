package me.veganmc;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class VeganFoods
{
    public static boolean isVegan(ItemStack food)
    {
        boolean item = false;

        if(food.is(Items.APPLE))
        {
            item = true;
        }
        else if(food.is(Items.MUSHROOM_STEW))
        {
            item = true;
        }
        else if(food.is(Items.BREAD))
        {
            item = true;
        }
        else if(food.is(Items.GOLDEN_APPLE))
        {
            item = true;
        }
        else if(food.is(Items.ENCHANTED_GOLDEN_APPLE))
        {
            item = true;
        }
        else if(food.is(Items.COOKIE))
        {
            item = true;
        }
        else if(food.is(Items.MELON_SLICE))
        {
            item = true;
        }
        else if(food.is(Items.DRIED_KELP))
        {
            item = true;
        }
        else if(food.is(Items.CARROT))
        {
            item = true;
        }
        else if(food.is(Items.POTATO))
        {
            item = true;
        }
        else if(food.is(Items.BAKED_POTATO))
        {
            item = true;
        }
        else if(food.is(Items.POISONOUS_POTATO))
        {
            item = true;
        }
        else if(food.is(Items.BEETROOT))
        {
            item = true;
        }
        else if(food.is(Items.BEETROOT_SOUP))
        {
            item = true;
        }
        else if(food.is(Items.SWEET_BERRIES))
        {
            item = true;
        }
        else if(food.is(Items.GLOW_BERRIES))
        {
            item = true;
        }
        else if(food.is(Items.SUSPICIOUS_STEW))
        {
            item = true;
        }
        else if(food.is(Items.GOLDEN_CARROT))
        {
            item = true;
        }

        return item;
    }
}
