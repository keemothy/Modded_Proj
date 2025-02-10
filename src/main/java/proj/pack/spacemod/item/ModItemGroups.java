package proj.pack.spacemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import proj.pack.spacemod.SpaceMod;

public class ModItemGroups {

    public static final ItemGroup SPACE_CRAFT_ITEMS_GROUP =
            Registry.register(Registries.ITEM_GROUP, Identifier.of(SpaceMod.MOD_ID, "space_craft_items"),
                    FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SPACE_HELMET))
                        .displayName(Text.translatable("itemgroup.space-mod.SpaceCraft"))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.SPACE_HELMET);
                        }).build());


    public static void registerItemGroups() {
        SpaceMod.LOGGER.info("Registering Item Groups for " + SpaceMod.MOD_ID);


    }
}
