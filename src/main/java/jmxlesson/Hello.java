package jmxlesson;

import javax.management.AttributeChangeNotification;
import javax.management.MBeanNotificationInfo;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class Hello extends NotificationBroadcasterSupport implements HelloMBean {
	int sequenceNumber = 0;
	private String name;

	public int addIntegers(int a, int b) {
		return a + b;
	}

	public Person returnPerson() {
		return new Person();
	}

	public String getName() {
		return null;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello fromm Jmx");
		Notification notification =
				new AttributeChangeNotification(this, sequenceNumber++, System.currentTimeMillis(), "I sad hello from jmx", "sequenceNumber",
						"int",
						sequenceNumber - 1, sequenceNumber);
		sendNotification(notification);
	}

	@Override
	public MBeanNotificationInfo[] getNotificationInfo() {
		return super.getNotificationInfo();
	}
}
