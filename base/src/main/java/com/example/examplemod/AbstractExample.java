package com.example.examplemod;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;

public abstract class AbstractExample<T extends AbstractContainerMenu> extends AbstractContainerScreen<T> {
    public AbstractExample(T p_97741_, Inventory p_97742_, Component p_97743_) {
        super(p_97741_, p_97742_, p_97743_);
    }

    // The problematic method. This gets remapped when building base, then the other module project cannot find renderBg
    @Override
    protected void renderBg(PoseStack p_97787_, float p_97788_, int p_97789_, int p_97790_) {
        // Would do stuff.
    }
}