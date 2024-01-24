package com.cdmg_tapas.features.tapas.presentation;

import com.cdmg_tapas.features.tapas.data.TapaDataRepository;
import com.cdmg_tapas.features.tapas.domain.*;

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

    }
    public static void deleteTapa(String tapaId){
        DeleteTapaUseCase deleteTapaUseCase = new DeleteTapaUseCase(TapaDataRepository.newInstance());
        Tapa tapa = deleteTapaUseCase.execute(tapaId);


    }
    public static void createTapa(Tapa tapa){
        TapaDataRepository tapaDataRepository = TapaDataRepository.newInstance();
        SaveTapaUseCase saveTapaUseCase = new SaveTapaUseCase(tapaDataRepository);
        saveTapaUseCase.execute(tapa);

    }
    public static void updateTapa(Tapa tapa){
        UpdateTapaUseCase updateTapaUseCase = new UpdateTapaUseCase(TapaDataRepository.newInstance());
        updateTapaUseCase.execute(tapa);

    }


}
