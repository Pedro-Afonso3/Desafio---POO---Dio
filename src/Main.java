import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Js");
        curso2.setDescricao("Descriçao curso js");
        curso2.setCargaHoraria(4);

        //Conteudo conteudo = new Curso(); -> POLIMORFISMO



        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Preu");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Preu" + dev.getConteudosInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("----------------");
        System.out.println("Conteudos inscritos Preu" + dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos Preu" + dev.getConteudosConcluidos());
        System.out.println(dev.calcularXp());


        System.out.println("-----------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos João" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("----------------");
        System.out.println("Conteudos inscritos Preu" + dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos João" + dev2.getConteudosConcluidos());
        System.out.println(dev2.calcularXp());
    }
}
