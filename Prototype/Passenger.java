package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Passenger {

	public static void main(String[] args) {

		
		// Registry Object
		
		Route_Registry routeRegistry = new Route_Registry();
		
		// Group -1
		Train hyd_csmt =  new Train();
		
		hyd_csmt.setTfare(2000);
		hyd_csmt.settType("Express");
		hyd_csmt.setEngineType("Electric");
		hyd_csmt.setNumOfSeats(1500);
		hyd_csmt.setRoute_name("HYD_CSMT");

		
		// Adding  Route-1 to Registry
		routeRegistry.save(hyd_csmt);

		// Group -2 
		Train sec_vskp = new Train();
		
		sec_vskp.setTfare(1200);
		sec_vskp.settType("Super-Fast");
		sec_vskp.setEngineType("Hybrid");
		sec_vskp.setNumOfSeats(1500);
		sec_vskp.setRoute_name("SEC_VSKP");
		
		// Adding Route-2 to Registry
		routeRegistry.save(sec_vskp);
		
		
		// Generating Trains from Route templates 
		
		Map<String,String> temp_st_time = new HashMap<String, String>();
		
		// Group-1 ----- Train -1 Konark
		
		Train konark = routeRegistry.getRouteGroup("HYD_CSMT").clone();
		konark.setTrainNo(11020);
		konark.setStartTime("11:00");
		konark.setDestniationTime("4:00");
		
		
		temp_st_time.put("Sedam", "13:19");
		temp_st_time.put("Solapur", "18:00");
		temp_st_time.put("Lonavala", "00:53" );
		temp_st_time.put("Dadar Ctrl", "03:22");
		
		
		konark.setStation_time(temp_st_time);
		
		temp_st_time.clear();
		
		// Group-1 ----- Train -2 Devagiri
		
		Train devagiri =  routeRegistry.getRouteGroup("HYD_CSMT").clone();
		devagiri.setTrainNo(17058);
		devagiri.setStartTime("13:25");
		devagiri.setDestniationTime("7:10");
		
		temp_st_time.put("Nizamabad","15:48");
		temp_st_time.put("Nanded", "18:45");
		temp_st_time.put("Nashik", "02:55");
		temp_st_time.put("Dadar", "06:39");
		
		devagiri.setStation_time(temp_st_time);
		
		temp_st_time.clear();
		
		System.out.println(konark);
		System.out.println(devagiri);
		
		
		System.out.println("Group-2 \n");
		
		// Group-2 Train -1 JanamaBhoomi
		
		Train jnm =  routeRegistry.getRouteGroup("SEC_VSKP").clone();
		jnm.setTrainNo(12806);
		jnm.setStartTime("7:00");
		jnm.setDestniationTime("19:45");
		
		
		// Group-2 Train -2 EastCoast
		
		Train ec =  routeRegistry.getRouteGroup("SEC_VSKP").clone();
		ec.setTrainNo(18046);
		ec.setStartTime("08:30");
		ec.setDestniationTime("21:10");
		
		System.out.println(jnm);
		System.out.println(ec);
		
		
		
		
	}

}
