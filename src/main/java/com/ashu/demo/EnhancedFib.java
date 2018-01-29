package com.ashu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnhancedFib {


    @RequestMapping("/fibendnumber")
    public String showFib(@RequestParam("number") String number){
        int inputNumber = Integer.parseInt(number);
        StringBuilder sb = new StringBuilder(" ");

        while(inputNumber>=0){
            ;
            sb.append(" " +fib(inputNumber));
            inputNumber--;
        }

        return  sb.toString();



    }

    public int fib(int number){
        if(number==0){
            return 0;
        }
        else if(number==1){
            return 1;
        }
        else if(number ==2){
            return 2;
        }else  if(number==3){
            return  3;
        }

        else{
            return fib(number-4)+fib(number-3)+fib(number-2)+fib(number-1);

        }


    }

}
