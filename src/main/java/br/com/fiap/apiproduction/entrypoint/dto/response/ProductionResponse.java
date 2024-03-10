package br.com.fiap.apiproduction.entrypoint.dto.response;

import br.com.fiap.apiproduction.core.Production;

import java.util.List;
import java.util.UUID;

public record ProductionResponse(UUID productionId, String clientCpf, UUID orderId, Boolean isPaymentReceived, Double orderPrice, List<UUID> productId) {

    public static ProductionResponse fromClientResponse(Production production) {
        return new ProductionResponse(production.getProductionId(), production.getClientCpf(), production.getOrderId(), production.getPaymentReceived(),
                production.getOrderPrice(), production.getProductId());
    }

}