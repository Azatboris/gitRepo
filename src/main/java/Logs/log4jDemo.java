package Logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {
	static Logger logger=LogManager.getLogger(log4jDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld");
		logger.error("this is error");
		logger.info("yhis is info");
		System.out.println("complete");

	}

}
