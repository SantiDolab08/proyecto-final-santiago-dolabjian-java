package Coderhouse.proyectofinalsantiagodolabjian.controller;


import Coderhouse.proyectofinalsantiagodolabjian.middleware.ResponseHandler;
import Coderhouse.proyectofinalsantiagodolabjian.model.Product;
import Coderhouse.proyectofinalsantiagodolabjian.servise.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    //Create
    @PostMapping
    public ResponseEntity<Object> postProduct(@RequestBody Product product) {
        try {
            System.out.println(product);
            Product productSaved = productService.postProduct(product);
            return ResponseHandler.generateResponse(
                    "Data retrieved successfully",
                    HttpStatus.OK,
                    productSaved
            );
        } catch (Exception e) {
            return ResponseHandler.generateResponse(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    null
            );
        }
    }
}
