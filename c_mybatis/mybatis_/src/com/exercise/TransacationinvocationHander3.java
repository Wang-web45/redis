package com.exercise;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author LX
 * @Time 2021/7/15
 **/
public class TransacationinvocationHander3 implements InvocationHandler {
    private Object object;

    public TransacationinvocationHander3(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        SqlSession session=null;
        Object obj=null;
        try{
            session=SqlSessionutlis3.getSession();
            obj=method.invoke(object,args);
            session.commit();

        }catch (Exception e){
            session.rollback();
            e.printStackTrace();
        }finally {
            SqlSessionutlis3.closeSession(session);
        }
        return obj;
    }
    public  Object getproxy(){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),
                this);
    }
}
