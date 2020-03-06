package com.example.pruebadinamicasolid.utils;

import com.example.pruebadinamicasolid.pojo.IndicadorEconomico;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IndicadorEconomicoApi {

    @GET("{tipoIndicador}/{fechaIndicador}")
    Call<IndicadorEconomico> getIndicadorEconomico(@Path("tipoIndicador") String tipoIndicador,
                                                   @Path("fechaIndicador") String fechaIndicador);

}
