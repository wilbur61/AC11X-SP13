package com.example.AC11demo.model;

import jakarta.persistence.*;

import lombok.*;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String name;
   @Column(unique = true)
   private Long accountNo;
   private Long marks;
}
