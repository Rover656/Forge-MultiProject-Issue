package com.example.examplemodtwo;

import com.example.examplemod.AbstractExample;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ChestMenu;

// The concrete implementation for example
// This errors as "renderBg" is not overridden and ConcreteExample is not abstract, even though it is done in AbstractExample
public class ConcreteExample extends AbstractExample<ChestMenu> {
    public ConcreteExample(ChestMenu p_97741_, Inventory p_97742_, Component p_97743_) {
        super(p_97741_, p_97742_, p_97743_);
    }
}
