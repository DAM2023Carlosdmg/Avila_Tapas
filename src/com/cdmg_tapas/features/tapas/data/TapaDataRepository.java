package com.cdmg_tapas.features.tapas.data;

import com.cdmg_tapas.features.tapas.domain.Tapa;
import com.cdmg_tapas.features.tapas.domain.TapaRepository;

import java.util.ArrayList;

public class TapaDataRepository implements TapaRepository {

    //ATRIBUTO STATICO TIPO TAPADATAREPOSITORY LLAMDAO INSTANCE
    private static TapaDataRepository instance = null;

    private ArrayList<Tapa> localTapas = new ArrayList<>();

    //INTRODUCIR TAPAS
    private void initData(){
        localTapas.add(new Tapa("1","ChoriPan","50","80","50","Chorizo y pan"));
        localTapas.add(new Tapa("2","Pajaritos","800","100","1500","Salchichas y baecon"));

    }

    public TapaDataRepository(){
        initData();
    }

    //METODO DEVOLVER TODAS TAPAS
    @Override
    public ArrayList<Tapa> obtainTapas(){
        return localTapas;
    }

    //METODO DEVOLVER UNA TAPA
    @Override
    public Tapa obtainTapa(String tapaId){
        for(Tapa tapa : localTapas){
            if (tapa.getId().equals(tapaId)){
                return tapa;
            }
        }
        return  null;
    }

    //METODO TIPO TAPADATAREPOSITORY PATRÓN SINGLETON
    public static TapaDataRepository newInstance(){
        if(instance == null){
            instance = new TapaDataRepository();
        }
        return instance;
    }

}
