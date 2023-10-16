package Dao;

import dominio.Seguro;

public interface IseguroDao {

	public boolean agregarSeguro(Seguro nuevo);
	public int getUltimoId();
}
