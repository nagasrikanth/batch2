package com.spring.batch.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Embedded.Nullable;

@Table(value = "ROCM_DIGITAL_OPPTY_ADDL_DTL")
public class AdditionalData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Nullable
	@Column(value = "OPPTY_ADDL_SEQ_ID")
	private Long opptyAddlSeqID;
	@Nullable
	@Column(value = "OPPTY_ID")
	private Long opptyID;
	@Nullable
	@Column(value = "OPPTY_SRC_CD")
	private String opptySrcID;
	
	@Column(value = "PGM_CD")
	@Nullable
	private String pgmcd;
	@Column(value = "SUB_PGM_CD")
	@Nullable
	private String subpgmcd;
	@Column(value = "SGMNT_CD_LVL1")
	@Nullable
	private String sgmntCdLVL1;
	@Column(value = "SGMNT_CD_LVL2")
	@Nullable
	private String sgmntCdLVL2;
	@Column(value = "SGMNT_CD_LVL3")
	@Nullable
	private String sgmntCdLVL3;
	@Column(value = "SGMNT_CD_LVL4")
	@Nullable
	private String sgmntCdLVL4;
	@Column(value = "SGMNT_CD_LVL5")
	@Nullable
	private String sgmntCdLVL5;
	@Column(value = "SGMNT_CD_LVL6")
	@Nullable
	private String sgmntCdLVL6;
	@Column(value = "SGMNT_SEQ_NBR")
	@Nullable
	private Long sgmntSeqNBR;
	@Column(value = "ATRB_NM1")
	@Nullable
	private String atrbNM1;
	@Column(value = "ATRB_VAL1")
	@Nullable
	private String atrbVAL1;
	@Column(value = "ATRB_NM2")
	@Nullable
	private String atrbNM2;
	@Column(value = "ATRB_VAL2")
	@Nullable
	private String atrbVAL2;
	@Column(value = "ATRB_NM3")
	@Nullable
	private String atrbNM3;
	@Column(value = "ATRB_VAL3")
	@Nullable
	private String atrbVAL3;
	@Column(value = "ATRB_NM4")
	@Nullable
	private String atrbNM4;
	@Column(value = "ATRB_VAL4")
	@Nullable
	private String atrbVAL4;
	@Column(value = "ATRB_NM5")
	@Nullable
	private String atrbNM5;
	@Column(value = "ATRB_VAL5")
	@Nullable
	private String atrbVAL5;
	@Column(value = "ATRB_NM6")
	@Nullable
	private String atrbNM6;
	@Column(value = "ATRB_VAL6")
	@Nullable
	private String atrbVAL6;
	@Column(value = "ATRB_NM7")
	@Nullable
	private String atrbNM7;
	@Column(value = "ATRB_VAL7")
	@Nullable
	private String atrbVAL7;
	@Column(value = "ATRB_NM8")
	@Nullable
	private String atrbNM8;
	@Column(value = "ATRB_VAL8")
	@Nullable
	private String atrbVAL8;
	@Column(value = "ATRB_NM9")
	@Nullable
	private String atrbNM9;
	@Column(value = "ATRB_VAL9")
	@Nullable
	private String atrbVAL9;
	@Column(value = "ATRB_NM10")
	@Nullable
	private String atrbNM10;
	@Column(value = "ATRB_VAL10")
	@Nullable
	private String atrbVAL10;
	@Column(value = "WKFLW_EXECN_ID")
	@Nullable
	private Long wkflwExecnID;

	@Column(value = "WKFLW_EXECN_DT")
	@Nullable
	private Date wkflwExecnDT;

	@Column(value = "ODATE")
	@Nullable
	private Date oDate;

	@Column(value = "SRC_WKFLW_EXECN_ID")
	@Nullable
	private Long srcWkflwExecnID;

	/**
	 * @param opptyAddlSeqID
	 * @param opptyID
	 * @param opptySrcID
	 * @param pgmcd
	 * @param subpgmcd
	 * @param sgmntCdLVL1
	 * @param sgmntCdLVL2
	 * @param sgmntCdLVL3
	 * @param sgmntCdLVL4
	 * @param sgmntCdLVL5
	 * @param sgmntCdLVL6
	 * @param sgmntSeqNBR
	 * @param atrbNM1
	 * @param atrbVAL1
	 * @param atrbNM2
	 * @param atrbVAL2
	 * @param atrbNM3
	 * @param atrbVAL3
	 * @param atrbNM4
	 * @param atrbVAL4
	 * @param atrbNM5
	 * @param atrbVAL5
	 * @param atrbNM6
	 * @param atrbVAL6
	 * @param atrbNM7
	 * @param atrbVAL7
	 * @param atrbNM8
	 * @param atrbVAL8
	 * @param atrbNM9
	 * @param atrbVAL9
	 * @param atrbNM10
	 * @param atrbVAL10
	 * @param wkflwExecnID
	 * @param wkflwExecnDT
	 * @param oDate
	 * @param srcWkflwExecnID
	 */
	public AdditionalData(Long opptyAddlSeqID, Long opptyID, String opptySrcID, String pgmcd, String subpgmcd,
			String sgmntCdLVL1, String sgmntCdLVL2, String sgmntCdLVL3, String sgmntCdLVL4, String sgmntCdLVL5,
			String sgmntCdLVL6, Long sgmntSeqNBR, String atrbNM1, String atrbVAL1, String atrbNM2, String atrbVAL2,
			String atrbNM3, String atrbVAL3, String atrbNM4, String atrbVAL4, String atrbNM5, String atrbVAL5,
			String atrbNM6, String atrbVAL6, String atrbNM7, String atrbVAL7, String atrbNM8, String atrbVAL8,
			String atrbNM9, String atrbVAL9, String atrbNM10, String atrbVAL10, Long wkflwExecnID, Date wkflwExecnDT,
			Date oDate, Long srcWkflwExecnID) {
		this.opptyAddlSeqID = opptyAddlSeqID;
		this.opptyID = opptyID;
		this.opptySrcID = opptySrcID;
		this.pgmcd = pgmcd;
		this.subpgmcd = subpgmcd;
		this.sgmntCdLVL1 = sgmntCdLVL1;
		this.sgmntCdLVL2 = sgmntCdLVL2;
		this.sgmntCdLVL3 = sgmntCdLVL3;
		this.sgmntCdLVL4 = sgmntCdLVL4;
		this.sgmntCdLVL5 = sgmntCdLVL5;
		this.sgmntCdLVL6 = sgmntCdLVL6;
		this.sgmntSeqNBR = sgmntSeqNBR;
		this.atrbNM1 = atrbNM1;
		this.atrbVAL1 = atrbVAL1;
		this.atrbNM2 = atrbNM2;
		this.atrbVAL2 = atrbVAL2;
		this.atrbNM3 = atrbNM3;
		this.atrbVAL3 = atrbVAL3;
		this.atrbNM4 = atrbNM4;
		this.atrbVAL4 = atrbVAL4;
		this.atrbNM5 = atrbNM5;
		this.atrbVAL5 = atrbVAL5;
		this.atrbNM6 = atrbNM6;
		this.atrbVAL6 = atrbVAL6;
		this.atrbNM7 = atrbNM7;
		this.atrbVAL7 = atrbVAL7;
		this.atrbNM8 = atrbNM8;
		this.atrbVAL8 = atrbVAL8;
		this.atrbNM9 = atrbNM9;
		this.atrbVAL9 = atrbVAL9;
		this.atrbNM10 = atrbNM10;
		this.atrbVAL10 = atrbVAL10;
		this.wkflwExecnID = wkflwExecnID;
		this.wkflwExecnDT = wkflwExecnDT;
		this.oDate = oDate;
		this.srcWkflwExecnID = srcWkflwExecnID;
	}

	/**
	 * @return the opptyAddlSeqID
	 */
	public Long getOpptyAddlSeqID() {
		return opptyAddlSeqID;
	}

	/**
	 * @param opptyAddlSeqID
	 *            the opptyAddlSeqID to set
	 */
	public void setOpptyAddlSeqID(Long opptyAddlSeqID) {
		this.opptyAddlSeqID = opptyAddlSeqID;
	}

	/**
	 * @return the opptyID
	 */
	public Long getOpptyID() {
		return opptyID;
	}

	/**
	 * @param opptyID
	 *            the opptyID to set
	 */
	public void setOpptyID(Long opptyID) {
		this.opptyID = opptyID;
	}

	/**
	 * @return the opptySrcID
	 */
	public String getOpptySrcID() {
		return opptySrcID;
	}

	/**
	 * @param opptySrcID
	 *            the opptySrcID to set
	 */
	public void setOpptySrcID(String opptySrcID) {
		this.opptySrcID = opptySrcID;
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
	 * @return the sgmntCdLVL1
	 */
	public String getSgmntCdLVL1() {
		return sgmntCdLVL1;
	}

	/**
	 * @param sgmntCdLVL1
	 *            the sgmntCdLVL1 to set
	 */
	public void setSgmntCdLVL1(String sgmntCdLVL1) {
		this.sgmntCdLVL1 = sgmntCdLVL1;
	}

	/**
	 * @return the sgmntCdLVL2
	 */
	public String getSgmntCdLVL2() {
		return sgmntCdLVL2;
	}

	/**
	 * @param sgmntCdLVL2
	 *            the sgmntCdLVL2 to set
	 */
	public void setSgmntCdLVL2(String sgmntCdLVL2) {
		this.sgmntCdLVL2 = sgmntCdLVL2;
	}

	/**
	 * @return the sgmntCdLVL3
	 */
	public String getSgmntCdLVL3() {
		return sgmntCdLVL3;
	}

	/**
	 * @param sgmntCdLVL3
	 *            the sgmntCdLVL3 to set
	 */
	public void setSgmntCdLVL3(String sgmntCdLVL3) {
		this.sgmntCdLVL3 = sgmntCdLVL3;
	}

	/**
	 * @return the sgmntCdLVL4
	 */
	public String getSgmntCdLVL4() {
		return sgmntCdLVL4;
	}

	/**
	 * @param sgmntCdLVL4
	 *            the sgmntCdLVL4 to set
	 */
	public void setSgmntCdLVL4(String sgmntCdLVL4) {
		this.sgmntCdLVL4 = sgmntCdLVL4;
	}

	/**
	 * @return the sgmntCdLVL5
	 */
	public String getSgmntCdLVL5() {
		return sgmntCdLVL5;
	}

	/**
	 * @param sgmntCdLVL5
	 *            the sgmntCdLVL5 to set
	 */
	public void setSgmntCdLVL5(String sgmntCdLVL5) {
		this.sgmntCdLVL5 = sgmntCdLVL5;
	}

	/**
	 * @return the sgmntCdLVL6
	 */
	public String getSgmntCdLVL6() {
		return sgmntCdLVL6;
	}

	/**
	 * @param sgmntCdLVL6
	 *            the sgmntCdLVL6 to set
	 */
	public void setSgmntCdLVL6(String sgmntCdLVL6) {
		this.sgmntCdLVL6 = sgmntCdLVL6;
	}

	/**
	 * @return the sgmntSeqNBR
	 */
	public Long getSgmntSeqNBR() {
		return sgmntSeqNBR;
	}

	/**
	 * @param sgmntSeqNBR
	 *            the sgmntSeqNBR to set
	 */
	public void setSgmntSeqNBR(Long sgmntSeqNBR) {
		this.sgmntSeqNBR = sgmntSeqNBR;
	}

	/**
	 * @return the atrbNM1
	 */
	public String getAtrbNM1() {
		return atrbNM1;
	}

	/**
	 * @param atrbNM1
	 *            the atrbNM1 to set
	 */
	public void setAtrbNM1(String atrbNM1) {
		this.atrbNM1 = atrbNM1;
	}

	/**
	 * @return the atrbVAL1
	 */
	public String getAtrbVAL1() {
		return atrbVAL1;
	}

	/**
	 * @param atrbVAL1
	 *            the atrbVAL1 to set
	 */
	public void setAtrbVAL1(String atrbVAL1) {
		this.atrbVAL1 = atrbVAL1;
	}

	/**
	 * @return the atrbNM2
	 */
	public String getAtrbNM2() {
		return atrbNM2;
	}

	/**
	 * @param atrbNM2
	 *            the atrbNM2 to set
	 */
	public void setAtrbNM2(String atrbNM2) {
		this.atrbNM2 = atrbNM2;
	}

	/**
	 * @return the atrbVAL2
	 */
	public String getAtrbVAL2() {
		return atrbVAL2;
	}

	/**
	 * @param atrbVAL2
	 *            the atrbVAL2 to set
	 */
	public void setAtrbVAL2(String atrbVAL2) {
		this.atrbVAL2 = atrbVAL2;
	}

	/**
	 * @return the atrbNM3
	 */
	public String getAtrbNM3() {
		return atrbNM3;
	}

	/**
	 * @param atrbNM3
	 *            the atrbNM3 to set
	 */
	public void setAtrbNM3(String atrbNM3) {
		this.atrbNM3 = atrbNM3;
	}

	/**
	 * @return the atrbVAL3
	 */
	public String getAtrbVAL3() {
		return atrbVAL3;
	}

	/**
	 * @param atrbVAL3
	 *            the atrbVAL3 to set
	 */
	public void setAtrbVAL3(String atrbVAL3) {
		this.atrbVAL3 = atrbVAL3;
	}

	/**
	 * @return the atrbNM4
	 */
	public String getAtrbNM4() {
		return atrbNM4;
	}

	/**
	 * @param atrbNM4
	 *            the atrbNM4 to set
	 */
	public void setAtrbNM4(String atrbNM4) {
		this.atrbNM4 = atrbNM4;
	}

	/**
	 * @return the atrbVAL4
	 */
	public String getAtrbVAL4() {
		return atrbVAL4;
	}

	/**
	 * @param atrbVAL4
	 *            the atrbVAL4 to set
	 */
	public void setAtrbVAL4(String atrbVAL4) {
		this.atrbVAL4 = atrbVAL4;
	}

	/**
	 * @return the atrbNM5
	 */
	public String getAtrbNM5() {
		return atrbNM5;
	}

	/**
	 * @param atrbNM5
	 *            the atrbNM5 to set
	 */
	public void setAtrbNM5(String atrbNM5) {
		this.atrbNM5 = atrbNM5;
	}

	/**
	 * @return the atrbVAL5
	 */
	public String getAtrbVAL5() {
		return atrbVAL5;
	}

	/**
	 * @param atrbVAL5
	 *            the atrbVAL5 to set
	 */
	public void setAtrbVAL5(String atrbVAL5) {
		this.atrbVAL5 = atrbVAL5;
	}

	/**
	 * @return the atrbNM6
	 */
	public String getAtrbNM6() {
		return atrbNM6;
	}

	/**
	 * @param atrbNM6
	 *            the atrbNM6 to set
	 */
	public void setAtrbNM6(String atrbNM6) {
		this.atrbNM6 = atrbNM6;
	}

	/**
	 * @return the atrbVAL6
	 */
	public String getAtrbVAL6() {
		return atrbVAL6;
	}

	/**
	 * @param atrbVAL6
	 *            the atrbVAL6 to set
	 */
	public void setAtrbVAL6(String atrbVAL6) {
		this.atrbVAL6 = atrbVAL6;
	}

	/**
	 * @return the atrbNM7
	 */
	public String getAtrbNM7() {
		return atrbNM7;
	}

	/**
	 * @param atrbNM7
	 *            the atrbNM7 to set
	 */
	public void setAtrbNM7(String atrbNM7) {
		this.atrbNM7 = atrbNM7;
	}

	/**
	 * @return the atrbVAL7
	 */
	public String getAtrbVAL7() {
		return atrbVAL7;
	}

	/**
	 * @param atrbVAL7
	 *            the atrbVAL7 to set
	 */
	public void setAtrbVAL7(String atrbVAL7) {
		this.atrbVAL7 = atrbVAL7;
	}

	/**
	 * @return the atrbNM8
	 */
	public String getAtrbNM8() {
		return atrbNM8;
	}

	/**
	 * @param atrbNM8
	 *            the atrbNM8 to set
	 */
	public void setAtrbNM8(String atrbNM8) {
		this.atrbNM8 = atrbNM8;
	}

	/**
	 * @return the atrbVAL8
	 */
	public String getAtrbVAL8() {
		return atrbVAL8;
	}

	/**
	 * @param atrbVAL8
	 *            the atrbVAL8 to set
	 */
	public void setAtrbVAL8(String atrbVAL8) {
		this.atrbVAL8 = atrbVAL8;
	}

	/**
	 * @return the atrbNM9
	 */
	public String getAtrbNM9() {
		return atrbNM9;
	}

	/**
	 * @param atrbNM9
	 *            the atrbNM9 to set
	 */
	public void setAtrbNM9(String atrbNM9) {
		this.atrbNM9 = atrbNM9;
	}

	/**
	 * @return the atrbVAL9
	 */
	public String getAtrbVAL9() {
		return atrbVAL9;
	}

	/**
	 * @param atrbVAL9
	 *            the atrbVAL9 to set
	 */
	public void setAtrbVAL9(String atrbVAL9) {
		this.atrbVAL9 = atrbVAL9;
	}

	/**
	 * @return the atrbNM10
	 */
	public String getAtrbNM10() {
		return atrbNM10;
	}

	/**
	 * @param atrbNM10
	 *            the atrbNM10 to set
	 */
	public void setAtrbNM10(String atrbNM10) {
		this.atrbNM10 = atrbNM10;
	}

	/**
	 * @return the atrbVAL10
	 */
	public String getAtrbVAL10() {
		return atrbVAL10;
	}

	/**
	 * @param atrbVAL10
	 *            the atrbVAL10 to set
	 */
	public void setAtrbVAL10(String atrbVAL10) {
		this.atrbVAL10 = atrbVAL10;
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
	 * @return the oDate
	 */
	public Date getoDate() {
		return oDate;
	}

	/**
	 * @param oDate
	 *            the oDate to set
	 */
	public void setoDate(Date oDate) {
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

}
