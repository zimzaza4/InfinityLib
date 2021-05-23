package io.github.mooy1.infinitylib.presets;

import lombok.experimental.UtilityClass;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;

@UtilityClass
public final class MenuPreset {
    
    public static final ItemStack BACKGROUND = ChestMenuUtils.getBackground();
    public static final ItemStack INVALID_INPUT = new CustomItem(
            Material.BARRIER, "&c无效输入!"
    );
    public static final ItemStack NO_INPUT = new CustomItem(
            Material.BLUE_STAINED_GLASS_PANE, "&9放入物品"
    );
    public static final ItemStack INVALID_RECIPE = new CustomItem(
            Material.BARRIER, "&c无效的配方!"
    );
    public static final ItemStack NO_ENERGY = new CustomItem(
            Material.RED_STAINED_GLASS_PANE, "&c 能量不足!"
    );
    public static final ItemStack NO_ROOM = new CustomItem(
            Material.ORANGE_STAINED_GLASS_PANE, "&6 没有足够的空间!"
    );
    public static final ItemStack INPUT_ITEM = new CustomItem(
            Material.BLUE_STAINED_GLASS_PANE, "&9输入"
    );
    public static final ItemStack STATUS_ITEM = new CustomItem(
            Material.CYAN_STAINED_GLASS_PANE, "&3状态"
    );
    public static final ItemStack OUTPUT_ITEM = new CustomItem(
            Material.ORANGE_STAINED_GLASS_PANE, "&6输出"
    );
    public static final ItemStack NO_NETWORK = new CustomItem(
            Material.RED_STAINED_GLASS_PANE, "&c请连接一个能源网络!"
    );
    public static final ItemStack LOADING = new CustomItem(
            Material.RED_STAINED_GLASS_PANE, "&c加载中..."
    );

    public static final int INPUT = 10;
    public static final int[] INPUT_BORDER = {
            0, 1, 2, 9, 11, 18, 19, 20
    };
    public static final int STATUS = 13;
    public static final int[] STATUS_BORDER = {
            3, 4, 5, 12, 14, 21, 22, 23
    };
    public static final int OUTPUT = 16;
    public static final int[] OUTPUT_BORDER = {
            6, 7, 8, 15, 17, 24, 25, 26
    };
    public static final int[] CRAFTING_INPUT = {
            10, 11, 12, 19, 20, 21, 28, 29, 30
    };
    public static final int[] CRAFTING_INPUT_BORDER = {
            0, 1, 2, 3, 4, 9, 13, 18, 22, 27, 31, 36, 37, 38, 39, 40
    };
    public static final int CRAFTING_OUTPUT = 25;
    public static final int[] CRAFTING_OUTPUT_BORDER = {
            24, 26, 15, 16, 17, 33, 34, 35
    };
    public static final int[] CRAFTING_BACKGROUND = {
            5, 6, 7, 14, 8, 23, 41, 42, 43, 44, 32
    };

}
