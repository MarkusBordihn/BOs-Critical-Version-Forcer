package de.markusbordihn.criticalversionenforcer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class CriticalVersionEnforcer {

  public static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  public CriticalVersionEnforcer() {
    log.info("Thanks for using critical version enforcer ...");
  }
}
