package com.nhnacademy;

/**
 * JavaDoc Example class
 *
 * @author yoon
 * @version 1.0
 * @see Example01#printMessage(String)
 */
public class Example01 {

/**
 * message parameter 에 대한 설명.
 */
    private String message = "hello java";

    /**
     * message parameter 를 받아서 console에 출력하는 method
     *
     * @param message consone 출력할 message
     * @see Example01
     * @return message 가 정상출력 되면 true, 실패하면 false 반환
     */
    public boolean printMessage(String message) {
        boolean result = true;
        try{
            System.out.println(message);
        }catch(Exception e){
            result = false;
        }
        return result;
    }
}
