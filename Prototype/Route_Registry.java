package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Route_Registry {

	private Map<String, Train> routeGroup; // Just a reference not an actual object

	
	// To assign memory to our reference map
	public Route_Registry() {
		routeGroup = new HashMap<String, Train>();
	}
	

	
	// This is analogous to setter
	public void save(Train template) {
		routeGroup.put(template.getRoute_name(), template); // Adding the template/ prototype to our registry
	}
	
	
	public Train getRouteGroup(String routeName) {
		return routeGroup.get(routeName);
	}
	

}
