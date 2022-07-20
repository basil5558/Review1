package com.shopping.review.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="review")
public class Review {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long reviewId;
	   private String productId;
	   private String username;
	   private String review;

}
