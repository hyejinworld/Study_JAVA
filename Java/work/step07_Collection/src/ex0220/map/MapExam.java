package ex0220.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExam {
//	Map<Integer, String> map = new HashMap<Integer, String>();
	Map<Integer, String> map = new TreeMap<Integer, String>(); //키가 정렬된다. 
				
	public MapExam() {
//map 추가 
		map.put(20,"후이");
		map.put(30,"샤오");
		map.put(50,"레이");
		map.put(30,"샹샹");
		map.put(70,"화니");
		
		System.out.println("저장된 개수 =" +map.size());
		//map은 덮어씌어진다. 
		System.out.println("map =" + map.toString());
		
		//모든 key의 정보를 가져원다. 
		Set<Integer> keySet = map.keySet();//모든 key정보를 set저장
		Iterator<Integer> it = keySet.iterator(); //key를 꺼낼 수 있는 준비
		
		while(it.hasNext()) { //hasnext가 true일때 next를 꺼낸다.  
			int key = it.next(); //요소를 꺼낸다.
			String value = map.get(key); //꺼낸 key에 해당하는 value 조회
			System.out.println(key + "과(와)"+ value);
		}
		
		//개선된 for문 작성
		
		System.out.println("--개선된 for문 사용");
		
		for(Integer key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key +"와" +value);
			
		}
		
		System.out.println("Entry 엔트리 형태로 조회하기");
		Set<Entry<Integer, String>> set = map.entrySet();
	    	//System.out.println(set);
	for(Entry<Integer, String> e: set) {
		System.out.println(e.getKey()+"=" + e.getValue());
		
	}
	//삭제 
	map.remove(70);
	System.out.println("삭제 후 " +map);
	}
	
	public static void main(String[] args) {
		new MapExam();
	}

}
