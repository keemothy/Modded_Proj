package proj.pack.spacemod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import proj.pack.spacemod.item.ModItemGroups;
import proj.pack.spacemod.item.ModItems;

public class SpaceMod implements ModInitializer {
	public static final String MOD_ID = "space-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
	}


}