package simulator;

import java.io.Serializable;

public class Flow implements Serializable {
	
	private static final long serialVersionUID = 8001114698646828534L;
	
	private final static int DEFAULT_RATE = 0;
	private final static FlowType DEFAULT_TYPE = FlowType.Water;
	private final static int DEFAULT_TEMPERATURE = 0;
	
	private int rate;
	private FlowType type;
	private int temperature;

	public Flow() {
		this.rate = DEFAULT_RATE;
		this.type = DEFAULT_TYPE;
		this.temperature = DEFAULT_TEMPERATURE;
	}
	
	public Flow(FlowType type) {
		this.rate = DEFAULT_RATE;
		this.temperature = DEFAULT_TEMPERATURE;
		this.type = type;
	}
	
	public Flow(FlowType type, int rate) {
		this.rate = rate;
		this.temperature = DEFAULT_TEMPERATURE;
		this.type = type;
	}
	
	public Flow(FlowType type, int rate, int temperature) {
		this.rate = rate;
		this.temperature = temperature;
		this.type = type;
	}
	
	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public FlowType getType() {
		return type;
	}

	public void setType(FlowType type) {
		this.type = type;
	}
	
	public int getTemperature()
	{
		return temperature;
	}

	public void setTemperature(int temperature)
	{
		this.temperature = temperature;
	}

}
