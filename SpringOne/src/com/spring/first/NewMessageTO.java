package com.spring.first;

public class NewMessageTO extends MessageTO{
	private String newMessage;
	private String value;
	private MessageTO messageTO;
	
	public MessageTO getMessageTO() {
		return messageTO;
	}

	public void setMessageTO(MessageTO messageTO) {
		this.messageTO = messageTO;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getNewMessage() {
		return newMessage;
	}

	public void setNewMessage(String newMessage) {
		this.newMessage = newMessage;
	}
}
