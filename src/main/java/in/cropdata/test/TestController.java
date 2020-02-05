/**
 * 
 */
package in.cropdata.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Vivek Gajbhiye - Cropdata
 *
 * 30-Jan-2020
 */
@RestController
public class TestController {
	
	@Value("${test.word}")
	String test;
	
	@GetMapping("/test")
	public String test() {
		return test;
	}

}
