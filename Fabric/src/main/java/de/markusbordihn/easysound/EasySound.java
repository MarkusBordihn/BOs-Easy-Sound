package de.markusbordihn.easysound;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EasySound implements ModInitializer {

  protected static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  @Override
  public void onInitialize() {
    log.info("Initializing {} (Fabric) ...", Constants.MOD_NAME);
  }
}
