package br.com.fiap.apiproduction.controller;

import br.com.fiap.apiproduction.service.ProductionService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/production")
@AllArgsConstructor
public class ProductionController {

    private final ProductionService orderUseCase;

    @GetMapping("/orders-queue")
    public ResponseEntity<JsonNode> getOrdersQueue() {
        return new ResponseEntity<>(orderUseCase.getAllOrders(), HttpStatus.OK);
    }
}
