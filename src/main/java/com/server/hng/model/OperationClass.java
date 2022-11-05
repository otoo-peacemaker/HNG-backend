package com.server.hng.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class OperationClass {


    private Operands operation_type;
    private  int x;
    private  int y;


    public OperationClass(Operands operation_type, int x, int y) {
        this.operation_type = operation_type;
        this.x = x;
        this.y = y;
    }

    public void setOperation_type(Operands operation_type) {
        this.operation_type = operation_type;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Operands getOperation_type() {
        return operation_type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    @Override
    public String toString() {
        return "OperationClass{" +
                "operation_type=" + operation_type +
                ", x=" + x +
                ", y=" + y +
                '}';
    }


}
