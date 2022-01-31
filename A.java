public class A {
	
	
	public static void main(String[] args) {
		
		
	
		
		List<Integer>list=Arrays.asList(1 , 2, 3, 4, 1, 5, 1, 3);
		
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		
		for(Integer arrInteger:list)
		{
			if(map.containsKey(arrInteger))
			{
				map.put(arrInteger, map.get(arrInteger)+1);
			}
			
			else
			{
				map.put(arrInteger, 1);
			}
		}
		
		System.out.println(map);
		
	}
	

}
