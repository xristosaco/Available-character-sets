/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testkati;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import sun.reflect.generics.tree.Tree;

/**
 *
 * @author xristos
 */
public class Testkati {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("List of available character sets: ");
        for(String str : Charset.availableCharsets().keySet()){
            System.out.println(str);}
            
    } 
    }

