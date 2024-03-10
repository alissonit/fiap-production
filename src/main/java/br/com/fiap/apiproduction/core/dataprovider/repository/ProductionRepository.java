package br.com.fiap.apiproduction.core.dataprovider.repository;

import br.com.fiap.apiproduction.core.Production;

import java.util.List;
import java.util.UUID;

public interface ProductionRepository {

    void createProduction(Production production);
    Production getProductionByProductionId(UUID productionId);
    List<Production> getAllProductions();

}
