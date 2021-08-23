package ch13_2_stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<>();
		
		messageQueue.offer(new Message("sendMail" , "GilDong Hong"));
		messageQueue.offer(new Message("sendSMS" , "YongKwon Sin"));
		messageQueue.offer(new Message("sendKakaoTalk" , "Duggea Hong"));
		
		while(!messageQueue.isEmpty()) {
			Message mes = messageQueue.poll();
			switch(mes.command) {
			case "sendMail" :
				System.out.println("send mail to " +mes.to );
				break;
			case "sendSMS" :
				System.out.println("send SMS to " + mes.to );
				break;
			case "sendKakaoTalk" :
				System.out.println("send KakaoTalk to" + mes.to );
				break;
			}
		}

		
	}

}
