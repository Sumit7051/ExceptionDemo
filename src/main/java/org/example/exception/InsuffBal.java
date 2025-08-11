package org.example.exception;

public class InsuffBal extends RuntimeException{
    private String msg;


    public InsuffBal(String message ) {
        super(message);
        this.msg = message;
    }

//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
}
