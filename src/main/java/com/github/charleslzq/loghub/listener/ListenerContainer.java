package com.github.charleslzq.loghub.listener;

import org.springframework.context.SmartLifecycle;

/**
 * Created by liuzhengqi on 2/24/2017.
 */
public interface ListenerContainer extends SmartLifecycle {
    void setListenerRegistry(ListenerRegistry registry);
}
