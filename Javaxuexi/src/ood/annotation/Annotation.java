package ood.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
//自定义注解
@Retention(RUNTIME)
@Target(FIELD)
public @interface Annotation {
		public String name() default "add";
}
	