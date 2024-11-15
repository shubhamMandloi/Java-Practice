public class Test 
{ public static void main(String args[]) { String s1 = “Hello”; 
String s2 = “Hello”;
 String s3 = new String(“Good bye”); 
String s4 = new String(“Hello”); 

System.out.println(s1.equals(s2));  // true
System.out.println(s1.equals(s3));  //false
System.out.println(s1.equals(s4)); //true
System.out.println(s1.equals(args)); //false
System.out.println(s1.equals(null)); //false

} }




row 1 : value 1, value 2, value 3
row 2 :  value , value , value 

Program Remove the second highest element from the HashMap. 
map.put("Thirty", 30);
map.put("Ten", 10);
map.put("Twenty", 20);
map.put("FourTwenty", 420);
map.put("one Twenty", 120);

psmv(){
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();

	map.put("Thirty", 30);
	map.put("Ten", 10);
	map.put("Twenty", 20);
	map.put("FourTwenty", 420);
	map.put("one Twenty", 120);
	
	Set<Integer> intSet = new Set<Integer>();
	
	for(Map.Entry<String,Integer> entry : map.EntrySet()){
		
		intSet.add(entry.getValue());
		
	}
	
	Integer value = intSet.get(intSet.size()-2);
	System.out.println(value);
	
	/*-
	TreeMap<Integer,String> result = new TreeMap<Integer,String>();
	for(Map.Entry<String,Integer> entry : map.EntrySet()){
			
			if(result.get(entry.getValue()!=null)
				result.put(entry.getValue(), entry.key());
	
	}
	
	int count= 0;
	Lis
	while(
	
	*/
	
}
