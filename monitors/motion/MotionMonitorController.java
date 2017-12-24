package monitors.motion;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/motion")
public class MotionMonitorController {

	 
	  public MotionMonitorController() {
	  }
	  
	  @RequestMapping(value = "/familyRoom", method = RequestMethod.GET, produces = "application/json")	  
	  @ResponseBody
	  public String familyRoomMotion() {
	    return "{\"homeMonitor\": {\"motion\": {\"zone\": {\"name\": \"familyRoom\",\"tripped\": \"Yes\",\"time\": \"11/24/2017 13:34:00\",\"duraiton\": \"60\"	}}}};";
	  }	
	
}

