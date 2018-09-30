package com.niit.shopbackend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table

public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    
   private int productId;
   private String productName;
   private int productPrice;
   private int productQuantity;
   private String productdDescription;
   private int categoryId;
	
   @JoinColumn(name="categoryId",updatable=false,insertable=false,nullable=false)
   @ManyToOne
   Category category;
   
   public int getProductId() {
	   return productId;
   }
   public void setProductId(int productId) {
	   this.productId=productId;
   }
 
   public String getProductName() {
	   return productName;
   }
   public void setProductName(String productName) {
	   this.productName = productName;
   }
	
   public int getProductQuantity() {
	   return productQuantity;
   }
   public void setProductQuantity(int productQuantity) {
	   this.productQuantity = productQuantity;
   }
   
   public int getProductPrice() {
	   return productPrice;
   }
   public void setProductPrice(int productPrice) {
	   this.productPrice = productPrice;
   }
	
   public String getProductdDescription() {
	   return productdDescription;
   }
   public void setProductdDescription(String productdDescription) {
	   this.productdDescription = productdDescription;
   }
	
	
}
