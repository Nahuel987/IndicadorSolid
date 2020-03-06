package com.example.pruebadinamicasolid.utils;

import com.example.pruebadinamicasolid.api.CallHandle;
import com.example.pruebadinamicasolid.api.RequestInterfaceApi;
import com.example.pruebadinamicasolid.api.Response;
import com.example.pruebadinamicasolid.pojo.IndicadorEconomico;

import retrofit2.Call;

public class IndicadorEconomicoHandler extends CallHandle {
    private String tipoIndicador, fechaIndicador;
    public IndicadorEconomicoHandler(String tipoIndicador, String
            fechaIndicador){
        this.tipoIndicador = tipoIndicador;
        this.fechaIndicador = fechaIndicador;
    }
    public void getIndicadorEconomico(RequestInterfaceApi objRestRequestInterface) {
        Call<IndicadorEconomico> objCall;
        com.example.pruebadinamicasolid.api.Response objResponse = new com.example.pruebadinamicasolid.api.Response();
        IndicadorEconomicoApi indicadorEconomicoApiEndPoint;
        objResponse.state = com.example.pruebadinamicasolid.api.Response.ResponseState.FAILURE;
        objResponse.hasError = true;
        objResponse.requestType = Response.RequestType.SEARCH_FOR_INDICADOR;
        indicadorEconomicoApiEndPoint =
                RetrofitClient.getRetrofitInstance().create(IndicadorEconomicoApi.class);
        objCall =
                indicadorEconomicoApiEndPoint.getIndicadorEconomico(tipoIndicador,
                        fechaIndicador);

        handleCallBack(objRestRequestInterface, objCall, objResponse);
    }
}
