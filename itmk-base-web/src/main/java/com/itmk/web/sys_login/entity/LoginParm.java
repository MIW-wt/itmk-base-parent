package com.itmk.web.sys_login.entity;

import lombok.Data;

/**
 * @author MJW
 * @time 2023/05
 * @PROJECT_NAME itmk-base-parent
 */
@Data
public class LoginParm {
    private String username;
    private String password;
    private String userType;
    private String code;
}
