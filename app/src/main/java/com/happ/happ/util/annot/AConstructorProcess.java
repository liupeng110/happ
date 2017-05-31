package com.happ.happ.util.annot;


import android.util.Log;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by byhieg on 17/2/14.
 * Mail to byhieg@gmail.com
 */
public class AConstructorProcess {

    public static void init(Object object) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        if (object instanceof User) {
            Class clz = object.getClass();
            Constructor [] constructors = clz.getConstructors();
            for (Constructor constructor : constructors) {
                if (constructor.isAnnotationPresent(AConstructor.class)) {
                    AConstructor aConstructor = (AConstructor) constructor.getAnnotation(AConstructor.class);
                    String name = aConstructor.initName();
                    int age = aConstructor.initAge();
                    ((User) object).name = name;
                    ((User) object).age = age;

                }
            }
            Log.i("AConstructorProcess","name:"+((User) object).name);
            Log.i("AConstructorProcess","age:" +((User) object).age);
        }else{
            throw new RuntimeException("无法向下转型到指定类");
        }

    }
}
