/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import static blockchain.full_block.blockchain;
import java.util.ArrayList;

/**
 *
 * @author salkh
 */
public class Blockchain {
  
  public static int difficulty = 6;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
                // Adding the data to the ArrayList
        blockchain.add(new full_block("First block", "0"));
        blockchain.add(new full_block( "Second block", blockchain.get(blockchain.size() - 1).hash));
 
        blockchain.add(new full_block( "Third block", blockchain.get(blockchain.size() - 1).hash));
    //   blockchain.get(0).mineBlock(difficulty);
       String block1= blockchain.get(1).get_full_block();
       
        System.out.println(block1);
        System.out.println(blockchain.get(1).BlocksExplorer());
     
  
       // blockchain.get(blockchain.size());
    }
}
