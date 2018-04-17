package work;

public class TV {
	private String model;
	private int size;
	private int channel;

	public TV() {
	}

	public TV(String model, int size, int channel) {
		setModel(model);
		setChannel(channel);
		setSize(size);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void channelUp() {
		if (channel <= 10){
			channel++;
			if (channel == 10)
				channel = 1;
		}
		/*
		 * else if(channel>10) channel=1;
		 */
	}

	public void channelDown() {
		if (1 <= channel && channel <= 10) {
			channel--;
			if (channel == 0)
				channel = 10;
		}

		/*
		 * else if(channel<1) channel=10;
		 */

	}

}
