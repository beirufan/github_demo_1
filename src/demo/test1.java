package demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class test1 {
	private static final String[] arr1 =
		{ "V", "B", "E", "0", "L", "i", "l", "j", "D", "1", "3", "S", "7", "P", "T", "5", "Z", "y", "8", "Q", "I", "g", "v", "t", "U", "z", "9", "n", "K", "p", "C", "u", "k", "b", "M", "2", "6", "w",
				"F", "J", "4", "f", "c", "e", "H", "O", "G", "A", "s", "x", "m", "Y", "W", "R", "a", "o", "q", "N", "d", "h", "X", "r" };
	@Test
	public void test1(){
//		System.out.println(arr1.length);
		int i = 9000;
		System.out.println(i++ - --i);
	}
	
	int[] arr2 = {1,2,3,44,3,22,34,12,2,3,4,64,6};
	
	public void selectSort(){
		int temp = 0;
		for(int i=1;i<arr2.length;i++){
			
		}
		
	}
	
	
	public void linkNode(){
		List<Node> nodes = new ArrayList<>();
		nodes.add(new Node(1,2,"node1"));
		nodes.add(new Node(2,3,"node2"));
		nodes.add(new Node(3,4,"node3"));
		nodes.add(new Node(4,5,"node4"));
		nodes.add(new Node(5,6,"node5"));
		
	}
	
}

class Node{
	public int id;
	public int nodeId;
	public String name;
	
	Node(int id,int nodeId,String name){
		this.id = id;
		this.nodeId = nodeId;
		this.name = name; 
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNodeId() {
		return nodeId;
	}
	public void setNodeId(int nodeId) {
		this.nodeId = nodeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}