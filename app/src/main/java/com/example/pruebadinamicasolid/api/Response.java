package com.example.pruebadinamicasolid.api;

import com.example.pruebadinamicasolid.pojo.IndicadorEconomico;

public class Response {
    public ResponseState state;
    public boolean hasError;
    public RequestType requestType;
    public IndicadorEconomico result;
    public String errorMessage;
    public enum ResponseState {
        SUCCESS,
        FAILURE,
        NO_CONNECTION
    }
    public enum RequestType {
        SEARCH_FOR_INDICADOR
    }
}//class

