package dev.errante;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Errante implements ModInitializer {
    public static final String MOD_ID = "errante";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Errante cargado. Tu hogar, donde te lleve el camino.");
    }
}
