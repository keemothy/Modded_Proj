package proj.pack.spacemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import proj.pack.spacemod.SpaceMod;

public class ModItems {

    public static final Item SPACE_HELMET = registerItem("space_helmet", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SpaceMod.MOD_ID, name), item);
    }

    public static void registerModItems() {

        SpaceMod.LOGGER.info("Registering Mod Items for " + SpaceMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(SPACE_HELMET);
        });
    }

}
