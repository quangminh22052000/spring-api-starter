package com.codewithmosh.store.controllers;

import com.codewithmosh.store.entities.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// đánh dấu một class là chỗ nhận request HTTP và trả dữ liệu thẳng về cho client,
// thường là JSON. Spring tự chuyển object trả về thành JSON.
public class MessageController {
    @RequestMapping("/hello")
    public Message sayHello() {
        return new Message("Hello World!");
    }
}
