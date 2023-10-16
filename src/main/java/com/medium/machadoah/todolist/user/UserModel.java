package com.medium.machadoah.todolist.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data // adiciona getters and setters para todos os atributos!
@Entity (name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime cratedAt;

    /**
     *
     * Métodos de acesso a atributos:
     * ------------------------------
     * setters -> inserem valores de um atributo private
     * getters -> retornam os valores de um atributo private
     */


}
