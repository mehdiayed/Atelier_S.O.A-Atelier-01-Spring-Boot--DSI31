package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Repository.ProduitRepo;
import com.example.demo.entities.Produit;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired //injection des depandance 
	private ProduitRepo produitRepo;
	
	
	// faire des test avec Junit
	@Test 
	public void testCreateProduit() {
	Produit prod = new Produit("ASUS",2200.500,new Date());
	produitRepo.save(prod);
	}
	
	@Test
	public void testFindProduit()
	{
	Produit p = produitRepo.findById(1L).get();

	System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit()
	{
	Produit p = produitRepo.findById(1L).get();
	p.setPrixProduit(1000.0);
	produitRepo.save(p);
	}
	
	@Test
	public void testDeleteProduit()
	{	
	produitRepo.deleteById(1L);
	}
	
	@Test
	public void testListerTousProduits()
	{
	List<Produit> prods = produitRepo.findAll();
	for (Produit p : prods)
	{
	System.out.println(p);
	}

	}
	
	@Test
	void contextLoads() {
		
	}

}
