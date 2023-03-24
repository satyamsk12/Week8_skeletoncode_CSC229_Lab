/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time 
        
    boolean[] isPrime = new boolean[n+1];
    Arrays.fill(isPrime, true);
    long sum = 0;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (isPrime[i]) {
            for (int j = i*i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }
    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) {
            sum += i;
        }
    }
    return sum;
} 
        
        
        // The time complexity of this algorithm is O(n log log n)
           The space complexity is O(n)
        
    
    }
    
}
