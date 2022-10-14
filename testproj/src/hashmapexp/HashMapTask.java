package hashmapexp;

import createdexception.CustomException;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapTask {
	public void nullCheck(Object given) throws CustomException {
		if (Objects.isNull(given)) {
			throw new CustomException("the object is null");
		}

	}

	public<K,V> Map<K,V> getHashMap() {
		Map<K,V > map = new HashMap<>(); 
		return map;
	}

	public <K,V> int getLengthHMap(Map<K,V> given)throws CustomException{
		nullCheck(given);
		int length = given.size();
		return length;
	}
	public Map AddStrInputs(Map<String,String> given,String key,String value)throws CustomException{
	nullCheck(given);
	given.put(key, value);
	return given;
	}
	public Map AddIntInputs(Map<Integer,Integer> given,int key,int value)throws CustomException{
		nullCheck(given);
		given.put(key, value);
		return given;
		}
	public Map AddInputs(Map<String,Integer> given,String key,int value)throws CustomException{
		nullCheck(given);
		given.put(key, value);
		return given;
		}
	public Map AddObjInputs(Map<String,Object> given,String key,Object value)throws CustomException{
		nullCheck(given);
		given.put(key, value);
		return given;
		}
	public boolean checkKey(Map<String, String> given, String key)throws CustomException{
		nullCheck(given);
		boolean check = given.containsKey(key);
	return check;
	}
	public boolean checkValue(Map<String, String> given, int checkValue)throws CustomException{
		nullCheck(given);
		boolean check = given.containsValue(checkValue);
	return check;
	}
	public Map replaceMap(Map<String, String> given,String key, String value)throws CustomException{
		nullCheck(given);
		given.replace(key, value);
		return given;
	}
	public Object getKeyValue(Map<String, String> given, String key)throws CustomException{
		nullCheck(given);
		Object output = given.get(key);
		return output;
	}
	public Object getValue(Map<String, String> given, String key)throws CustomException{
		nullCheck(given);
		String zoho= "ZOHO";
		Object output = given.getOrDefault(key,zoho);
	 return output;
	}
	public Map removeObject(Map<String, String> given, String key)throws CustomException{
		nullCheck(given);
		if (checkKey(given,key)) {
		given.remove(key);
		return given;}
		else {
			throw new CustomException("the key is not present in the map");
		}
	}
	public Map removeObjIf(Map<String, String> given, String key, Object value)throws CustomException{
		nullCheck(given);
		if (checkKey(given,key)) {
		given.remove(key, value);
		return given;}
		else {
			throw new CustomException("the key is not present in the map");
		}
	}
	public Map replaceIfValue(Map<String, String> given, String key, String Ovalue,String value)throws CustomException{
		nullCheck(given);
		given.replace(key, Ovalue, value);
		return given;
	}
	public Map mergeMap(Map<String, String> given,Map<String, String> input)throws CustomException{
		nullCheck(given);
		nullCheck(input);
		given.putAll(input);
		return given;
		
	}
	public void iterateMap(Map<String,String> given)throws CustomException{
		nullCheck(given);
	given.forEach((key,value)-> System.out.println("key: "+key+" value:"+value));
		
	}	
	public Map eraseAll(Map<String,String> given)throws CustomException{
		nullCheck(given);
		given.clear();
		return given;
	}
	}
