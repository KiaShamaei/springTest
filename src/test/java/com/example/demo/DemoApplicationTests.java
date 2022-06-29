package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class DemoApplicationTests {
Calculater clac = new Calculater();
    @Test
    void contextLoads() {
    }
    @Test
    void addition(){
        //given
        int number1 = 12 ;
        int number2 = 10 ;
        //when
        int result = clac.add(number1, number2);
        //then
        int expected = 22;
        assertEquals(expected , result);
    }



    class Calculater {
        public int add(int a , int b){
            return a+b;
        }
    }

}
