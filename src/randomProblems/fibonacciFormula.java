/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomProblems;

/**
 *
 * @author nazrul
 */
public class fibonacciFormula {
    public static void main(String[] args) {
         final double pi=1.618033989;
        int nTh=4;
//      double Fn=((Math.pow(pi, nTh)+Math.pow((1-pi), nTh))/Math.sqrt(5));
        double Fn=(Math.pow(pi, nTh)/Math.sqrt(5));
        System.out.println(Math.round(Fn));
//        System.out.println(Fn);
    }
}
