package com.calebalex.cosc3project.datagen;

import com.calebalex.cosc3project.block.ModBlocks;
import com.calebalex.cosc3project.cosc3project;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, cosc3project.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.getRK(ModBlocks.AZURITE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.RAW_AZURITE_BLOCK.get()))
                .add(ModBlocks.getRK(ModBlocks.AZURITE_ORE.get()))
                .add(ModBlocks.getRK(ModBlocks.AZURITE_DEEPSLATE_ORE.get()));

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.getRK(ModBlocks.AZURITE_DEEPSLATE_ORE.get()));

        //tag(BlockTags.NEEDS_DIAMOND_TOOL)
        //        .add(ModBlocks.getRK(ModBlocks.AZURITE_NETHER_ORE.get()));

        //tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
        //        .add(ModBlocks.getRK(ModBlocks.AZURITE_END_BLOCK.get()));
    }
}
