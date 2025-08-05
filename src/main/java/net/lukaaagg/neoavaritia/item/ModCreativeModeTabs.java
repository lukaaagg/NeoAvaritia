package net.lukaaagg.neoavaritia.item;

import net.lukaaagg.neoavaritia.NeoAvaritia;
import net.lukaaagg.neoavaritia.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NeoAvaritia.MOD_ID);

    public static final Supplier<CreativeModeTab> NEOAVARITIA = CREATIVE_MODE_TAB.register("neoavaritia_tab", () -> CreativeModeTab.builder()
            .icon(() -> new ItemStack(ModBlocks.NEUTRONIUM_BLOCK.get()))
            .title(Component.translatable("creativetab.neoavaritia.neoavaritia_tab")) // Corrigi o caminho da tradução para um padrão mais comum
            .displayItems(((itemDisplayParameters, output) -> {
                // Adicionando Itens e Blocos à Aba
                output.accept(ModItems.INFINITY_SWORD.get());
                output.accept(ModItems.NEUTRONIUM_INGOT.get());
                output.accept(ModItems.NEUTRON_NUGGET.get());
                output.accept(ModItems.NEUTRON_PILE.get());

                // Adicionando Blocos
                output.accept(ModBlocks.NEUTRONIUM_BLOCK.get());

            }))
            .build());


    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}