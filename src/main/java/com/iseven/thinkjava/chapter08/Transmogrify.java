package com.iseven.thinkjava.chapter08;

/**
 * 练习16
 * @author yangchunming
 *
 */
public class Transmogrify {
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
		System.out.println("==============================");
		Starship starship = new Starship();
		starship.fun();
	}
}

class Actor {
	public void act() {
		
	}
}

class HappyActor extends Actor {
	public void act() {
		System.out.println("Happy Actor");
	}
}

class SadActor extends Actor {
	public void act() {
		System.out.println("Sad Actor");
	}
}

class Stage {
	private Actor actor = new SadActor();
	public void change() {
		actor = new HappyActor();
	}
	public void performPlay() {
		actor.act();
	}
}

class AlertStatus {
	private String status;
	public AlertStatus () {
		status = "forward";
	}
	public void getStatus() {
		System.out.println(status);
	}
	public void forward () {
		this.status = "forward";
	}
	public void stop () {
		this.status = "stop";
	}
}

class Starship {
	AlertStatus as = new AlertStatus();
	public void fun() {
		as.getStatus();
		as.stop();
		as.getStatus();
		as.forward();
		as.getStatus();
	}
}
