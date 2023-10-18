package com.aopIntercaptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Intercaptor
@Interceptor
public class IntercaptorAssl {
    
    @AroundInvoke public Object logger(InvocationContext context) {
        System.out.println("Ilk hali: " + context.getMethod().getName());

        boolean isLogin = true;
        Object isContunie = null;

        if (!isLogin) {

            System.out.println("Evvelce giris edin");
            return null;
        } else {
            try {
                isContunie = context.proceed();  // davam etmesi ucun
                System.out.println("Sonraki hali " + isContunie);
            } catch (Exception e) {
                e.printStackTrace();
            } 
            return isContunie;
        }
    }
}
