package com.calebalex.cosc3project;

import com.calebalex.cosc3project.datagen.ModBlockTagsProvider;
import com.calebalex.cosc3project.datagen.ModModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

//The mod should, theoretically, never run any of this code. This code is for use
//in our development environment to systematically generate repetitive pieces of
//code that the mod WILL use
@EventBusSubscriber(modid = cosc3project.MODID)
public class PrimDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getWorldLookupProvider();

        //Run the json generator
        generator.addProvider(true, new ModModelProvider(packOutput));
        generator.addProvider(true, new ModBlockTagsProvider(packOutput, lookupProvider));
    }
}
