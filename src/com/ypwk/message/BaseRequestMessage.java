package com.ypwk.message;

import java.io.Serializable;

/**
 * 基本文本格式消息
 * */
public class BaseRequestMessage implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1598081084513401148L;

	private String toUserName;
	private String fromUserName;
	private Long createTime;
	private String msgType="text";
	private Long msgId;
	public String getToUserName() {
		return toUserName;
	}
	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}
	public String getFromUserName() {
		return fromUserName;
	}
	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}
	public Long getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public Long getMsgId() {
		return msgId;
	}
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	
}
