package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ProduitRepo;
import com.example.demo.entities.Produit;

@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	ProduitRepo produitRepo;
	
	@Override
	public Produit saveProduit(Produit p) {
		
		return produitRepo.save(p);
	}

	@Override
	public Produit updateProduit(Produit p) {
		
		return produitRepo.save(p);
	}

	@Override
	public void deleteProduit(Produit p) {
		 produitRepo.delete(p);;

	}

	@Override
	public void deleteProduitById(Long id) {
		 produitRepo.deleteById(id);
		
	}

	@Override
	public Produit getProduit(Long id) {
		return produitRepo.findById(id).get();
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitRepo.findAll();
	}

}
