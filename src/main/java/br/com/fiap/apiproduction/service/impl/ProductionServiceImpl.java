package br.com.fiap.apiproduction.service.impl;

import br.com.fiap.apiproduction.client.OrderClient;
import br.com.fiap.apiproduction.service.ProductionService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    private OrderClient ordersClient;
    private ObjectMapper objectMapper = new ObjectMapper();

    public JsonNode getAllOrders() {
        ResponseEntity<String> response = ordersClient.getAllOrders();

        if (response.getStatusCode() == HttpStatus.OK) {
            try {
                JsonNode rootNode = objectMapper.readTree(response.getBody());
                return rootNode;
            } catch (JsonProcessingException e) {
            }
        }

        return objectMapper.nullNode();
    }
}