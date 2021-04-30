package com.spring.batch.dto;

import java.io.Serializable;

public class RequestMetaData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String appName;
	private String lineOfBusiness;
	private String conversationID;

	/**
	 * @return the appName
	 */
	public String getAppName() {
		return appName;
	}

	/**
	 * @param appName
	 *            the appName to set
	 */
	public void setAppName(String appName) {
		this.appName = appName;
	}

	/**
	 * @return the lineOfBusiness
	 */
	public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	/**
	 * @param lineOfBusiness
	 *            the lineOfBusiness to set
	 */
	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	/**
	 * @return the conversationID
	 */
	public String getConversationID() {
		return conversationID;
	}

	/**
	 * @param conversationID
	 *            the conversationID to set
	 */
	public void setConversationID(String conversationID) {
		this.conversationID = conversationID;
	}

	/**
	 * @param appName
	 * @param lineOfBusiness
	 * @param conversationID
	 */
	public RequestMetaData(String appName, String lineOfBusiness, String conversationID) {
		this.appName = appName;
		this.lineOfBusiness = lineOfBusiness;
		this.conversationID = conversationID;
	}
}
