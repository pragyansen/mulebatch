package mapper;

import mymule.ResultMap;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaJson {


	public String jsonMapper(ResultMap payload) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		payload.setId(null);

		return mapper.writeValueAsString(payload);

	}
}
