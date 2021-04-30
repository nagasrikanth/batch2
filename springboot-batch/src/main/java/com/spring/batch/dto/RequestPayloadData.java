package com.spring.batch.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.JoinColumn;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Embedded.Nullable;
import org.springframework.data.relational.core.mapping.Table;

@Table(value ="ROCM_DIGITAL_OPPTY")
public class RequestPayloadData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(value = "OPPTY_ID")
	@Id
    @Generated(value = { "Auto" })
	private Long id;
	@Column(value = "OPPTY_SRC_CD")
	@Nullable
	private String opptyActionCode;

	@Column(value = "PGM_CD")
	@Nullable
	private String pgmcd;

	@Column(value = "SUB_PGM_CD")
	@Nullable
	private String subpgmcd;

	@Column(value = "DELIVERY_DT")
	@Nullable
	private Date deliveryDT;

	@Column(value = "OPPTY_EXPN_DT")
	@Nullable
	private Date ooptyExpnDT;

	@Column(value = "ROCM_CYCLE_NBR")
	@Nullable
	private Long rcomCycleNBR;

	@Column(value = "OPPTY_STATUS_CD")
	@Nullable
	private Long opptyStatusCD;

	@Column(value = "OPPTY_SUB_STATUS_CD")
	@Nullable
	private Long opptySubStatusCD;

	@Column(value = "OPPTY_RANK_NBR")
	@Nullable
	private Long ooptyPrtyRank;

	@Column(value = "MEMEBER_TYP_CD")
	@Nullable
	private String memberType;

	@Column(value = "MEMBER_ID")
	@Nullable
	private String memberID;

	@Column(value = "CAMPAIGN_ID")
	@Nullable
	private String campaignId;

	@Column(value = "EVENT_NM_TXT")
	@Nullable
	private String eventName;

	@Column(value = "SUB_CAMPAIGN_TYP_TXT")
	@Nullable
	private String subCampaignType;

	@Column(value = "CONTACT_TYP_CD")
	@Nullable
	private String channelType;

	@Column(value = "CONTACT_TYP_ID")
	@Nullable
	private String channelID;

	@Column(value = "EMAIL_SUBJECT_TXT")
	@Nullable
	private String emailSubject;

	@Column(value = "EMAIL_PREVIEW_TXT")
	@Nullable
	private String emailPreview;

	@Column(value = "SRC_CYCLE_NBR")
	@Nullable
	private Long srcCycleNBR;

	@Column(value = "WKFLW_EXECN_ID")
	@Nullable
	private Long wkflwExecnID;

	@Column(value = "WKFLW_EXECN_DT")
	@Nullable
	private Date wkflwExecnDT;

	@Column(value = "OPPTY_STATUS")
	@Nullable
	private String opptyStatus;

	@Column(value = "OPPTY_SUB_STATUS")
	@Nullable
	private String opptySubStatus;

	@Column(value = "ODATE")
	@Nullable
	private Date oDate;

	@Column(value = "SRC_WKFLW_EXECN_ID")
	@Nullable
	private Long srcWkflwExecnID;
	
	@JoinColumn(name = "OPPTY_ID")
	private List<AdditionalData> additionalData;
	
	public RequestPayloadData() {
	}

	public RequestPayloadData(Long id, String opptyActionCode, String pgmcd) {
		this.id = id;
		this.opptyActionCode = opptyActionCode;
		this.pgmcd = pgmcd;
	}

	/**
	 * @param id
	 * @param opptyActionCode
	 * @param pgmcd
	 * @param subpgmcd
	 * @param deliveryDT
	 * @param ooptyExpnDT
	 * @param rcomCycleNBR
	 * @param opptyStatusCD
	 * @param opptySubStatusCD
	 * @param ooptyPrtyRank
	 * @param memberType
	 * @param memberID
	 * @param campaignId
	 * @param eventName
	 * @param subCampaignType
	 * @param channelType
	 * @param channelID
	 * @param emailSubject
	 * @param emailPreview
	 * @param srcCycleNBR
	 * @param wkflwExecnID
	 * @param wkflwExecnDT
	 * @param oDate
	 * @param srcWkflwExecnID
	 */
	public RequestPayloadData(Long id, String opptyActionCode, String pgmcd, String subpgmcd, Date deliveryDT,
			Date ooptyExpnDT, Long rcomCycleNBR, Long opptyStatusCD, Long opptySubStatusCD, Long ooptyPrtyRank,
			String memberType, String memberID, String campaignId, String eventName, String subCampaignType,
			String channelType, String channelID, String emailSubject, String emailPreview, Long srcCycleNBR,
			Long wkflwExecnID, Date wkflwExecnDT, Date oDate,
			Long srcWkflwExecnID) {
		this.id = id;
		this.opptyActionCode = opptyActionCode;
		this.pgmcd = pgmcd;
		this.subpgmcd = subpgmcd;
		this.deliveryDT = deliveryDT;
		this.ooptyExpnDT = ooptyExpnDT;
		this.rcomCycleNBR = rcomCycleNBR;
		this.opptyStatusCD = opptyStatusCD;
		this.opptySubStatusCD = opptySubStatusCD;
		this.ooptyPrtyRank = ooptyPrtyRank;
		this.memberType = memberType;
		this.memberID = memberID;
		this.campaignId = campaignId;
		this.eventName = eventName;
		this.subCampaignType = subCampaignType;
		this.channelType = channelType;
		this.channelID = channelID;
		this.emailSubject = emailSubject;
		this.emailPreview = emailPreview;
		this.srcCycleNBR = srcCycleNBR;
		this.wkflwExecnID = wkflwExecnID;
		this.wkflwExecnDT = wkflwExecnDT;
		this.oDate = oDate;
		this.srcWkflwExecnID = srcWkflwExecnID;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the opptyActionCode
	 */
	public String getOpptyActionCode() {
		return opptyActionCode;
	}

	/**
	 * @param opptyActionCode
	 *            the opptyActionCode to set
	 */
	public void setOpptyActionCode(String opptyActionCode) {
		this.opptyActionCode = opptyActionCode;
	}

	/**
	 * @return the pgmcd
	 */
	public String getPgmcd() {
		return pgmcd;
	}

	/**
	 * @param pgmcd
	 *            the pgmcd to set
	 */
	public void setPgmcd(String pgmcd) {
		this.pgmcd = pgmcd;
	}

	/**
	 * @return the subpgmcd
	 */
	public String getSubpgmcd() {
		return subpgmcd;
	}

	/**
	 * @param subpgmcd
	 *            the subpgmcd to set
	 */
	public void setSubpgmcd(String subpgmcd) {
		this.subpgmcd = subpgmcd;
	}

	/**
	 * @return the deliveryDT
	 */
	public Date getDeliveryDT() {
		return deliveryDT;
	}

	/**
	 * @param deliveryDT
	 *            the deliveryDT to set
	 */
	public void setDeliveryDT(Date deliveryDT) {
		this.deliveryDT = deliveryDT;
	}

	/**
	 * @return the ooptyExpnDT
	 */
	public Date getOoptyExpnDT() {
		return ooptyExpnDT;
	}

	/**
	 * @param ooptyExpnDT
	 *            the ooptyExpnDT to set
	 */
	public void setOoptyExpnDT(Date ooptyExpnDT) {
		this.ooptyExpnDT = ooptyExpnDT;
	}

	/**
	 * @return the rcomCycleNBR
	 */
	public Long getRcomCycleNBR() {
		return rcomCycleNBR;
	}

	/**
	 * @param rcomCycleNBR
	 *            the rcomCycleNBR to set
	 */
	public void setRcomCycleNBR(Long rcomCycleNBR) {
		this.rcomCycleNBR = rcomCycleNBR;
	}

	/**
	 * @return the opptyStatusCD
	 */
	public Long getOpptyStatusCD() {
		return opptyStatusCD;
	}

	/**
	 * @param opptyStatusCD
	 *            the opptyStatusCD to set
	 */
	public void setOpptyStatusCD(Long opptyStatusCD) {
		this.opptyStatusCD = opptyStatusCD;
	}

	/**
	 * @return the opptySubStatusCD
	 */
	public Long getOpptySubStatusCD() {
		return opptySubStatusCD;
	}

	/**
	 * @param opptySubStatusCD
	 *            the opptySubStatusCD to set
	 */
	public void setOpptySubStatusCD(Long opptySubStatusCD) {
		this.opptySubStatusCD = opptySubStatusCD;
	}

	/**
	 * @return the ooptyPrtyRank
	 */
	public Long getOoptyPrtyRank() {
		return ooptyPrtyRank;
	}

	/**
	 * @param ooptyPrtyRank
	 *            the ooptyPrtyRank to set
	 */
	public void setOoptyPrtyRank(Long ooptyPrtyRank) {
		this.ooptyPrtyRank = ooptyPrtyRank;
	}

	/**
	 * @return the memberType
	 */
	public String getMemberType() {
		return memberType;
	}

	/**
	 * @param memberType
	 *            the memberType to set
	 */
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	/**
	 * @return the memberID
	 */
	public String getMemberID() {
		return memberID;
	}

	/**
	 * @param memberID
	 *            the memberID to set
	 */
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	/**
	 * @return the campaignId
	 */
	public String getCampaignId() {
		return campaignId;
	}

	/**
	 * @param campaignId
	 *            the campaignId to set
	 */
	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * @param eventName
	 *            the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	/**
	 * @return the subCampaignType
	 */
	public String getSubCampaignType() {
		return subCampaignType;
	}

	/**
	 * @param subCampaignType
	 *            the subCampaignType to set
	 */
	public void setSubCampaignType(String subCampaignType) {
		this.subCampaignType = subCampaignType;
	}

	/**
	 * @return the channelType
	 */
	public String getChannelType() {
		return channelType;
	}

	/**
	 * @param channelType
	 *            the channelType to set
	 */
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	/**
	 * @return the channelID
	 */
	public String getChannelID() {
		return channelID;
	}

	/**
	 * @param channelID
	 *            the channelID to set
	 */
	public void setChannelID(String channelID) {
		this.channelID = channelID;
	}

	/**
	 * @return the emailSubject
	 */
	public String getEmailSubject() {
		return emailSubject;
	}

	/**
	 * @param emailSubject
	 *            the emailSubject to set
	 */
	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	/**
	 * @return the emailPreview
	 */
	public String getEmailPreview() {
		return emailPreview;
	}

	/**
	 * @param emailPreview
	 *            the emailPreview to set
	 */
	public void setEmailPreview(String emailPreview) {
		this.emailPreview = emailPreview;
	}

	/**
	 * @return the srcCycleNBR
	 */
	public Long getSrcCycleNBR() {
		return srcCycleNBR;
	}

	/**
	 * @param srcCycleNBR
	 *            the srcCycleNBR to set
	 */
	public void setSrcCycleNBR(Long srcCycleNBR) {
		this.srcCycleNBR = srcCycleNBR;
	}

	/**
	 * @return the wkflwExecnID
	 */
	public Long getWkflwExecnID() {
		return wkflwExecnID;
	}

	/**
	 * @param wkflwExecnID
	 *            the wkflwExecnID to set
	 */
	public void setWkflwExecnID(Long wkflwExecnID) {
		this.wkflwExecnID = wkflwExecnID;
	}

	/**
	 * @return the wkflwExecnDT
	 */
	public Date getWkflwExecnDT() {
		return wkflwExecnDT;
	}

	/**
	 * @param wkflwExecnDT
	 *            the wkflwExecnDT to set
	 */
	public void setWkflwExecnDT(Date wkflwExecnDT) {
		this.wkflwExecnDT = wkflwExecnDT;
	}

	/**
	 * @return the opptyStatus
	 */
	public String getOpptyStatus() {
		return opptyStatus;
	}

	/**
	 * @param opptyStatus
	 *            the opptyStatus to set
	 */
	public void setOpptyStatus(String opptyStatus) {
		this.opptyStatus = opptyStatus;
	}

	/**
	 * @return the opptySubStatus
	 */
	public String getOpptySubStatus() {
		return opptySubStatus;
	}

	/**
	 * @param opptySubStatus
	 *            the opptySubStatus to set
	 */
	public void setOpptySubStatus(String opptySubStatus) {
		this.opptySubStatus = opptySubStatus;
	}

	/**
	 * @return the oDate
	 */
	public Date getODate() {
		return oDate;
	}

	/**
	 * @param oDate
	 *            the oDate to set
	 */
	public void setODate(Date oDate) {
		this.oDate = oDate;
	}

	/**
	 * @return the srcWkflwExecnID
	 */
	public Long getSrcWkflwExecnID() {
		return srcWkflwExecnID;
	}

	/**
	 * @param srcWkflwExecnID
	 *            the srcWkflwExecnID to set
	 */
	public void setSrcWkflwExecnID(Long srcWkflwExecnID) {
		this.srcWkflwExecnID = srcWkflwExecnID;
	}

	/**
	 * @return the adilist
	 */
	public List<AdditionalData> prepareAdditionalData() {
		return additionalData;
	}

	/**
	 * @param adilist the adilist to set
	 */
	public void setAdditionalData(List<AdditionalData> additionalData) {
		this.additionalData = additionalData;
	}
	
}
