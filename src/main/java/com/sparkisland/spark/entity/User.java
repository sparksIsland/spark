package com.sparkisland.spark.entity;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String user_name;
    private String pass_word;
    private String nick_name;
    private String email;
    private String phone;
    private String address;
    private String create_time;

}
