package com.ypwk.message.response;

import com.ypwk.message.BaseRespMessage;

public class TextRespMessage extends BaseRespMessage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2409210639179856913L;
	
	private String Content;  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    }  
}
