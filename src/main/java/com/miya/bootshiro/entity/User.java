package com.miya.bootshiro.entity;

import lombok.Data;

/**
 * @DESC
 * @Author:Caixiaowei
 * @Date:2019/1/8
 * @Time:下午3:48
 */
@Data
public class User {
    /** 自增ID */
    private Long id;
    /** 账号 */
    private String username;
    /** 密码 */
    private String password;
    /** 角色名：Shiro 支持多个角色，而且接收参数也是 Set<String> 集合，但这里为了简单起见定义成 String 类型了 */
    private String roleName;
    /** 是否禁用 */
    private boolean locked;

    public User(Long id, String username, String password, String roleName, boolean locked) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roleName = roleName;
        this.locked = locked;
    }


}
