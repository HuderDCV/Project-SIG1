package pe.edu.unsch.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import pe.edu.unsch.entities.Usuario;

@Repository
public interface UsuarioLoginDao extends JpaRepository<Usuario, Serializable>{
	//  new Usuario(u.usuario as usuario, u.password as password, rol.idrol as idusuario, per.idpersona as idpersona )
	@Query("select u "
			+ "from Usuario u inner join u.rolUsuarios ru inner join ru.rol rol inner join u.persona per "
			+ "where u.usuario = ?1 and u.password = ?2")
	public Usuario login(String usuario, String password);
}
