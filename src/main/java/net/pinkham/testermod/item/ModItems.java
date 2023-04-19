package net.pinkham.testermod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pinkham.testermod.TesterMod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TesterMod.MOD_ID);

    public static final RegistryObject<Item> FAKE_IRON = ITEMS.register("fake_iron", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INVIS_IRON = ITEMS.register("invis_iron", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
