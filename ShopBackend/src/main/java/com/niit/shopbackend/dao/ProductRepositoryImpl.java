package com.niit.shopbackend.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.shopbackend.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

	private SessionFactory sessionFactory;
	
	public boolean addProduct(Product product) {
		
		Session session=sessionFactory.getCurrentSession();
		try {
			session.save(product);
			return true;
		}
		catch(HibernateException e) {
			e.printStackTrace();
		
			return false;
		}
	}

	public boolean updateProduct(Product product) {
		
		Session session=sessionFactory.getCurrentSession();
		try {
			session.update(product);
			return true;
		}
		catch(HibernateException e) {
			return false;
		}
		
	}

	public boolean deleteProduct(int productId) {

		Session session=sessionFactory.getCurrentSession();
		try {
			session.delete(getProductById(productId));
			return true;
		}
		catch(HibernateException e) {
			return false;
		}
	}
		
	public List<Product> getAllProduct() {
		
		Session session=sessionFactory.getCurrentSession();
		try { 
			Query query=session.createQuery("from Product");
			List<Product> productList=(List<Product>)query.getResultList();
			return productList;
		}
		catch(HibernateException e){
			e.printStackTrace();
			return null;	
		}
	}

	public Product getProductById(int productId) {
	   
		 Session session=sessionFactory.getCurrentSession();
		 try {
			Product product=(Product)session.get(Product.class, productId);
		     return product;
		 }
		 
		catch(HibernateException e) {
			e.printStackTrace();	
			return null;
		}	
	}
}
