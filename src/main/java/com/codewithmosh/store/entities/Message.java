package com.codewithmosh.store.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Message {
    private String text;
}

//Trước đây bạn phải tự viết constructor và gán từng field một.
//Với class User, đoạn đó trông như thế này:
//public class User {
//    private Long id;
//    private String name;
//    private String email;
//    private String password;
//    private List<Address> addresses;
//    private Profile profile;
//    private Set<Product> favoriteProducts;
//
//    public User(Long id, String name, String email, String password,
//                List<Address> addresses, Profile profile, Set<Product> favoriteProducts) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//        this.addresses = addresses;
//        this.profile = profile;
//        this.favoriteProducts = favoriteProducts;
//    }
//}

//Sau khi dùng Lombok, cả constructor đó được thay bằng một annotation:
//@AllArgsConstructor
//public class User {
//    private Long id;
//    private String name;
//    private String email;
//    private String password;
//    private List<Address> addresses;
//    private Profile profile;
//    private Set<Product> favoriteProducts;
//}