import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor inserir o nome e o cpf do cliente.");
        cliente.nome = entrada.nextLine();
        cliente.cpf = entrada.nextLong();

        // valores estaticos
        // promocao 1
        HardwareBasico processadorProm1 = new HardwareBasico();
        HardwareBasico ramProm1 = new HardwareBasico();
        HardwareBasico armazenamentoProm1 = new HardwareBasico();
        SistemaOperacional sistemaProm1 = new SistemaOperacional();

        processadorProm1.nome = "Pentium Core i3";
        processadorProm1.capacidade = 2200;
        
        ramProm1.nome = "Memória RAM";
        ramProm1.capacidade = 8;

        armazenamentoProm1.nome = "HD";
        armazenamentoProm1.capacidade = 0.5f;

        sistemaProm1.nome = "Linux Ubuntu";
        sistemaProm1.tipo = 32;

        // promocao 2
        HardwareBasico processadorProm2 = new HardwareBasico();
        HardwareBasico ramProm2 = new HardwareBasico();
        HardwareBasico armazenamentoProm2 = new HardwareBasico();
        SistemaOperacional sistemaProm2 = new SistemaOperacional();

        processadorProm2.nome = "Pentium Core i5";
        processadorProm2.capacidade = 3370;
        
        ramProm2.nome = "Memória RAM";
        ramProm2.capacidade = 16;

        armazenamentoProm2.nome = "HD";
        armazenamentoProm2.capacidade = 1;

        sistemaProm2.nome = "Windows 8";
        sistemaProm2.tipo = 64;

        // promocao 3
        HardwareBasico processadorProm3 = new HardwareBasico();
        HardwareBasico ramProm3 = new HardwareBasico();
        HardwareBasico armazenamentoProm3 = new HardwareBasico();
        SistemaOperacional sistemaProm3 = new SistemaOperacional();

        processadorProm3.nome = "Pentium Core i7";
        processadorProm3.capacidade = 4500;
        
        ramProm3.nome = "Memória RAM";
        ramProm3.capacidade = 32;

        armazenamentoProm3.nome = "HD";
        armazenamentoProm3.capacidade = 2; 

        sistemaProm3.nome = "Windows 10";
        sistemaProm3.tipo = 64;

        Computador[] computadores = new Computador[3];
        computadores[0] = new Computador("Positivo", 3300, processadorProm1, ramProm1, armazenamentoProm1, sistemaProm1);
        computadores[1] = new Computador("Acer", 8800, processadorProm2, ramProm2, armazenamentoProm2, sistemaProm2 );
        computadores[2] = new Computador("Vaio", 4800, processadorProm3, ramProm3, armazenamentoProm3, sistemaProm3);

        MemoriaUSB memoriaUSBprom1 = new MemoriaUSB();
        MemoriaUSB memoriaUSBprom2 = new MemoriaUSB();
        MemoriaUSB memoriaUSBprom3 = new MemoriaUSB();

        memoriaUSBprom1.nome = "Pen-drive";
        memoriaUSBprom2.nome = "Pen-drive";
        memoriaUSBprom3.nome = "HD Externo";

        memoriaUSBprom1.capacidade = 16;
        memoriaUSBprom2.capacidade = 32;
        memoriaUSBprom3.capacidade = 1;

        computadores[0].addMemoriaUSB(memoriaUSBprom1);
        computadores[1].addMemoriaUSB(memoriaUSBprom2);
        computadores[2].addMemoriaUSB(memoriaUSBprom3);


        System.out.println("================================================================");
        System.out.println("Computadores disponiveis.");
        
        for (int i = 0; i < computadores.length; i++) {

            System.out.println("Promoção "+(i+1));
            computadores[i].mostraPCConfigs();
            System.out.println("================================================================");
        }

        int resposta = 1;
        int promocao;
        int numCompras = 0;
        float[] valoresCompra = new float[100];

        
        while(resposta != 0) {
            System.out.println();
            System.out.println("Inserir o numero da promocao. Caso queira finalizar a compra digite 0.");
            resposta = entrada.nextInt();

            if(resposta != 0)
            {
                promocao = resposta-1;
                valoresCompra[numCompras] = computadores[promocao].preco;
                numCompras++;
                System.out.println("Compra realizada com sucesso.");
            }
            else
            {
                break;
            }
        }

        if (numCompras == 0)
            System.out.println("nenhuma compra realizada.");
        else {
            System.out.println("Total a ser pago: R$ " + cliente.calculaTotalCompra(valoresCompra));
        }

    }
}
