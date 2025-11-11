package dev.java.ecommerce.cartservice.service;

import dev.java.ecommerce.cartservice.client.PlatziStoreClient;
import dev.java.ecommerce.cartservice.client.response.PlatziProductResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final PlatziStoreClient platziStoreClient;

    public List<PlatziProductResponse> getAllProducts() {
        return platziStoreClient.getAllProducts();
    }

    public PlatziProductResponse getProductById(Long id) {
        return platziStoreClient.getProductById(id);
    }

}
