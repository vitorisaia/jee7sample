package com.isaia.timer;

import java.util.Date;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class CurrentTimeTimer {

	@Schedule(second = "10", minute = "*", hour = "*")
	public void showCurrentTime() {
		System.out.println(new Date());
	}

}
