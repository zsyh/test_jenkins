package com.zsyhh.hellojenkins.bean;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    String name;
    int id;
}
