package org.template;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = TemplateMod.MODID, name = TemplateMod.MODNAME, version = TemplateMod.VERSION)
public class TemplateMod {
    public static final String MODID = "@MODID@";
    public static final String MODNAME = "@MODNAME";
    public static final String VERSION = "@VERSION@";

    @Mod.Instance
    public static TemplateMod INSTANCE;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("TEMPLATE MOD");
    }
}