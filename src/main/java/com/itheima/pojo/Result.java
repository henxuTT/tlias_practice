package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private Integer code; // 1 for success 0 for failure
    private String msg; // response message
    private Object data; // response data


    public static Result success(){

        return new Result(1, "success", null);
    }
    //add/delete/update success response

    public static Result success(Object data){
        return new Result(1, "success", data);
    }
    //query success response

    public static Result error(String msg){
        return new Result(0, msg, null);
    }
    //failure response

}
