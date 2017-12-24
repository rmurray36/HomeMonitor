package monitors.temperature;

public class Temperature {
	private Float temperature = 0.0F;
	private String time = "";
	
	public Temperature() {};
	
	public Temperature (Float value) {
	    temperature = value;
	}
	public Temperature (String value) {
		temperature = Float.parseFloat(value);	
	}
	
	public Float getTemperature() {
		return this.temperature;
	}

	public String getTemperatureString() {
		return Float.toString(this.temperature);
	}

	public void setTemperature(String time, Float temp) {
		temperature = temp;
		this.time = time;
	}
	
	public void setTemperature(String time, String temp) {
		int i = temp.indexOf(".");
		temp = temp.substring(0, i+3); 
		temperature = Float.valueOf(temp);
		this.time = time;
	}
}
