/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anomalia;

/**
 *
 * @author Nos
 */
public interface Humanable {
    static String SciName = "Homo Sapiens";
    String sex(String typeOfSex);
    String eat();
    int countChromosom();
    int countChromosom(int x);
    int countLifeSpan();
    int detectContinent();
}
