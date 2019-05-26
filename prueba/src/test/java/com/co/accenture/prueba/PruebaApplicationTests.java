package com.co.accenture.prueba;

import com.co.accenture.prueba.model.Address;
import com.co.accenture.prueba.model.Products;
import com.co.accenture.prueba.model.Store;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PruebaApplicationTests extends AbstractTest {

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void getProductsList() throws Exception {
        String uri = "/store/getAllStores";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();

        assertEquals(200, status);

        String content = mvcResult.getResponse().getContentAsString();
        Store[] stores = super.mapFromJson(content, Store[].class);
        assertTrue(stores.length > 0);
    }

    @Test
    public void insertStore() throws Exception {
        String uri = "/store/saveStore";
        List<Store> listStores = new ArrayList<Store>();

        listStores.add(setValuesStore());

        String inputJson = super.mapToJson(listStores);

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content(inputJson)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(204, status);


    }

    private Store setValuesStore() {
        Store store = new Store();
        List<Products> listProduct = new ArrayList<>();
        Products product = new Products();
        Address addres = new Address();

        //Seteamos los datos de la direccion
        addres.setCountry("Colombia");
        addres.setCity("Medellin");
        addres.setDescription("descripcion prueba");

        //Setemos los valores de los productos
        product.setName("producto prueba");
        product.setDescription("Descripción del producto de prueba");
        product.setPrice("2.500.000");
        product.setCurrency("COP");

        listProduct.add(product);


        //seteamos los datos de la tienda
        store.setName("Tienda de la estquina");
        store.setDescription("Prueba por unit");
        store.setUrl("www.prueba.com");
        store.setNumberPhone("4564616546");
        store.setAddress(addres);
        store.setProducts(listProduct);


        return store;
    }

}
