package com.cdmg_tapas.features.tapas.domain;

public class GetTapaUseCase {

    private TapaRepository tapaRepository;

    public GetTapaUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    public Tapa  execute(String tapaId){
        return this.tapaRepository.obtainTapa(tapaId);
    }

}
