package gic.i4gic.foodcourtsystem;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	@GetMapping("/")
	public String index(@RequestParam("username") String username,
			@RequestParam(name="age",defaultValue="25") int age ) {
		return String.format( "<h1>Hello %s</h1> <p>you are %d year old</p>", username, age);
	}
}
