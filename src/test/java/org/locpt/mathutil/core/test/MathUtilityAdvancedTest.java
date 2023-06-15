/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.locpt.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.locpt.mathutil.core.MathUtility.*;

/**
 *
 * @author Tan Loc
 */
public class MathUtilityAdvancedTest {

    //hàm trả về mảng 2 chiều gồm nhiều dòng, 2 cột
    // 0 -> 1
    // 1 -> 1
    // 2 -> 2
    // 6 ->720
    // n || expected
    public static Object[][] initTestData() {

        Object testData[][] = { {0, 1},
                                {1, 1},
                                {2, 2},
                                {4, 24},
                                {6, 720}};
        return testData;
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    public void checkFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected,getFactorial(n));
    }
}
// catch exception
// junit 5 đưa ra hàm mới, assertThrow()
// hàm này lại xài lambda expression