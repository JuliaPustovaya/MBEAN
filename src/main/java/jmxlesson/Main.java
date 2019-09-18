package jmxlesson;

import java.lang.management.ManagementFactory;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;

public class Main {
	public static void main(String[] args)
			throws MalformedObjectNameException, NotCompliantMBeanException, InstanceAlreadyExistsException, MBeanRegistrationException,
			InterruptedException {
		MBeanServer server = ManagementFactory.getPlatformMBeanServer();
		ObjectName name= new ObjectName("jmxlesson:type=Hello");
		Hello mbean = new Hello();
		server.registerMBean(mbean, name);
		System.out.println("Waiting.....");
		Thread.sleep(Long.MAX_VALUE);

	}
}
