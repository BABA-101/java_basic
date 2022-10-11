package Prac5;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int PrevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) {
			return;
		}
		
		this.volume = volume;
	}
	public int getVolume() {
		return this.volume;
	}
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}

		this.PrevChannel=this.channel;
		this.channel = channel;
	}
	public int getChannel() {
		return this.channel;
	}
	
	public void gotoPrevChannel() {
		setChannel(PrevChannel); //답은 이거임ㅋㅋ
		/* 내가 쓴 메서드내용
		 * int channel=this.PrevChannel;
		 * this.PrevChannel=this.channel;
		 * this.channel = channel;
		 */
	}
}

public class Prac7_5 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH: " + t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		
		t.setChannel(55);
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
	}
}
