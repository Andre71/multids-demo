package com.sctrcd.multidsdemo.domain.foo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(schema = "foo")
public class Foo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String socialSecurityNumber;

    public Foo(String name) {
        this.name = name;
    }

}
