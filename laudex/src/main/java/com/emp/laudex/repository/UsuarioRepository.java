package com.emp.laudex.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.emp.laudex.entity.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>  {
    public Optional<Usuario> findByUsername(String username);
}