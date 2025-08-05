package net.lukaaagg.neoavaritia.item;

import net.lukaaagg.neoavaritia.NeoAvaritia;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(NeoAvaritia.MOD_ID);

    public static final DeferredItem<Item> NEUTRONIUM_INGOT = ITEMS.register("neutronium_ingot", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NEUTRON_NUGGET = ITEMS.register("neutron_nugget", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NEUTRON_PILE = ITEMS.register("neutron_pile", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> INFINITY_SWORD = ITEMS.register("infinity_sword", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
