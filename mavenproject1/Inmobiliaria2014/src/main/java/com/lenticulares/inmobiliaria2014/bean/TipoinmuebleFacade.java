/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lenticulares.inmobiliaria2014.bean;

import com.lenticulares.inmobiliaria2014.Tipoinmueble;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author danielfuentes
 */
@Stateless
public class TipoinmuebleFacade extends AbstractFacade<Tipoinmueble> {
    @PersistenceContext(unitName = "com.lenticulares_Inmobiliaria2014_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoinmuebleFacade() {
        super(Tipoinmueble.class);
    }
    
}
