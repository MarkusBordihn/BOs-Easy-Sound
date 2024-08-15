package de.markusbordihn.easysound;

import net.minecraftforge.eventbus.api.IEventBus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("unused")
public class EasySoundClient {

  private static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  @SuppressWarnings("java:S1118")
  public EasySoundClient(IEventBus modEventBus) {
    log.info("Initializing {} (Forge-Client) ...", Constants.MOD_NAME);
  }
}
