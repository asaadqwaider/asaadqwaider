/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author salkh
 */
public class full_block {

    
        // Every block contains
    // a hash, previous hash and
    // data of the transaction made
    public String hash;
    public String previousHash;
    private String data;
    private long timeStamp;
     private int nonce;
    public static ArrayList<full_block> blockchain= new ArrayList<full_block>();
     
   public String get_full_block( ){
   
   return  " hash "+ hash 
           +" previousHash "+previousHash
           + "data " +data+
           " timeStamp "+timeStamp;
   }
   
   public List<full_block> BlocksExplorer ()  {
     
		return blockchain;
	
    }
   
   
           
 
    // Constructor for the block
    public full_block(String data, String previousHash)
    {
        this.data = data;
        this.previousHash= previousHash;
        this.timeStamp= new Date().getTime();
        this.hash= calculateHash();
    }
    

   
    // Function to calculate the hash
    public String calculateHash()
    {
        // Calling the "crypt" class
        // to calculate the hash
        // by using the previous hash,
        // timestamp and the data
        String calculatedhash
            = crypt.sha256(
                previousHash
                + Long.toString(timeStamp)
                + data);
   
        return calculatedhash;
    }
    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0" 
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }
    
}
