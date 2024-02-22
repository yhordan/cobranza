package com.leonxiiicobranza.cobranza.DAO;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.leonxiiicobranza.cobranza.modelo.app_cuenta_credito;



public interface app_cuenta_credito_paginacionDAO  extends PagingAndSortingRepository<app_cuenta_credito,String>{

	    //List<Product> findAllByPrice(double price, Pageable pageable);
		public Page<app_cuenta_credito> findByIdcuentacreditoContaining(String id,Pageable pageable);
		
		
	

}
