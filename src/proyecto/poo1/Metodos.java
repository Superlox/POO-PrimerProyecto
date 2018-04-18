/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo1;

import java.util.ArrayList;

/**
 *
 * @author marco
 */
public class Metodos {
    public ArrayList<Integer> reverse(ArrayList<Integer> list) {
    for(int i = 0, j = list.size() - 1; i < j; i++) {
        list.add(i, list.remove(j));
    }
    return list;
}
    
}
