/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aes.calculadora.services;

import com.aes.calculadora.model.Operando;
import com.aes.calculadora.model.Resultado;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Wilson Forero
 */
//@Component
//@Transactional
public class CalcImpl implements Calc {

    /*
    final private EntityManager context;

    @Inject
    public CalcImpl(EntityManager context) {
        this.context = context;
    }
     */
    
    @Override
    public GetCalcAddResponse getCalcAdd(int num1, int num2) {
        Resultado resultado = new Resultado();
        resultado.setResultado(num1 + num2);
        return GetCalcAddResponse.respond200WithApplicationJson(resultado);
    }

    @Override
    public DeleteCalcSubResponse deleteCalcSub(Operando entity) {
        Resultado resultado = new Resultado();
        resultado.setResultado(entity.getNum1() - entity.getNum2());
        return DeleteCalcSubResponse.respond200WithApplicationJson(resultado);
    }

    @Override
    public PostCalcMulResponse postCalcMul(Operando entity) {        
        Resultado resultado = new Resultado();
        resultado.setResultado(entity.getNum1() * entity.getNum2());
        return PostCalcMulResponse.respond200WithApplicationJson(resultado);
    }

    @Override
    public PutCalcDivResponse putCalcDiv(int num1, int num2) {
        Resultado resultado = new Resultado();
        resultado.setResultado(num1 / num2);
        return PutCalcDivResponse.respond200WithApplicationJson(resultado);
    }

    @Override
    public GetCalcAddResponse getCalcPr() {
        Resultado resultado = new Resultado();
        resultado.setResultado(0);
        return GetCalcAddResponse.respond200WithApplicationJson(resultado);
    }

}
