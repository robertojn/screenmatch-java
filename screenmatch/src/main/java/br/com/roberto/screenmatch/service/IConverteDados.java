package br.com.roberto.screenmatch.service;

public interface IConverteDados {
    public <T> T obterDados(String json, Class<T> classe);
}
