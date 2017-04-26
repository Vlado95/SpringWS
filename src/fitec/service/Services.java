/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitec.service;

import java.util.List;

import fitec.dba.dao.IDao;
import fitec.dba.metier.Metier;

/**
 *
 * @author Fitec
 */
public abstract class Services<T extends Metier> {

	private static final String version = "2.0" ;

    protected IDao<T> dao;

    
    public static String getVersion() {
		return version;
	}

	public void insert(T m) {
        dao.insert(m);
    }

    public void update(T m) {
        dao.update(m);
    }

    public List<T> liste(T m) {
        List<T> l = dao.selectAll();
        return l;
    }

    public IDao<T> getDao() {
        return dao;
    }
    
    public void delete(T m) throws Exception {
        dao.delete(m);
    }
    
    public List<T> selectLike(String expr) {
        return dao.searchLike(expr);
    }
}
