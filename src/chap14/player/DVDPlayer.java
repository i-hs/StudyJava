package chap14.player;

public class DVDPlayer implements ExPlayer{
	public void play() {
		System.out.println("DVD 재생!");
	}
	public void stop() {
		System.out.println("DVD 재생 종료!");
	}
	public void slow() {
		System.out.println("느린 재생 시작!");
	}
}
