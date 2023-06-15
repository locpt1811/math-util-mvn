/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.locpt.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.locpt.mathutil.core.MathUtility;

/**
 *
 * @author Tan Loc
 */
public class MathUtilityTest {
    
        @Test
        public void checkFactorialGivenRightArgumentReturnsWell(){
            assertEquals(1,MathUtility.getFactorial(0));
            assertEquals(1,MathUtility.getFactorial(1));
            assertEquals(2,MathUtility.getFactorial(2));
            assertEquals(24,MathUtility.getFactorial(4));
            assertEquals(720,MathUtility.getFactorial(6));
        }
  }

//KIẾN THỨC MỚI: DDT
//               DDT: Data Driven Testing
//               Kĩ thuật viết code kiểm thử của UnitTest
//               mà tách phần data ra khỏi câu lệnh assertE()
//
//Viết các test case hướng về việc tách data test ra riêng biệt
//KO NHẦM LẪN VỚI KĨ THUẬT TDD: Test Driven Development
//test case để dảm bảo hàm/method/class chạy ngon

//TDD: viết code chính và code test/test case đan xen đẻ check hàm đúng sai

//DDT: trong quá trình viết code test, tách data test ra riêng 1 chỗ
//                                          cho dễ đọc, bảo trì

//DDT là nằm trong TDD

//TDD: TEST DRIVEN DEVELOPMENT: là kĩ thuật dành cho dân dev 
//              nói về việc viết code chính cần phải được kiểm tra ngay về chất lượng
//              nên viết code chính đan xen, xen kẽ cùng với việc thiết kế
//              các test case để test code chính
//              Lập trình mà viết code chính và code test (JUnit, Unit Test)
//              đan xen xen kẽ nhau gọi là TDD
//              VIẾT CODE HƯỚNG THEO VIỆC KIỂM THỬ

//DTT: DATA DRIVEN TESTING: là kĩ thuật mở rộng, bổ sung thêm cho
//      TDD trong đó việc viết code test được tách riêng ra so với test
//      data nghĩa là 1 bộ dữ liệu test thường được đặt để ở 1 mảng 2 chiều
//      hoặc để ở table, file txt, Excel sau đó được nhồi/fill/map vài trong
//              câu lệnh kiểm thử !!
//      Việc data tách riêng ra, sau đó fill trở lại hàm so sánh qua tên biến
//      biến thì DDT còn được gọi là PARAMETERIZED TESTING