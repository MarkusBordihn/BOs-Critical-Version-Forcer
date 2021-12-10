package de.markusbordihn.criticalversionenforcer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fmllegacy.network.FMLNetworkConstants;

@Mod(Constants.MOD_ID)
public class CriticalVersionEnforcer {

  public static final Logger log = LogManager.getLogger(Constants.LOG_NAME);

  public CriticalVersionEnforcer() {
    // Make sure the mod being absent on the other network side does not cause the
    // client to display the server as incompatible
    ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class,
        () -> new IExtensionPoint.DisplayTest(() -> FMLNetworkConstants.IGNORESERVERONLY,
            (a, b) -> true));

    log.info("Thanks for using critical version enforcer ...");
  }
}
