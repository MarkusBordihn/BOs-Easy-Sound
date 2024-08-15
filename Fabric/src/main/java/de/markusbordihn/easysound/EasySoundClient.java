package de.markusbordihn.easysound;

import net.fabricmc.api.ClientModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EasySoundClient implements ClientModInitializer {

  private static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  @Override
  public void onInitializeClient() {
    log.info("Initializing {} (Fabric-Client) ...", Constants.MOD_NAME);
  }
}
