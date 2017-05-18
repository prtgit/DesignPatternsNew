package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeSelector {
	private static Map<String,Tree> treeBySpec= new HashMap<String,Tree>();
	public static Tree getTree(String treeType){
		if(treeBySpec.containsKey(treeType))
			return ____________________; //>> 1. Fill in the Blank
		else{
			Tree tree = null;
			if(treeType.equals("Oak Tree")){
				tree = new OakTree();
				treeBySpec.__________________;//>> 2. Fill in the blank
			}
			else if(treeType.equals("Flowering Cherry")){
				tree = new FloweringCherry();
				treeBySpec.__________________;//>>3. Fill in the blank
			}
			else{
				System.out.println(treeType+" not found ");
			}
			return tree;
				
		}		
	}
}
