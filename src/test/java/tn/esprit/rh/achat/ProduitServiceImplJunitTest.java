package tn.esprit.rh.achat;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esprit.rh.achat.entities.Produit;
import tn.esprit.rh.achat.repositories.ProduitRepository;
import tn.esprit.rh.achat.services.ProduitServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertSame;


@ExtendWith(MockitoExtension.class)
public class ProduitServiceImplJunitTest {


    @Mock
    private ProduitRepository produitRepository;

    @InjectMocks
    private ProduitServiceImpl produitService;


    @Test
    void testRetrieveProduits() {

        Produit produit = new Produit(Long.valueOf("1"),"1","libelle",10,new Date(),new Date(),null,null, null);

        List<Produit> produits=new ArrayList<Produit>();
        produits.add(new Produit(Long.valueOf("2"),"1","libelle",10,new Date(),new Date(),null,null, null));
        produits.add(new Produit(Long.valueOf("3"),"1","libelle",10,new Date(),new Date(),null,null, null));

       /* Mockito.when(produitRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(produit));
        Produit user1 = produitService.retrieveProduit(Long.valueOf("2"));
        Assertions.assertNotNull(user1);*/

    Mockito.when(produitRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(produit));
    Produit retrievedProduit = produitService.retrieveProduit(Long.valueOf("1")); // Use the same ID as mocked
    assertSame(produit, retrievedProduit); // Assert that the retrieved Produit is the same as the one from the mock


    }


}
