package Server;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Class Messages that help us to add new Messages and save the messages.
 * @author amrapoprzanovic
 *
 */
public class Message {

	private String content;
	private String sender;
	private static Queue<Message> msgQueue = new LinkedList<Message>();
	
	/**
	 * Constructor for Messages.
	 * @param content-content of message.
	 * @param sender - client that sends message.
	 */
	public Message(String content, String sender) {
		super();
		this.content = content;
		this.sender = sender;
		msgQueue.add(this);
	}
	
	public static boolean hasNext(){
		return  !msgQueue.isEmpty();
	}
	
	/**
	 * 
	 * @return last message from queue of messages.
	 */
	public static Message next(){
		return msgQueue.poll();		
	}
	
}
