package monitors.temperature;

import org.springframework.stereotype.Component;

@Component
public class CurrentOutsideTemperature extends Temperature {

	public CurrentOutsideTemperature() {
		super();
	}

	public CurrentOutsideTemperature(Float value) {
		super(value);
	}
	
	public String getJSON() {		
		return "{\"homeMonitor\": {\"outsideTemperature\": "+ this.getTemperatureString()  +",\"metric\": \"F\"} }";
	}

}
