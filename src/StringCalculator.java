
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
public class StringCalculator {
    
    
    public int add(String numbers) {
        String delimiter = numbers.substring(numbers.indexOf("[") + 1, numbers.indexOf("]"));
        String[] split = numbers.split("\n");
        String tal = split[1];
        String[] nums = tal.split(delimiter);
        System.out.println("Length of nums: " + nums.length);
        System.out.println(delimiter);
        System.out.println(tal);
        int res = 0;
        for (String s : nums) {
            System.out.println(s);
            int r = Integer.parseInt(s);
            if (r < 1000) {
               res += r; 
            }
            
        }
        
        System.out.println(res);
        return res;
        
    };
}
