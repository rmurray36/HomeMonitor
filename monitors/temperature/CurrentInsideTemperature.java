package monitors.temperature;

import org.springframework.stereotype.Component;

@Component
public class CurrentInsideTemperature extends Temperature {

	public CurrentInsideTemperature() {
		super();
	}

	public CurrentInsideTemperature(Float value) {
		super(value);
	}
	
	public String getJSON() {		
		return "{\"homeMonitor\": {\"insideTemperature\": "+ this.getTemperatureString()  +",\"metric\": \"F\"} }";
	}

}
