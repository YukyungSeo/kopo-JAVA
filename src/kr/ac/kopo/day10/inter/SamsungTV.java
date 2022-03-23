package kr.ac.kopo.day10.inter;

public class SamsungTV implements TV {

	
	public SamsungTV() {
		System.out.println("SAMSUNG TV 구매");
	}

	@Override
	public void powerOn() {
		System.out.println("TV 전원 ON");
	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원 OFF");
	}

	@Override
	public void channelUp() {
		System.out.println("CHENNEL UP");
	}

	@Override
	public void channelDown() {
		System.out.println("CHENNEL DOWN");
	}

	@Override
	public void volumeUp() {
		System.out.println("VOLUME UP");
	}

	@Override
	public void volumeDown() {
		System.out.println("VOLUME DOWN");
	}

	@Override
	public void mute() {
		// TODO Auto-generated method stub
		System.out.println("MUTE...");
	}

}
