package mapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import mymule.DataMap;



public class JsonJava {

	@SuppressWarnings("unchecked")
	public List<DataMap> jsonMapper(String payload) throws JsonParseException, JsonMappingException, IOException{
		System.out.println("Printed");
		System.out.println(payload);
		ObjectMapper mapper = new ObjectMapper();
		List<DataMap> map = null;
		map = mapper.readValue(payload, mapper.getTypeFactory().constructCollectionType(List.class, DataMap.class));
		return map;
		
	}
	
/*	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException{
		String d = "[ { \"_id\" : { \"$oid\" : \"566b26bcc7ed1980d56de2f0\"} , \"name\" : \"Pragyan\" , \"title\" : \"MySqlDB\"} , { \"_id\" : { \"$oid\" : \"566b26bfc7ed1980d56de2f1\"} , \"name\" : \"Pragyan\" , \"title\" : \"MongoDB\"}]";
		String d2 = " { \"_id\" : { \"$oid\" : \"566b26bcc7ed1980d56de2f0\"} , \"name\" : \"Pragyan\" , \"title\" : \"MySqlDB\"} ";
		ObjectMapper mapper = new ObjectMapper();
		List<DataMap> map = null;
		map = mapper.readValue(d, mapper.getTypeFactory().constructCollectionType(List.class, DataMap.class));
		DataMap map1 = new DataMap();
		map1.setName("Pragyan");
		map1.setTitle("MongoDB");
		DataMap map2 = new DataMap();
		map2.setName("Pragyan");
		map2.setTitle("MySQLDB");
		List<DataMap> list = new ArrayList<DataMap>();
		list.add(map1);
		list.add(map2);
		System.out.println(mapper.writeValueAsString(list));

	}*/
}
