package com.example.java19demo.components;


import jdk.incubator.concurrent.StructuredTaskScope;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Component
public class ConcurrencyFeatureComponent {

   public String handle () throws ExecutionException , InterruptedException {

       try  (var scope = new StructuredTaskScope.ShutdownOnFailure()) {

           Future<String>  user  = scope.fork(()->finduser());

           Future<Integer>  order  = scope.fork(()->fetchOrder());

           scope.join();

           scope.throwIfFailed();


           return user.resultNow()+order.resultNow();

        }



    }


    String finduser(){
        return "user is shalash";
    }

    Integer fetchOrder(){
        return 1;
    }
}
