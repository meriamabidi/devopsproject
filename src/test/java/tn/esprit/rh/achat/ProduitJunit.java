package tn.esprit.rh.achat;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.services.ProduitServiceImpl;


import java.util.List;



@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ProduitJunit {
    @Autowired
    private ProduitServiceImpl produitService;


    @Test
    @Order(1)
    void testRetrieveProduits() {
        List<Produit> produits = produitService.retrieveAllProduits();
        Assertions.assertEquals(0, produits.size());
    }

}
