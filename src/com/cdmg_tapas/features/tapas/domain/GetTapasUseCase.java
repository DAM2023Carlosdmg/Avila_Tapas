package com.cdmg_tapas.features.tapas.domain;

import java.util.ArrayList;

public class GetTapasUseCase {

    //IMPLEMENTAMOS INTTERFAZ
    private TapaRepository tapaRepository;

    //CONSTRUCTOR CASO DE USO
    public GetTapasUseCase(TapaRepository tapaRepository) {
        this.tapaRepository = tapaRepository;
    }

    //METODO EXECUTE DEVUELVE LA INFORMACION DEL METODO OBTAIN TAPAS
    //POR LA INTERFAZ TAPAREPOSITORY
    public ArrayList<Tapa> execute(){
        return tapaRepository.obtainTapas();
    }

}
