package hoang.hut.controlller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/home")
public class HomeController {

	@RequestMapping(value="", method=RequestMethod.GET)
	public String index(){
		return "home/index";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(){
		return "home/login";
	}
}
