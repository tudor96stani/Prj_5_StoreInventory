package controller;

import junit.framework.TestCase;
import model.Product;

/**
 * Created by tudorstanila on 22/03/2018.
 */
public class StoreControllerTest extends TestCase {

    private StoreController ctrl;

    public void setUp() throws Exception{
        super.setUp();
        ctrl = new StoreController();
    }
    public void testAddProduct() throws Exception {

        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"Prod","Prod",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

}