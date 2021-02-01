package mod.nocreeperpotionclouds.mixins;

import net.minecraft.entity.monster.EntityCreeper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.annotation.Nonnull;

@Mixin(EntityCreeper.class)
public abstract class MixinEntityCreeper {

    @Inject(method = "spawnLingeringCloud()V", at = @At("HEAD"), cancellable = true)
    private void spawnLingeringCloud(@Nonnull CallbackInfo ci) {
        ci.cancel();
    }
}
