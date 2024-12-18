package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/view.fxml"));
            Scene scene = new Scene(parent);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

































    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Cadastro de pedido: ");
            System.out.print("Informe o nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Informe o valor do produto: ");
            Double valorProduto = sc.nextDouble();
            System.out.print("Informe se está pago [true|false]: ");
            boolean estaPago = sc.nextBoolean();
            sc.nextLine();
            System.out.print("Informe o nome do cliente: ");
            String nomeCliente = sc.nextLine();
            System.out.print("Informe o telefone p/ contato: ");
            String telefoneCliente = sc.nextLine();
            System.out.print("O produto vai ser parcelado? [true|false]: ");
            boolean temParcela = sc.nextBoolean();
            System.out.print("O produto tem desconto? [true|false]: ");
            boolean temDesconto = sc.nextBoolean();

            if (!temParcela && !temDesconto) {
                Order pedido = new Order(nomeProduto, valorProduto, estaPago, nomeCliente, telefoneCliente);
                System.out.print(pedido.toString());
            } else if (temParcela && !temDesconto) {
                System.out.print("Informe a quantidade de parcelas: ");
                Integer qtdParcelas = sc.nextInt();
                Order pedido = new Order(nomeProduto, valorProduto, qtdParcelas, estaPago, nomeCliente, telefoneCliente);
                System.out.print(pedido.toString());
            } else if (!temParcela && temDesconto) {
                System.out.print("Informe o valor do desconto: ");
                Double qtdDesconto = sc.nextDouble();
                Order pedido = new Order(nomeProduto, valorProduto, qtdDesconto, estaPago, nomeCliente, telefoneCliente);
                System.out.print(pedido.toString());
            } else {
                System.out.print("Informe o valor do desconto: ");
                Double qtdDesconto = sc.nextDouble();
                System.out.print("Informe a quantidade de parcelas: ");
                Integer qtdParcelas = sc.nextInt();
                Order pedido = new Order(nomeProduto, valorProduto, qtdDesconto, qtdParcelas, estaPago, nomeCliente, telefoneCliente);
                System.out.print(pedido.toString());
            }
        } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada de dados invalida");
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }



        /*
         Fluxo da main
         Recebe os dados do executavel
         ser o boleanode parcelo for true -> indica quantas parcelas são, chama o construtor especifico, faz
         a divisão de parcelas,
         cria uma nova Order


   // Order pedido1 = new Order("Vestido", 255.50, true, "Mateus", "85996343862");
    //Order pedido2 = new Order("Calça", 159.00, false, "Jac", "85996097199");

*/
    }
