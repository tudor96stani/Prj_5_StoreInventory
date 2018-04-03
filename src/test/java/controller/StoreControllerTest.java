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
        ctrl.addProduct(new Product(100,"a","Prod",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

    public void testAddProduct1() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","Prod",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

    public void testAddProduct2() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"","Prod",1));
        assertTrue(ctrl.stockSituation().size()==0);
    }

    public void testAddProduct3() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a;","Prod",1));
        assertTrue(ctrl.stockSituation().size()==0);
    }

    public void testAddProduct4() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"1","Prod",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

    public void testAddProduct5() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"1;","Prod",1));
        assertTrue(ctrl.stockSituation().size()==0);
    }





    public void testAddProduct6() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(-1,"a1","Prod",1));
        assertTrue(ctrl.stockSituation().size()==0);
    }

    public void testAddProduct7() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(Integer.MAX_VALUE,"a1","Prod",1));
        assertTrue(ctrl.stockSituation().size()==0);
    }

    public void testAddProduct8() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(1,"a1","Prod",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }


    public void testAddProduct9() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(Integer.MAX_VALUE-1,"a1","Prod",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

    public void testAddProduct10() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","Prod",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }






    public void testAddProduct11() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","Prod",-1));
        assertTrue(ctrl.stockSituation().size()==0);
    }

    public void testAddProduct12() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","Prod",Integer.MAX_VALUE));
        assertTrue(ctrl.stockSituation().size()==0);
    }


    public void testAddProduct13() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","Prod",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

    public void testAddProduct14() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","Prod",Integer.MAX_VALUE-1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

    public void testAddProduct15() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","Prod",100));
        assertTrue(ctrl.stockSituation().size()==1);
    }



    public void testAddProduct16() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","a",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

    public void testAddProduct17() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","a1",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

    public void testAddProduct18() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","",1));
        assertTrue(ctrl.stockSituation().size()==0);
    }

    public void testAddProduct19() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","a;",1));
        assertTrue(ctrl.stockSituation().size()==0);
    }

    public void testAddProduct20() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","1",1));
        assertTrue(ctrl.stockSituation().size()==1);
    }

    public void testAddProduct21() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a1","1;",1));
        assertTrue(ctrl.stockSituation().size()==0);
    }


    //Lab 3 WBT
    public void testGetByCategoryEmptyList() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        assertTrue(ctrl.getProductsCategory("aliment").size()==0);
    }

    public void testGetByCategoryWithResults() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a","aliment",5));
        ctrl.addProduct(new Product(101,"b","aliment",5));
        ctrl.addProduct(new Product(102,"a","telefon",2));
        assertTrue(ctrl.getProductsCategory("aliment").size()==2);
    }

    public void testGetByCategoryWithoutResult() throws Exception{
        assertTrue(ctrl.stockSituation().size()==0);
        ctrl.addProduct(new Product(100,"a","aliment",5));
        ctrl.addProduct(new Product(101,"b","aliment",5));
        assertTrue(ctrl.getProductsCategory("telefon").size()==0);
    }

}