package com.doug.logs;

import org.apache.log4j.Logger;

public class MyLog {
	private static final Logger log = Logger.getLogger(MyLog.class);

	public static void main(String args[]) {
		log.info("test");
	}

}
