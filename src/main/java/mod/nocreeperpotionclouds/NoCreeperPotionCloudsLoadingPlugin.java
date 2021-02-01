package mod.nocreeperpotionclouds;

import net.minecraftforge.common.ForgeVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

import javax.annotation.Nullable;
import java.util.Map;

@IFMLLoadingPlugin.MCVersion(ForgeVersion.mcVersion)
@IFMLLoadingPlugin.SortingIndex(-69)
@IFMLLoadingPlugin.Name("No Creeper Potion Clouds; Loading Plugin")
public class NoCreeperPotionCloudsLoadingPlugin implements IFMLLoadingPlugin {

    public NoCreeperPotionCloudsLoadingPlugin() {
        MixinBootstrap.init();
        Mixins.addConfiguration("mixins.nocreeperpotionclouds.json");
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[0];
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Nullable
    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> map) { }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
