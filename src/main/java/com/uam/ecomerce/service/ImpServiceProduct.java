package com.uam.ecomerce.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.uam.ecomerce.model.Product;
import com.uam.ecomerce.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
@Component("serviceProduct")
public class ImpServiceProduct implements IServiceProduct{

    @Autowired
    private IProductRepository repo;

    @Value("${ruta.archivos.imagen}")
    private String ruta;

    @Override
    public List<Product> getListProduct() {
        return repo.findAll();
    }

    @Override
    public Product findById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Product saveProduct(String productDto, MultipartFile image)
            throws IOException {
        byte[] imgByte = image.getBytes();
        Path path = Paths.get(ruta + "//" + image.getOriginalFilename());
        if (!Files.exists(path)) {
            Files.write(path,imgByte);
        }
        ObjectMapper objectMapper = new ObjectMapper();
        Product product = objectMapper.readValue(productDto, Product.class);
        product.setImagen(image.getOriginalFilename());
        return repo.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Product saveProductJson(Product product) {
        return repo.save(product);
    }

    @Override
    public List<Product> getProductDisplay() {
        return repo.getProductDisplay();
    }

    @Override
    public List<Product> getListProduct(Long idCategory) {
        return repo.getListProduct(idCategory);
    }


}
