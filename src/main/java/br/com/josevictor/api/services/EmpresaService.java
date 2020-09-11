package br.com.josevictor.api.services;

import java.util.Optional;

import br.com.josevictor.api.entities.Empresa;

public interface EmpresaService {

	/**
	 * Retorna uma empresa via um CNPJ.
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);

	/**
	 * Cadastra uma nova empresa no banco de dados.
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);

}
