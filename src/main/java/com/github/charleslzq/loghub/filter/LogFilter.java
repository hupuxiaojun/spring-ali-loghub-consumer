package com.github.charleslzq.loghub.filter;

import com.aliyun.openservices.log.common.Logs;

/**
 * Created by Charles on 3/3/2017.
 */
public interface LogFilter {
	boolean accept(Logs.Log log);
}
