	package com.manulife.ap.steps;

import java.io.IOException;
import java.util.HashMap;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.qmetry.qaf.automation.rest.RestRequestBean;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.step.QAFTestStepProvider;
import com.qmetry.qaf.automation.step.WsStep;
import com.sun.jersey.api.client.ClientResponse;

@QAFTestStepProvider
public class webServiceSteps {

	@SuppressWarnings("unchecked")
	@QAFTestStep(description="user requests with json data {0}")
	public static ClientResponse userResuestsWithJsonData(Object data){
		System.out.println(data.getClass());
		JsonObject jsonObject = new Gson().toJsonTree(data).getAsJsonObject();
		HashMap<String, Object> result;
		try {
			result = new ObjectMapper().readValue(jsonObject.toString(), HashMap.class);
			System.out.println(jsonObject.toString());
			RestRequestBean bean = new RestRequestBean();
			bean.fillData(jsonObject.toString());
			bean.resolveParameters(result);
			return WsStep.request(bean);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
