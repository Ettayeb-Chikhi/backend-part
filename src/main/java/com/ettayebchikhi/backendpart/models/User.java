package com.ettayebchikhi.backendpart.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private  String name;
    private String email;
    private Integer age;
    public String csvRepresentation(){
        return id+","+name+","+age+","+email;
    }
}
