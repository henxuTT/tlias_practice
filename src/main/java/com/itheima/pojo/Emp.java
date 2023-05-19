package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Short gender; //1 for male 2 for female 3 for others
    private String image; //Image url
    private Short job; // 1 for Manager , 2 Assistant , 3 Assistant , 4 Analyst , 5  Engineer
    private LocalDate enrollDate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

}
