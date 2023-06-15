/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.locpt.mathutil.core;

/**
 *
 * @author Tan Loc
 */
// class này sẽ mô phỏng, clone lại cái class java.util.Math
// huyền thoại, mà bên trong có cá hàm static nổi tiếng
// Math.sqrt() Math.sin() Math.random()
public class MathUtility {
    
    public static final double PI = 3.14;
    
    
    /*
    hàm tính n! = 1.2.3....n
    thiết kế:
    0! = 1! = 1
    không có âm giai thừa. Nếu đưa -1!, -5!,... ném ngoại lệ
    giai thừa tăng rất nhanh nên 20! là vừa đủ cho kiểu dữ liệu long
    21! kiểu long không chứa nổi
    --> Hàm chỉ cho phép 0 =< n =< 20 
        n > 20 --> exception
    */
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0...20, please!!!!");
        
        if(n == 0 || n == 1)
            return 1;
        
        long product =1; // tich cac bien 
        
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }
}
