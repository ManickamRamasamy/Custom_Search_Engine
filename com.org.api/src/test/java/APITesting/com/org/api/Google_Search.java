package APITesting.com.org.api;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.given;

import java.util.Scanner;

import org.json.simple.JSONObject;
import org.mozilla.javascript.tools.shell.ConsoleTextArea;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBodyData;
import com.jayway.restassured.response.ResponseBodyExtractionOptions;

public class Google_Search {
	
@Test

public void Google_search() {
	
	Scanner cse = new Scanner(System.in);
	System.out.println("\nEnter your Custom search Engine id created using Google Console:\n");
	String cseid = cse.next();
	
	Scanner cs = new Scanner(System.in);
	System.out.println("\nEnter your content to search: \n");
	String content = cs.next();
	
	Response resp = given().parameter("key","AIzaSyBZgxDr7DAjp1cnIl9LoEOwiPR52uG728U").
					parameter("cx",cseid).
					parameter("q",content).then().
					get("https://www.googleapis.com/customsearch/v1");
	

	
	System.out.println("Result: \n" + resp.asString());
	
}

}
