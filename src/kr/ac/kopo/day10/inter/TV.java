package kr.ac.kopo.day10.inter;

public interface TV {

	/* public static final */ int MIN_VOLUME_SIZE = 0;
	/* public static final */ int MAX_VOLUME_SIZE = 50;

	/**
	 * 전원을 켜는 기능
	 */
	/* public abstract */ void powerOn();

	/**
	 * 전원을 끄는 기능
	 */
	void powerOff();

	/**
	 * 채널을 올리는 기능
	 */
	void channelUp();

	/**
	 * 채널을 내리는 기능
	 */
	void channelDown();

	/**
	 * 볼륨을 키우는 기능
	 */
	void volumeUp();

	/**
	 * 볼륨을 줄이는 기능
	 */
	void volumeDown();

	/**
	 * 음소거하는 기능
	 */
	void mute();
}
