package monitors.temperature;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/temperature")
public class TemperatureMonitorController {
	 
	  @Autowired
	  private CurrentOutsideTemperature currentOutsideTemperature;
	  @Autowired
	  private CurrentInsideTemperature currentInsideTemperature;
	  
	  public TemperatureMonitorController() {
	  }
	  
	  //
	  // OUTSIDE TEMP
	  //
	  @RequestMapping(value = "/currentOutsideTemperatureAsJSON", method = RequestMethod.GET, produces = "application/json")	  
	  @ResponseBody
	  public String currentOutsideTemperatureAsJSON() {
	      return currentOutsideTemperature.getJSON();
	  }

	  @RequestMapping(value = "/currentOutsideTemperatureAsString", method = RequestMethod.GET, produces = "application/json")	  
	  @ResponseBody
	  public String currentOutsideTemperatureAsString() {
	      return currentOutsideTemperature.getTemperatureString();
	  }
	  
	  @RequestMapping(value = "/setCurrentOutsideTemperature", method = RequestMethod.POST)	  
	  @ResponseBody
	  public void setCurrentOutsideTemperature(@RequestParam String time, @RequestParam String temp) {
		  currentOutsideTemperature.setTemperature(time, temp);
		  return;
	  }

	  //
	  // INSIDE TEMP
	  //
	  @RequestMapping(value = "/currentInsideTemperatureAsJSON", method = RequestMethod.GET, produces = "application/json")	  
	  @ResponseBody
	  public String currentInsideTemperatureAsJSON() {
	      return currentInsideTemperature.getJSON();
	  }

	  @RequestMapping(value = "/currentInsideTemperatureAsString", method = RequestMethod.GET, produces = "application/json")	  
	  @ResponseBody
	  public String currentInsideTemperatureAsString() {
	      return currentInsideTemperature.getTemperatureString();
	  }	  

	  @RequestMapping(value = "/setCurrentInsideTemperature", method = RequestMethod.POST)	  
	  @ResponseBody
	  public void setCurrentInsideTemperature(@RequestParam String time, @RequestParam String temp) {
		  currentInsideTemperature.setTemperature(time, temp);
		  return;
	  }

	  //
	  // HOME
	  //
	  @RequestMapping(value = "/home", method = RequestMethod.GET)	  
	  public String home() {
		  return "homeMonitor";
	  }
	  
}
