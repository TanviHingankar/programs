import java.util.HashMap;
class HashMap1
{
	public static void main(String args[])
	{
		HashMap<Integer, String> map=new HashMap<>();

		map.put(1,"Tanvi");
		map.put(2,"Rutuja");
		map.put(3,"Pratik");
		map.put(4,"Anu");

		for(Integer key: map.keySet()){

		System.out.println(key+" "+map.get(key));
	  }
	}
}