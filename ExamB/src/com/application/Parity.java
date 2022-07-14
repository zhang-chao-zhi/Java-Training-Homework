package com.application;

public class Parity {
    public int Count(char[] number){
        int count = 0;
        for(int j = 0; j < number.length; j++){
            if(number[j] == '1'){ count += 1; }
        }
        return count;
    }
    public int Judge(int count){
        int number;
        if(count % 2 == 0){ number = 0; }else{ number = 1; }
        return number;
    }
}
