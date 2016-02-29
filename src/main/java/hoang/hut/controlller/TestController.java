package hoang.hut.controlller;

import hoang.hut.model.request.RequestLoginDto;
import hoang.hut.model.response.ResponseTokenDto;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping (value="/test")
public class TestController {

	@RequestMapping(value="/login", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseTokenDto sum(@RequestBody RequestLoginDto requestLogin){
		return new ResponseTokenDto();
	}
}
