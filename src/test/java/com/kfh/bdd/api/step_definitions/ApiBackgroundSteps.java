package com.kfh.bdd.api.step_definitions;

import java.io.File;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kfh.bdd.integrations.common_utils.ConfigReader;
import com.kfh.bdd.integrations.common_utils.JsonUtils;
import com.kfh.bdd.integrations.common_utils.RestAssuredUtils;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.kfh.bdd.api.base.TestContext;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

/*
 * All API Specifications, Authentications, Headers should be added here in step methods
 */

public class ApiBackgroundSteps {

	private TestContext apiTestContext;

	public ApiBackgroundSteps(TestContext apiTestContext) {
		this.apiTestContext = apiTestContext;
	}

	/*
	 * Method to set up request specification or add header input - Request Headers
	 * as data table
	 */
	@Given("^(?:I set up request specification|I add request headers|I add new headers)$")
	public void setUpSpecification(DataTable dataTable) throws Throwable {
		List<Map<String, String>> table = dataTable.asMaps();
		Map<String, String> HeaderMaps = new HashMap<String, String>();
		for (int row = 0; row < table.size(); row++) {
			HeaderMaps.put(table.get(row).get("HeaderName"), table.get(row).get("HeaderValue"));
		}
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.headers(HeaderMaps);
	}

	/*
	 * Method to set up request specification or add header input - Request cookies
	 * as data table
	 */
	@And("^I set cookies$")
	public void setCookies(DataTable dataTable) {
		List<Map<String, String>> table = dataTable.asMaps();
		Map<String, String> cookieMaps = new HashMap<String, String>();
		for (int row = 0; row < table.size(); row++) {
			cookieMaps.put(table.get(row).get("cookieName"), table.get(row).get("cookieValue"));
		}
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.cookies(cookieMaps);
	}

	@And("^I add basic authentication$")
	public void setBasicAuthentication(String username, String password) {
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}

		apiTestContext.getApiTestBase().specification.auth().preemptive().basic(username, password);
	}

	@And("^I add digest authentication$")
	public void setDigestAuthentication(String username, String password) {
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.auth().digest(username, password);

	}

	@And("^I add oauth2 authentication \"([^\"]*)\"$")
	public void setOauth2Authentication(String accessToken) {
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.auth().oauth2(accessToken);
	}

	@And("I Set Up Authorization Token")
	public void setUpToken() throws Throwable {

		Map<String, String> HeaderMaps = new HashMap<String, String>();

		String token = "JWT" + ConfigReader.getValue("AuthorizationToken");
		HeaderMaps.put("Authorization", token);
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.headers(HeaderMaps);

	}

	@And("I Set Up Authorization Token with chain value")
	public void setUpTokenWithChainValue() throws Throwable {

		Map<String, String> HeaderMaps = new HashMap<String, String>();

		String token = "JWT " + ApiRequestModificationSteps.str_data;
		HeaderMaps.put("Authorization", token);
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.headers(HeaderMaps);

	}

	@And("I Set Up Invalid Authorization Token")
	public void setUpInvalidToken() throws Throwable {

		Map<String, String> HeaderMaps = new HashMap<String, String>();

		String invalidToken = ConfigReader.getValue("InvalidAuthorizationToken");
		HeaderMaps.put("Authorization", invalidToken);
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.headers(HeaderMaps);
	}

	@And("I Set Up Authorization Token Create Payment")
	public void setUpCreatePaymentToken() throws Throwable {

		Map<String, String> HeaderMaps = new HashMap<String, String>();

		String createPaymentToken = ConfigReader.getValue("AuthorizationTokenCreatePayment");
		HeaderMaps.put("Authorization", createPaymentToken);
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.headers(HeaderMaps);
	}

	@And("I Set Up Authorization Token Account Access")
	public void setUpAccountAccessToken() throws Throwable {

		Map<String, String> HeaderMaps = new HashMap<String, String>();

		String accountAccessToken = ConfigReader.getValue("AuthorizationTokenAccountAccess");
		HeaderMaps.put("Authorization", accountAccessToken);
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.headers(HeaderMaps);
	}

//	@When("I Set UP Base Uri for Staging1 url")   
//	public void baseUri1() throws Throwable {
//     RestAssuredUtils.baseURI="https://api-qa-runway.nprod.incred.com";
//       
//   }
//	
//	@When("I Set UP Base Uri for Staging2 url")
//    public void baseUr2() throws Throwable {
//    RestAssuredUtils.baseURI="https://staging.vyaparapp.in/";
//        
//    }

	@And("I set cookies using {string} name jpath and {string} value jpath from {string} file")
	public void setCookiesUsingJsonFile(String nameJPath, String valueJPath, String fileName) {

		Configuration configuration = Configuration.builder().build();
		File json = new File("./ResponseStore/" + fileName + ".json");
		String responseBody;
		try {
			responseBody = JsonPath.using(configuration).parse(json).jsonString();
			System.out.println(responseBody);
			Map<String, String> cookieMaps = new HashMap<String, String>();
			String cookieName = String.valueOf(JsonUtils.getJSonObjectValue(responseBody, nameJPath));
			String cookieValue = String.valueOf(JsonUtils.getJSonObjectValue(responseBody, valueJPath));
			cookieMaps.put(cookieName, cookieValue);

			if (apiTestContext.getApiTestBase().specification == null) {
				apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
			}
			apiTestContext.getApiTestBase().specification.cookies(cookieMaps);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// naga - setting up cookie
	@And("I set the sign in cookie for request")
	public void setCookiesUsingFile() {
		if (apiTestContext.getApiTestBase().specification == null) {
			apiTestContext.getApiTestBase().specification = RestAssuredUtils.getSpec().build();
		}
		apiTestContext.getApiTestBase().specification.cookies(APIResponseValidationSteps.signInCookie);
	}

	// API Valid URI
	@Given("I set up valid URI specification")
	public void ValidURI() throws Throwable {
		RestAssuredUtils.baseURI = ConfigReader.getValue("APIbaseURI");
	}

	// API Invalid URI
	@Given("I set up invalid URI specification")
	public void InvalidURI() throws Throwable {
		RestAssuredUtils.baseURI = ConfigReader.getValue("APIbaseInvalidURI");
	}

}
