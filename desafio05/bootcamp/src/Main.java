import com.desafio.conteudos.Bootcamp;
import com.desafio.conteudos.Curso;
import com.desafio.conteudos.Mentoria;
import com.desafio.dev.Dev;

public class Main { //Aplicação simples para testar o Bootcamp
    public static void main(String[] args) throws Exception {

        //criando os conteúdos
        Curso curso1 = new Curso("curso de java", "descrição curso de java", 20);
        curso1.setNivel("Basico");
        Curso curso2 = new Curso("curso de spring", "descrição curso de spring", 50);
        curso2.setNivel("Avançado");
        
        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", 3);
        mentoria.setNomeMentor("José");

        //criando o Bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        //System.err.println(bootcamp);

        //Criando e manipulando os devs
        Dev devJoazinho = new Dev("Joaozinho");
       
        devJoazinho.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Joaozinho:" + devJoazinho.getConteudosInscritos());
        devJoazinho.progredir();
        devJoazinho.progredir();
        System.out.println("*******************");
        System.out.println("Conteúdos Inscritos do Joaozinho:" + devJoazinho.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos do Joaozinho:" + devJoazinho.getConteudosConcluidos());
        System.out.println("XP total do Joaozinho:" + devJoazinho.getXP());

        System.out.println("-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-//-");




        Dev devMaria = new Dev("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP:" + devMaria.getXP());
    }
}
