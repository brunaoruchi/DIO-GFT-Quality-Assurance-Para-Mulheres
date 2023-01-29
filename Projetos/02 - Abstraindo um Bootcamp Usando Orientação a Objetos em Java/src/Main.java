import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Selenium");
        curso2.setDescricao("Descrição curso Selenium");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Quality Assurance");
        mentoria.setDescricao("Descrição mentoria Quality Assurance");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT Quality Assurance Para Mulheres");
        bootcamp.setDescricao("Descrição Bootcamp GFT Quality Assurance Para Mulheres");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bruna:" + devBruna.getConteudosInscritos());
        devBruna.progredir();
        devBruna.progredir();
        devBruna.progredir();
        devBruna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bruna:" + devBruna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Bruna:" + devBruna.getConteudosConcluidos());
        System.out.println("XP:" + devBruna.calcularTotalXp());

        System.out.println("-------");

    }

}