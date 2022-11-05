package com.server.hng.controller;

import com.server.hng.model.Operands;
import com.server.hng.model.OperationClass;
import com.server.hng.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.server.hng.model.Operands.addition;

@RestController
@RequestMapping("backend/gng/api/operation")
public class OperationController {


    @PostMapping("/calculate")
    public Result postOperation(@RequestBody OperationClass operand){
        int result = 0;
        switch (operand.getOperation_type()) {
            case addition -> result = operand.getX() + operand.getY();
            case multiplication -> result = operand.getX() * operand.getY();
            case subtraction -> result = operand.getX() - operand.getY();
        }
        return new Result("Peacemaker",result,operand.getOperation_type());
    }
}
