package hoang.hut.controlller;

import hoang.hut.model.request.RequestLoginDto;
import hoang.hut.model.response.ResponseTokenDto;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping (value="/test")
public class TestController {

	@RequestMapping(value="/login", method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String sum(@RequestBody String requestLogin){
		RequestLoginDto pj = new RequestLoginDto();
	    ObjectMapper mapper = new ObjectMapper();
	    try {
			pj = mapper.readValue(requestLogin, RequestLoginDto.class);
			return mapper.writeValueAsString(pj);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			return mapper.writeValueAsString(new ResponseTokenDto());
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
