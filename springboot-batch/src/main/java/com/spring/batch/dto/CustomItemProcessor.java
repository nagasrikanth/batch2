package com.spring.batch.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

//Implementing the ItemProcessor interface

public class CustomItemProcessor implements ItemProcessor<List<RequestPayloadData>, List<String>> {


	@Override
	public List<String> process(List<RequestPayloadData> items) throws Exception {
		List<String> str = new ArrayList<String>();
		items.forEach(item ->{
			String datakv = this.prepareDataJsonObject(item);
 			System.out.println("Processing..." + datakv.toString());
			str.add(datakv);
		});
		
		return str;
	}

	private String prepareDataJsonObject(RequestPayloadData data) {
		JSONObject json = new JSONObject();
		try {
			JSONObject json1 = new JSONObject();
			json1.put("appName", "CRM-DIGITAL-PNP");
			json1.put("lineOfBusiness", "Retail");
			json1.put("conversationID", "Id-e314fac206094fd9bc2bf64b39d072d7");
			json.put("requestMetaData", json1);

			JSONObject json2 = new JSONObject();
			json2.put("id", data.getId());
			json2.put("opptyActionCode", data.getOpptyActionCode());
			json2.put("pgmcd", data.getPgmcd());
			json2.put("subpgmcd", data.getSubpgmcd());
			json2.put("deliveryDT", data.getDeliveryDT());
			json2.put("ooptyExpnDT", data.getOoptyExpnDT());
			json2.put("rcomCycleNBR", data.getRcomCycleNBR());
			json2.put("opptyStatusCD", data.getOpptyStatusCD());
			json2.put("opptySubStatusCD", data.getOpptySubStatusCD());
			json2.put("prtyRank", data.getOoptyPrtyRank());
			json2.put("memberType", data.getMemberType());
			json2.put("memberID", data.getMemberID());
			json2.put("campaignId", data.getCampaignId());
			json2.put("eventName", data.getEventName());
			json2.put("subCampaignType", data.getSubCampaignType());
			json2.put("channelType", data.getChannelType());
			json2.put("channelID", data.getChannelID());
			json2.put("emailSubject", data.getEmailSubject());
			json2.put("emailPreview", data.getEmailPreview());
			json2.put("srcCycleNBR", data.getSrcCycleNBR());
			json2.put("wkflwExecnID", data.getWkflwExecnID());
			json2.put("wkflwExecnDT", data.getWkflwExecnDT());
			json2.put("opptyStatus", data.getOpptyStatus());
			json2.put("opptySubStatus", data.getOpptySubStatus());
			json2.put("oDate", data.getODate());
			json2.put("srcWkflwExecnID", data.getSrcWkflwExecnID());
			json.put("requestPayloadData", json2);

			List<AdditionalData> adilist = data.prepareAdditionalData();

			prepareJsonForAddList(adilist, json);
			adilist.clear();

		} catch (JSONException e) {
			e.printStackTrace();
		}

		return json.toString();
	}

	private void prepareJsonForAddList(List<AdditionalData> adilist, JSONObject json) {
		JSONArray facilityInfoArray = new JSONArray();
		JSONArray prescriberInfoArray = new JSONArray();
		JSONArray messageContentInfoArray = new JSONArray();
		JSONArray scriptInfoArray = new JSONArray();
		try {
			for (AdditionalData additionalData : adilist) {
				String sgmntCdLVL2 = additionalData.getSgmntCdLVL2();
				if (sgmntCdLVL2 == null) {
					continue;
				}
				switch (sgmntCdLVL2.trim()) {
				case "patientInfo":
					setPatientInfo(additionalData, json);
					break;
				case "facilityInfo":
					prepareJsonArrayForInfoData(additionalData, facilityInfoArray);
					break;
				case "prescriberInfo":
					prepareJsonArrayForInfoData(additionalData, prescriberInfoArray);
					break;
				case "messageContentInfo":
					prepareJsonArrayForInfoData(additionalData, messageContentInfoArray);
					break;
				case "scriptInfo":
					prepareJsonArrayForInfoData(additionalData, scriptInfoArray);
					break;
				default:
					System.out.println("No Additional Data are available");
				}
			}

			json.put("facilityInfo", facilityInfoArray);
			json.put("prescriberInfo", prescriberInfoArray);
			json.put("messageContentInfo", messageContentInfoArray);
			json.put("scriptInfo", scriptInfoArray);
			facilityInfoArray = null;
			prescriberInfoArray = null;
			messageContentInfoArray = null;
			scriptInfoArray = null;
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	private void prepareJsonArrayForInfoData(AdditionalData additionalData, JSONArray jsonArray) {
		try {
			JSONObject jsonKeyValue = getJsonKeyValue(additionalData);
			jsonArray.put(jsonKeyValue);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	private void setPatientInfo(AdditionalData additionalData, JSONObject json) {
		try {
			JSONObject jsonKeyValue = getJsonKeyValue(additionalData);
			json.put("patientInfo", jsonKeyValue);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	private JSONObject getJsonKeyValue(AdditionalData additionalData) throws JSONException {
		JSONObject json = new JSONObject();
		json.put(additionalData.getAtrbNM1(), additionalData.getAtrbVAL1());
		json.put(additionalData.getAtrbNM2(), additionalData.getAtrbVAL2());
		json.put(additionalData.getAtrbNM3(), additionalData.getAtrbVAL3());
		json.put(additionalData.getAtrbNM4(), additionalData.getAtrbVAL4());
		json.put(additionalData.getAtrbNM5(), additionalData.getAtrbVAL5());
		json.put(additionalData.getAtrbNM6(), additionalData.getAtrbVAL6());
		json.put(additionalData.getAtrbNM7(), additionalData.getAtrbVAL7());
		json.put(additionalData.getAtrbNM8(), additionalData.getAtrbVAL8());
		json.put(additionalData.getAtrbNM9(), additionalData.getAtrbVAL9());
		json.put(additionalData.getAtrbNM10(), additionalData.getAtrbVAL10());

		return json;
	}

}