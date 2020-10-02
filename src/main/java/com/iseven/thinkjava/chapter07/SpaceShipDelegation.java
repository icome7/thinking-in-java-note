package com.iseven.thinkjava.chapter07;

/**
 * 代理
 * @author yangchunming
 *
 */
public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	
	public void up(int velocity) {
		controls.up(velocity);
	}
	
	public void down(int velocity) {
		controls.down(velocity);
	}
	
	public void left(int velocity) {
		controls.left(velocity);
	}
	
	public void right(int velocity) {
		controls.right(velocity);
	}
	
	public void forward(int velocity) {
		controls.forward(velocity);
	}
	
	public void back(int velocity) {
		controls.back(velocity);
	}
	
	public void turboBoost() {
		controls.turboBoost();
	}
	
	public static void main(String[] args) {
		SpaceShipDelegation delegation = new SpaceShipDelegation("iseven");
		delegation.forward(1000);
	}
}

class SpaceShipControls {
	void up(int velocity) {
		System.out.println("up, v=" + velocity);
	}
	
	void down(int velocity) {
		System.out.println("down, v=" + velocity);
	}
	
	void left(int velocity) {
		System.out.println("left, v=" + velocity);
	}
	
	void right(int velocity) {
		System.out.println("right, v=" + velocity);
	}
	
	void forward(int velocity) {
		System.out.println("forward, v=" + velocity);
	}
	
	void back(int velocity) {
		System.out.println("back, v=" + velocity);
	}
	
	void turboBoost() {
		System.out.println("turbo boost");
	}
}