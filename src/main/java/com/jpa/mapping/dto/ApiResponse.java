package com.jpa.mapping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ApiResponse {

    private HttpStatus status;
    private String msg;
    private Object data;

    public ApiResponse(String msg, HttpStatus status) {
        super();
        this.msg = msg;
        this.status = status;
    }

}
