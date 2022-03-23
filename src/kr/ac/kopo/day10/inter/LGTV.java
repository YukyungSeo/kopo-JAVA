package kr.ac.kopo.day10.inter;

public class LGTV implements TV {

	private boolean power;
	private int volumeSize;
	private int channelNo;
	protected static final int MAX_CHANNEL_SZIE = 100; // 0~99
	// protected : LGTV class를 상속하는 class에서만 볼 수 있다. (하위클래스에서만 볼 수 있다)

	public LGTV() {
		System.out.println("LGTV를 구매했습니다");
		this.setPower(false);
		this.volumeSize = 10;
		this.channelNo = 3;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	@Override
	public void powerOn() {
		this.setPower(true);
		System.out.println("전원을 켭니다");
		this.info();
	}

	@Override
	public void powerOff() {
		this.setPower(false);
		System.out.println("전원을 끕니다");
		this.info();
	}

	@Override
	public void channelUp() {
		this.channelNo = (++this.channelNo % LGTV.MAX_CHANNEL_SZIE);
		System.out.println("채널을 올렸습니다");
		this.info();
	}

	@Override
	public void channelDown() {
		if (this.volumeSize == 0)
			this.channelNo = LGTV.MAX_CHANNEL_SZIE;
		this.channelNo--;
		System.out.println("채널을 올렸습니다");
		this.info();
	}

	@Override
	public void volumeUp() {
		if (this.volumeSize < TV.MAX_VOLUME_SIZE)
			this.volumeSize++;
		System.out.println("음량을 높힙니다");
		this.info();
	}

	@Override
	public void volumeDown() {
		if (this.volumeSize > TV.MIN_VOLUME_SIZE)
			this.volumeSize--;
		System.out.println("음량을 낮춥니다");
		this.info();
	}

	@Override
	public void mute() {
		this.volumeSize = TV.MIN_VOLUME_SIZE;
		System.out.println("음소거 중입니다");
		this.info();
	}

	public void info() {
		System.out.printf("채널번호 : %d, 음량크기 : %d\n", this.channelNo, this.volumeSize);
	}
}
