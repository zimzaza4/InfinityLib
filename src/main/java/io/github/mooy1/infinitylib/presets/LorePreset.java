package io.github.mooy1.infinitylib.presets;

import java.text.DecimalFormat;
import javax.annotation.Nonnull;
import lombok.experimental.UtilityClass;

import io.github.thebusybiscuit.slimefun4.implementation.SlimefunPlugin;

/**
 * Collection of utils for building item lore
 *
 * @author Mooy1
 * 
 */
@UtilityClass
public final class LorePreset {

    private static final DecimalFormat FORMAT = new DecimalFormat("###,###,###,###,###,###.#");
    private static final int TPS = 20 / SlimefunPlugin.getTickerTask().getTickRate();
    
    @Nonnull
    public static String energyPerSecond(int energy) {
        return "&8\u21E8 &e\u26A1 &7" + format(energy * TPS) + " J/s";
    }
    
    @Nonnull
    public static String energyBuffer(int energy) {
        return "&8\u21E8 &e\u26A1 &7" + format(energy) + " J 可储存";
    }

    @Nonnull
    public static String energy(int energy) {
        return "&8\u21E8 &e\u26A1 &7" + format(energy) + " J ";
    }

    @Nonnull
    public static String speed(int speed) {
        return "&8\u21E8 &b\u26A1 &7Speed: &b" + speed + 'x';
    }

    @Nonnull
    public static String format(double number) {
        return FORMAT.format(number);
    }
    
}
