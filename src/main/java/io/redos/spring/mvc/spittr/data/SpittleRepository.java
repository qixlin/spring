package io.redos.spring.mvc.spittr.data;

import io.redos.spring.mvc.spittr.Spittle;

import java.util.List;

/**
 * All rights Reserved, Powered By JIE
 *
 * @author JIE
 * @version 1.0.0
 * @date 2018/5/31 14:16
 * @copyright ©2018
 */
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, int count);
}
