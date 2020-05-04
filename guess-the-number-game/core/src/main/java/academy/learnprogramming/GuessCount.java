package academy.learnprogramming;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// indicates a context in which annotation type is applicable, so this annotation can be added to fields, param and methods
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})

// indicates how long the annotation type are to be retained
@Retention(RetentionPolicy.RUNTIME)

// used to annotate other custom annotations
@Qualifier
public @interface GuessCount {
}
