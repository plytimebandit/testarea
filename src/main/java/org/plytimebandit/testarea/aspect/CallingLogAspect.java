package org.plytimebandit.testarea.aspect;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
public class CallingLogAspect {

    @Before("@annotation(org.plytimebandit.testarea.aspect.CallingLog)")
    public void logCall(JoinPoint joinPoint) {
        if (joinPoint == null) {
            return;
        }

        if (StringUtils.equals(JoinPoint.METHOD_CALL, joinPoint.getKind())) {
            System.out.println(
                    new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date())
                            + " Method Call '" + joinPoint.getSignature() + '\''
            );
        }
    }

}
