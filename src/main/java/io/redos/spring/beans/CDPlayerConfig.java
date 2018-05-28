package io.redos.spring.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/28 16:35
 * @copyright ©2018
 */
@Configuration
//@ComponentScan(basePackages = {"io.redos.spring.beans"})
@ComponentScan(basePackageClasses = {SgtPeppers.class})
public class CDPlayerConfig {

}
