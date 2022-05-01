package com.idat.ec2_PieroNicolasQuispePozo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ec2_PieroNicolasQuispePozo.model.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	Usuario findByUsuario(String usuario);

}
