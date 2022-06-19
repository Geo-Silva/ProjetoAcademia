package projeto.academia2022.repo;

/**
 * 
 * "Open-to-Improvements"
 * Aberto-para-Melhorias
 * 
 */


public @interface OTI {

	public enum OrdemPrioridade {
		CRITICO, IMPORTANTE, TRIVIAL, DOCUMENTAR
	};

	OrdemPrioridade ordemPrioridade() default OrdemPrioridade.IMPORTANTE;

	String item();

	String quemAssume();
	
}
