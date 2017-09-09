package com.ypwk.message.request;

import com.ypwk.message.BaseRequestMessage;

public class TextRequestMessage extends BaseRequestMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = 549131491006156903L;

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
