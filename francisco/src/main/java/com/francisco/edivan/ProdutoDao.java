package com.francisco.edivan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // faz a classe se comportar como DAO
public interface ProdutoDao extends JpaRepository<Produto, Long>{

}
