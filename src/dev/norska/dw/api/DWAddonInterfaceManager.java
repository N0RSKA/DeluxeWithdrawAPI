package dev.norska.dw.api;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

public class DWAddonInterfaceManager {
	
	@Getter private final Map<String, DWAddonInterface> addonMap = new HashMap<>();
	@Getter private HashMap<String, String> commandProviders = new HashMap<String, String>();

    public void registerNewProvider(String identifier, DWAddonInterface addon) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
    	
    }
    
    private void registerCustomCommands(String command) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
    
    }

}
