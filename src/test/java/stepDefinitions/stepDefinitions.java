package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class stepDefinitions {

    private Response response;
    private String baseUri = "https://userserviceapi-a54ceee3346a.herokuapp.com/uap";
    protected String username = "Numpy@gmail.com";
    protected String password = "userapi123";
    public int userId;
    public int userCount;

   
    @When("I send a GET request to the {string} endpoint")
    public void i_send_a_get_request_to_the_endpoint(String string) {
    	 response = given().auth().basic(username, password).when().get(baseUri + "/users");
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user details should be returned")
    public void the_user_details_should_be_returned() {
        Assert.assertEquals(response.getStatusCode(), 200);
        userCount = response.jsonPath().getList("users").size();
        System.out.println("Total Number of users: " + userCount);
        System.out.println("-----------------------------------------------------------------------------------------------------------");
        // Further validation can be added to check the response body
    }

    /*
    @Given("I have the necessary data to create a user with {string}, {string}, {string}, {string}, and user address {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_have_the_necessary_data_to_create_a_user_with_and_user_address(String user_first_name, String user_last_name, String user_contact_number, String user_email_id, String plotNumber, String street, String city, String state, String country, String zipCode) {
        requestParams = new JSONObject();
        requestParams.put("firstName", user_first_name);
        requestParams.put("lastName", user_last_name);
        requestParams.put("contactNumber", user_contact_number);
        requestParams.put("emailId", user_email_id);

        JSONArray addressArray = new JSONArray();
        JSONObject addressObject = new JSONObject();
        addressObject.put("plotNumber", plotNumber);
        addressObject.put("street", street);
        addressObject.put("city", city);
        addressObject.put("state", state);
        addressObject.put("country", country);
        addressObject.put("zipCode", zipCode);
        addressArray.add(addressObject);

   //     requestParams.put("address", addressArray);

   //     response = given()
    //                .header("Content-Type", "application/json")
    //                .body(requestParams.toJSONString());
  //  }

    @When("I send a POST request to the \"/createusers\" endpoint")
    public void i_send_a_post_request_to_the_createusers_endpoint() {
     //   response = response.when().post(baseUri + "/createusers");
        userId = response.jsonPath().getInt("id");
    }

    @Then("the user should be created and the userID should be stored")
    public void the_user_should_be_created_and_the_userid_should_be_stored() {
        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertNotNull(userId);
    }

    @When("I send a GET request to the \"/user/{userID}\" endpoint")
    public void i_send_a_get_request_to_the_user_userid_endpoint() {
        response = given().when().get(baseUri + "/user/" + userId);
    }

    @Given("I have the necessary data to update the user with {string}, {string}, {string}, {string}, and user address {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_have_the_necessary_data_to_update_the_user_with_and_user_address(String updatedFirstname, String updatedLastname, String updatedContactNumber, String updatedEmailid, String updatedAddress, String updatedStreet, String updatedCity, String updatedState, String updatedCountry, String updatedZipCode) {
        requestParams = new JSONObject();
        requestParams.put("firstName", updatedFirstname);
        requestParams.put("lastName", updatedLastname);
        requestParams.put("contactNumber", updatedContactNumber);
        requestParams.put("emailId", updatedEmailid);

        JSONArray addressArray = new JSONArray();
        JSONObject addressObject = new JSONObject();
        addressObject.put("plotNumber", updatedAddress);
        addressObject.put("street", updatedStreet);
        addressObject.put("city", updatedCity);
        addressObject.put("state", updatedState);
        addressObject.put("country", updatedCountry);
        addressObject.put("zipCode", updatedZipCode);
        addressArray.add(addressObject);

        requestParams.put("address", addressArray);

        response = given()
                    .header("Content-Type", "application/json")
                    .body(requestParams.toJSONString());
    }

    @When("I send a PUT request to the \"/updateuser/{userID}\" endpoint")
    public void i_send_a_put_request_to_the_updateuser_userid_endpoint() {
        response = response.when().put(baseUri + "/updateuser/" + userId);
    }

    @Then("the user should be updated")
    public void the_user_should_be_updated() {
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @When("I send a DELETE request to the \"/deleteuser/{userID}\" endpoint")
    public void i_send_a_delete_request_to_the_deleteuser_userid_endpoint() {
        response = given().when().delete(baseUri + "/deleteuser/" + userId);
    }

    @Then("the user should be deleted")
    public void the_user_should_be_deleted() {
        Assert.assertEquals(response.getStatusCode(), 204);
    }
    */
}
