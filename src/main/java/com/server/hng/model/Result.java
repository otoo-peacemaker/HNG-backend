package com.server.hng.model;

public class Result {
    private String slackUsername;
    private int result;
    private Operands operation_type;


    public Result(String slackUsername, int result, Operands operation_type) {
        this.slackUsername = slackUsername;
        this.operation_type = operation_type;
        this.result = result;
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public Operands getOperation_type() {
        return operation_type;
    }

    public void setOperation_type(Operands operation_type) {
        this.operation_type = operation_type;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Result{" +
                "slackUsername='" + slackUsername + '\'' +
                ", operation_type=" + operation_type +
                ", result=" + result +
                '}';
    }
}
