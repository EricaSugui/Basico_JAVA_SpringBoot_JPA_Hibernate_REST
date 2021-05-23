package com.curso.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.database.entities.Aluno;
import com.curso.database.entities.Curso;
import com.curso.database.entities.GradeCurricular;
import com.curso.database.repositories.AlunoRepository;
import com.curso.database.repositories.CursoRepository;
import com.curso.database.repositories.GradeCurricularRepository;

@SpringBootApplication
public class TesteDatabaseApplication implements CommandLineRunner{

	@Autowired
	private CursoRepository cursoRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private GradeCurricularRepository gradeCurricularRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Curso curso1 = new Curso("Graduação em TI", "Exatas");
		Curso curso2 = new Curso("Graduação em Economia", "Humanas");
		Curso curso3 = new Curso("Graduação em Administração", "Humanas");
		Curso curso4 = new Curso("Graduação em Educação Física", "Biológicas");
		Curso curso5 = new Curso("Graduação em Educação Continuada", "Humanas");
		Curso curso6 = new Curso("Graduação em Física", "Exatas");
		
		cursoRepository.save(curso1);
		cursoRepository.save(curso2);
		cursoRepository.save(curso3);
		cursoRepository.save(curso4);
		cursoRepository.save(curso5);
		cursoRepository.save(curso6);
		
//		curso6.setNome("Graduação em Física - Nova");
//		cursoRepository.save(curso6);
		
//		curso2.setNome("Graduação em Administração");
//		cursoRepository.save(curso2);
		
//		cursoRepository.delete(curso1);
//		cursoRepository.deleteById(2);
		
//		List<Curso> listaDeCursos = cursoRepository.findAll();
//		listaDeCursos.forEach(curso -> System.out.println(curso));
		
//		Optional<Curso> cursoProcurado = cursoRepository.findById(3);
//		Curso cursoFinal = cursoProcurado.orElse(null);
//		
//		System.out.println("O nome do curso procurado é: " + cursoFinal.getNome());
		
//		List<Curso> cursosPorNome = cursoRepository.findCursoByNome("Graduação em Administração");
//		cursosPorNome.forEach(curso -> System.out.println(curso));
//		
//		List<Curso> cursosPorNomeContendo = cursoRepository.findCursoByNomeContaining("Economia");
//		cursosPorNomeContendo.forEach(curso -> System.out.println(curso));
//		
//		List<Curso> cursosPorNomeLike = cursoRepository.findCursoByNomeLike("%Educ%");
//		cursosPorNomeLike.forEach(curso -> System.out.println(curso));
		
//		List<Curso> cursosPorNomeLike = cursoRepository.findCursoByNomeLikeIgnoreCase("%Educ%");
//		cursosPorNomeLike.forEach(curso -> System.out.println(curso));
		
//		List<Curso> cursosPorNomeQuery = cursoRepository.findByQueryNome();
//		cursosPorNomeQuery.forEach(curso -> System.out.println(curso));
		
//		List<String> cursosPorNomeAreaQuery = cursoRepository.findByQueryNomePorArea();
//		cursosPorNomeAreaQuery.forEach(curso -> System.out.println(curso));
		
//		List<String> cursosPorNomeAreaInfQuery = cursoRepository.findByQueryNomePorAreaInformada("Humanas", "Graduação em Administração");
//		cursosPorNomeAreaInfQuery.forEach(curso -> System.out.println(curso));
//		
//		List<String> cursosPorNomeAreaParam = cursoRepository.findByQueryNomePorAreaParametros("Humanas", "Graduação em Economia");
//		cursosPorNomeAreaParam.forEach(curso -> System.out.println(curso));
		
		Aluno aluno1 = new Aluno("José", curso1);
		Aluno aluno2 = new Aluno("Aline", curso1);
		Aluno aluno3 = new Aluno("Humberto", curso4);
		
		alunoRepository.save(aluno1);
		alunoRepository.save(aluno2);
		alunoRepository.save(aluno3);
		
		GradeCurricular grade1 = new GradeCurricular("Graduação em Games", aluno1);
		GradeCurricular grade2 = new GradeCurricular("Graduação em Academia de rua", aluno3);
		
		gradeCurricularRepository.save(grade1);
		gradeCurricularRepository.save(grade2);
		
	}

	

}
