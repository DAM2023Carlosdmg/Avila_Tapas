package com.cdmg_tapas.features.tapas.presentation;

import com.cdmg_tapas.features.tapas.data.TapaDataRepository;
import com.cdmg_tapas.features.tapas.domain.GetTapaUseCase;
import com.cdmg_tapas.features.tapas.domain.GetTapasUseCase;
import com.cdmg_tapas.features.tapas.domain.Tapa;

import java.util.ArrayList;

public class MainTapas {

    //METODO OBTENER TODAS LAS TAPAS
    public static void prtintTapas(){
        //INICIALIZAR EL CASO DE USO Y LOS DATOS DE DATAREPOSITORY
        GetTapasUseCase tapasUseCase = new GetTapasUseCase(TapaDataRepository.newInstance());
        //CREAMOS UN OBJETO TAPA DEL ARRAY CON TODAS LAS TAPAS
        //EJECUTARA EL CASO DE USO
        ArrayList<Tapa> tapa = tapasUseCase.execute();
        System.out.println(tapa.toString());
    }
    public static void printTapa(String tapaId){
        GetTapaUseCase tapaUseCase = new  GetTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = tapaUseCase.execute(tapaId);
        System.out.println(tapa.toString());

    }

}
