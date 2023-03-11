package com.xy.behaivoral.observer.eventbus.google;

import com.google.common.collect.Lists;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.EventBus;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * 用户登录模式
 *
 * @author xiaoyi
 * Created on 2023/3/11.
 */
public class UserController {

    private EventBus eventBus;

    private static final int DEFAULT_EVENT_BUS_THREAD_POOL_SIZE = 20;

    public UserController() {
//        this.eventBus = new EventBus();
        this.eventBus = new AsyncEventBus(Executors.newFixedThreadPool(DEFAULT_EVENT_BUS_THREAD_POOL_SIZE));
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public String register(String phone, String password) {
        // 注册逻辑
        // userService.register(phone, password);

        // 注册完成后事件通知
        eventBus.post(phone);
        return phone;
    }




    public static void main(String[] args) throws InterruptedException {
        UserController controller = new UserController();


        controller.setRegObservers(Lists.newArrayList(new RegPromotionObserver()));

        String register = controller.register("123", "123");

        Thread.sleep(100);
        System.out.println(register);
    }
}
