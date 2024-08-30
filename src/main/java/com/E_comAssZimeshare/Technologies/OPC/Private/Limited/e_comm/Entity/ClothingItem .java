package com.E_comAssZimeshare.Technologies.OPC.Private.Limited.e_comm.Entity;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ClothingItem")

public class ClothingItem  {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  @Column(name="id")
   private int id;
   @Column(name="name")
  private String name;
  @Column(name="description")
  private String description;
  @Column(name="price")
  private double price;
}
