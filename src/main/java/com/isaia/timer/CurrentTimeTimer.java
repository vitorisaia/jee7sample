package com.isaia.timer;

import java.util.Date;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

import org.apache.log4j.Logger;

@Stateless
public class CurrentTimeTimer {

	@Schedule(second = "10", minute = "*", hour = "*")
	public void showCurrentTime() {
		Logger.getLogger(CurrentTimeTimer.class).info(this + "#" + new Date());
	}
}
