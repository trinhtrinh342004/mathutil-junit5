/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.trinhtrinhuit.mathutil.core;

import static com.trinhtrinhuit.mathutil.core.MathUtil.getFactorial;

//dành riêng cho những hàm static
//gọi hàm mà bỏ quên tên class
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Trinh
 */
public class MathUtilTest {
    
    //chơi DDT, tách data ra khỏi câu lệnh kiểm thử, tham số hóa data này
    //vào trong câu lệnh kiểm thử
    
    //chuẩn bị bộ dât
    public static Object[][] initData(){
        return new Integer[][]{
                                    {1, 1},
                                    {2, 2},
                                    {5, 120},
                                    {6, 120},
        };            
    }
    
    @ParameterizedTest
    @MethodSource(value = "initData") //tên hàm cung cấp data, ngầm định các thứ tự của các phần 
    // tử của mảng, map vào phần tử của hàm
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected){
        assertEquals(expected, getFactorial(input));
    }
    
    @Test
    public void testGetFactorialGivenRightArgReturnsWell(){
        assertEquals(120, getFactorial(5));
    }
    
    //bắt ngoại lệ khi đưa data cà chớn
    //@Test (expected = tên ngoại lệ.class)JUnit hoy, JUnit ko làm vậy!!!
    //@Test
    //public void testGetFactorialGivenWrongArgThrowException(){
        //xài biểu thức lambda
        //hàm nhận tham số thứ 2 là 1 cái object/có code implement cái
        //functional interface tên là executable - có 1 hàm duy nhất ko code
        //tên là execute
        //chơi chậm
        
        //Executable exObject = () -> getFactorial(-5);
         
        //assertThrows(IllegalArgumentException.class, exObject );
    //}
}
