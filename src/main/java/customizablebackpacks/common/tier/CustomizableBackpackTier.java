package main.java.customizablebackpacks.common.tier;

import mekanism.api.tier.ITier;
import mekanism.api.tier.BaseTier;
import mekanism.api.math.FloatingLong;
import mekanism.common.config.value.CachedFloatingLongValue;

public enum CustomizableBackpackTier implements ITier 
{
    BASIC(BaseTier.BASIC, FloatingLong.createConst(16384L)),
    ADVANCED(BaseTier.ADVANCED, FloatingLong.createConst(32768L)),
    ELITE(BaseTier.ELITE, FloatingLong.createConst(65536L)),
    ULTIMATE(BaseTier.ULTIMATE, FloatingLong.createConst(131072L));

    private final FloatingLong baseMaxEnergy;
    private final BaseTier baseTier;
    private CachedFloatingLongValue storageReference;

    CustomizableBackpackTier (BaseTier tier, FloatingLong max) 
    {
        this.baseMaxEnergy = max;
        this.baseTier = tier;
    }

    @Override
    public BaseTier getBaseTier() {
        return baseTier;
    }

    public FloatingLong getMaxEnergy() {
        return storageReference == null ? getBaseMaxEnergy() : storageReference.get();
    }

    public FloatingLong getBaseMaxEnergy() {
        return baseMaxEnergy;
    }

    /**
     * ONLY CALL THIS FROM TierConfig. It is used to give the Tier a reference to the actual config value object
     */
    public void setConfigReference(CachedFloatingLongValue storageReference) {
        this.storageReference = storageReference;
    }
}
