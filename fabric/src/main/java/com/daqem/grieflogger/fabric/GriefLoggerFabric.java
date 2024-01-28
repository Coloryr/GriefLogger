package com.daqem.grieflogger.fabric;

import com.daqem.grieflogger.GriefLogger;
import com.daqem.grieflogger.command.argument.FilterArgument;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.ArgumentTypeRegistry;
import net.minecraft.commands.synchronization.SingletonArgumentInfo;

public class GriefLoggerFabric implements DedicatedServerModInitializer {

    @Override
    public void onInitializeServer() {
        GriefLogger.init();
        registerCommandArgumentTypes();
    }

    private void registerCommandArgumentTypes() {
        ArgumentTypeRegistry.registerArgumentType(GriefLogger.getId("filter"), FilterArgument.class, SingletonArgumentInfo.contextFree(FilterArgument::filter));
    }
}
