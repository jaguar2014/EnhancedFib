package com.ashu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnhancedFib {



    @RequestMapping("/fibendnumber")
    public String showFib(@RequestParam("number") String number){
        int inputNumber = Integer.parseInt(number);
        int counter=0;
        StringBuilder sb = new StringBuilder(" ");
        while(true){

            sb.append(" " +fib(counter));
            counter++;
            if(counter>inputNumber) break;
        }

        return  sb.toString();



    }

    private  int fib(int number){
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
