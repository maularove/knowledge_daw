package com.fpmislata.repaso.a_common.annotion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.transaction.annotation.Transactional;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Transactional
public @interface DomainTransactional {
}
