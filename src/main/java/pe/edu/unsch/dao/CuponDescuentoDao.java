package pe.edu.unsch.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.CuponDescuento;

@Repository
public interface CuponDescuentoDao extends JpaRepository<CuponDescuento, Serializable> {

}
