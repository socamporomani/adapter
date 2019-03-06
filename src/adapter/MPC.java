/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author r618b
 */
public class MPC implements MediaPackage {

   @Override
    public void playFile(String filename) {//definimos metodo play
        System.out.println("Playing MPC File " + filename);//sacamos por pantalla
    }
    
}
