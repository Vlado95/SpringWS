/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fitec.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fitec.dba.factory.HbnFactory;
import fitec.dba.metier.Livre;


/**
 *
 * @author Fitec
 */
@Service
public class ServiceLivre extends Services<Livre>{

    @Autowired
    public void setDao(HbnFactory dao) {
        this.dao = dao.getDaoLivre();
    }
    
}
