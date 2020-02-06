package restTemplate;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RestTemplateDemo {

	public static RestTemplate restTemplate;

	@BeforeTest
	public static void setRestTemplate() {
		restTemplate = new RestTemplate();

		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		// Add the Jackson Message converter
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		// Note: here we are making this converter to process any kind of response,
		// not only application/*json, which is the default behaviour
		converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
		messageConverters.add(converter);
		restTemplate.setMessageConverters(messageConverters);

	}

	@Test()
	public void getOrderDetailsByIdString() throws Exception {

		//int userId = 2;
		String userDetailsResourceUrl = "http://dummy.restapiexample.com/api/v1/employees";

			RestTemplate restTemplate1 = new RestTemplate();
		ResponseEntity<Example> response = restTemplate1.getForEntity(userDetailsResourceUrl, Example.class);
      // UserDetails userDetails =  gson.fromJson(response.getBody(), UserDetails.class);
		System.out.println(response.getBody().getStatus());
		System.out.println(response.getBody().getData());
		List<Datum> datumList = response.getBody().getData();
		List<String> employeeNameList = new ArrayList<String>();
		for(Datum datum:datumList) {
			employeeNameList.add(datum.getEmployeeName());
		}
		
		assertTrue(employeeNameList.contains("Cedric Kelly"));
		// assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));

	}

	@Test()
	public void getOrderDetailsById() throws Exception {

		int orderId = 10;
		ResponseEntity<OrderDetails> response = restTemplate.exchange(
				"https://petstore.swagger.io/v2/store/order/" + orderId, HttpMethod.GET, null, OrderDetails.class);

		/*
		 * ResponseEntity<OrderDetails> response1 = restTemplate.exchange(
		 * "https://petstore.swagger.io/v2/store/order/" + orderId, HttpMethod.GET,
		 * null, new ParameterizedTypeReference<OrderDetails>() { });
		 */

		int id = response.getBody().getId();
		System.out.println(id);

		int petId = response.getBody().getPetId();
		System.out.println(petId);

		int quantity = response.getBody().getQuantity();
		System.out.println(quantity);

		String shipDate = response.getBody().getShipDate();
		System.out.println(shipDate);

		String status = response.getBody().getStatus();
		System.out.println(status);

		boolean complete = response.getBody().isComplete();
		System.out.println(complete);

		OrderDetails orderDetails = response.getBody();
		System.out.println(orderDetails);
		// employees.forEach(employee-> System.out.println(employee.getEmployee_age()));
	}

	@Test()
	public void getUserDetails() throws Exception {
		int userId = 2;
		String userDetailsResourceUrl = "https://reqres.in/api/users/";

		UserDetails userDetails = restTemplate.getForObject(userDetailsResourceUrl + userId, UserDetails.class);

		UserDetailsData userDetailsData = userDetails.getUserDetailsData();

		System.out.println(userDetailsData.getId());
		assertThat(userDetailsData.getId(), equalTo(2));
		assertThat(userDetailsData.getAvatar(), notNullValue());
		assertThat(userDetailsData.getFirst_name(), is("Janet"));
	}
}
