package com.idat.ec2_PieroNicolasQuispePozo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.ec2_PieroNicolasQuispePozo.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{ 
	

}
