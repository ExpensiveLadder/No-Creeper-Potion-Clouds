package mod.nocreeperpotionclouds;

import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = NoCreeperPotionClouds.MOD_ID,
        name = NoCreeperPotionClouds.MOD_NAME,
        version = NoCreeperPotionClouds.VERSION
)
public class NoCreeperPotionClouds {

    public static final String MOD_ID = "nocreeperpotionclouds";
    public static final String MOD_NAME = "No Creeper Potion Clouds";
    public static final String VERSION = "1.0";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static NoCreeperPotionClouds INSTANCE;
}
