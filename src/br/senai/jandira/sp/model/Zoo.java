package br.senai.jandira.sp.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Zoo {
    Scanner teclado = new Scanner(System.in);
    Zebra objbjZebra = new Zebra();
    List<Zebra> listZebra = new ArrayList<>();
    public void menu () {

        boolean continuar = true;

        while (continuar) {

            System.out.println("/-/-/-  Bem Vindo -/-/-/");
            System.out.println("1- Cadastrar Zebra");
            System.out.println("2- Listar Zebras");
            System.out.println("3- Sair");
            System.out.println("/-/-/-/-/-/-/-/-/-/-//-/");


            int opcaoUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (opcaoUsuario) {

                case 1:
                    objbjZebra.cadastrarzebra();
                    adcionarZebra(objbjZebra);
                    System.out.println(listZebra.size());
                    break;

                case 2:
                    objbjZebra.listarzebra();
                    listarZebra(objbjZebra);

                    break;

                case 3:

                    continuar = false;
                    break;
            }

        }
    }

        public void adcionarZebra(Zebra zebra){
            listZebra.add (zebra);
        }


        public void ListarZebra(){

            for (Zebra zebra : listZebra){
                System.out.println("Nome da Zebra" + zebra.nome);
                System.out.println("Apelido da Zebra" + zebra.apelido);
                System.out.println("Idade da Zebra" + zebra.idade);


            }



        }





}
