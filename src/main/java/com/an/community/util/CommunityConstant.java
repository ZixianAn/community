package com.an.community.util;

public interface CommunityConstant {

    /*
    * 激活成功
    * */
    int ACTIVATION_SUCCESS = 0;

    /*
    * 重复激活
    * */
    int ACTIVATION_REPEAT = 1;

    /*
    * 激活失败
    * */
    int ACTIVATION_FAILURE = 2;

    /*
    * 默认状态的登录凭证的超时时间
    * */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    /*
    * 记录状态的登录凭证超时时间
    * */
    int REMEMBER_EXPIRED_SECONDS = 3600 * 24 * 100;
}
