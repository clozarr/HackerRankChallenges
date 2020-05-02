package com.clozarr.hackerrank.thirtydaysofcode;


/**
 * <p>
 * Challenge Day 22:  Binary Search Trees
 * </p>
 * 
 * @see <a href= "https://www.hackerrank.com/challenges/30-binary-search-trees/problem">
 *       Binary Search Trees</a>
 * 
 *
 * @author clozarr
 **/
public class Tree {

	public static NodeTree insert(NodeTree root,int data){
        if(root==null){
            return new NodeTree(data);
        }
        else{
            NodeTree cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	
	public static int getHeight(NodeTree root){
        //Write your code here
       
         if(root == null)
             return -1;
        
        return 1+ Math.max(getHeight(root.left),getHeight(root.right));
    }
	
}
