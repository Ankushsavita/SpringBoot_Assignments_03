package com.example.UserManagementSystemapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="tbl_Userdata")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="USER_ID")
    private int userId;

    @Column(name="USERNAME")
    private String userName;

    @Column(name="DATEOFBIRTH")
    private String dateOfBirth;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PHONE_NO")
    private String phoneNo;

    @Column(name="DATE")
    private String date;

    @Column(name="TIME")
    private String time;
}
