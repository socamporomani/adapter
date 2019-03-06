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
public class AVI implements MediaPackage{

    @Override
    public void playFile(String filename) { //definimos el metodo play
        System.out.println("Playing AVI File " + filename);//sacamos por pantalla
    }
}
