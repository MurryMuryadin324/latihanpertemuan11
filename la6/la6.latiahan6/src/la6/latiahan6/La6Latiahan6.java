/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la6.latiahan6;

/**
 *
 * @author Muryy
 */
public class La6Latiahan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         outerLoop:  
 
       for( int i=0; i<5; i++ ){ 
 
 
 
        for( int j=0; j<5; j++ ){ 
 
         System.out.println("Inside for(j) loop"); //message1 
 
         if( j == 2 )  continue outerLoop; 
 
        } 
 
 
                 System.out.println("Inside for(i) loop"); //message2 
 
       } 
    }
    
}
