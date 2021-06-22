package main.java.customizablebackpacks.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.fml.common.Mod;

@Mod(CustomizableBackpacks.MODID)
public class CustomizableBackpacks {
    public static final String MODID = "customizablebackpacks";
    public static final String MOD_NAME = "Customizable Backpacks";
    public static final String LOG_TAG = '[' + MOD_NAME + ']';

    // Customizable Backpacks Logger
    public static final Logger logger = LogManager.getLogger(MOD_NAME);
}
