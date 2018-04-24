package controller;

import junit.framework.TestCase;
import model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tudorstanila on 24/04/2018.
 */
public class StoreControllerTestIntegration extends TestCase {
    private StoreController ctrl;

    public void setUp() throws Exception{
        super.setUp();
        this.ctrl = new StoreController();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testIntegrationBigBang() throws Exception {
        ctrl.addProduct(new Product(100,"a","Prod",1));
        assertTrue(ctrl.stockSituation().size()==1);

        ctrl.addProduct(new Product(101,"b","aliment",5));
        ctrl.addProduct(new Product(102,"c","aliment",5));
        ctrl.addProduct(new Product(103,"d","telefon",2));
        assertTrue(ctrl.getProductsCategory("aliment").size()==2);

        List<Product> stock =ctrl.stockSituationProduct("a");
        int q = 0;
        for(Product p : stock){
            q+=p.getQuantity();
        }
        assertTrue(q==1);
    }
}