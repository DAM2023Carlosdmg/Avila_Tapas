package com.cdmg_tapas.features.tapas.domain;

import java.util.ArrayList;

public interface TapaRepository {

    public ArrayList<Tapa> obtainTapas();
    public Tapa obtainTapa(String tapaId);
    Tapa deleteTapa(String tapaId);
    void saveTapa(Tapa tapa);

    void updateTapa(Tapa tapa);

}
