package application.service;

import application.model.Cart;
import application.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    private CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getCarts() {

        List<Cart> lista = new ArrayList<>();
        cartRepository.findAll().forEach(cart -> lista.add(cart));

        return lista;
    }
}
