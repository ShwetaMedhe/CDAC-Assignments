package com.demo.test;

import com.demo.hashing.MyHashTable;

public class TestMyHashTable {

	public static void main(String[] args) {	
		MyHashTable ht=new MyHashTable(5);
		ht.insertData(34);
		ht.insertData(6);
		ht.insertData(23);
		ht.insertData(30);
		ht.insertData(24);
        ht.displayHashTable();
        
        ht.searchData(50);
        ht.searchData(6);
        
	}

}
